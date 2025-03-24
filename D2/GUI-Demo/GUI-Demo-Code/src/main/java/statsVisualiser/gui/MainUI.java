package statsVisualiser.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;
import java.util.function.Predicate;

import javax.swing.*;

import logic.*;

public class MainUI extends JFrame {
	private CardLayout cardLayout;
	private JPanel mainPanel;
	private JComboBox<String> userTypeBox;
	private JTextField txtUsername, txtEmail;
	private JPasswordField txtPassword;
	private JButton btnLogin, btnBookSpot, btnCancelBooking, btnLogout, btnExtendBooking, btnViewParkingSpaces;
	private JLabel lblWelcome, lblBookingStatus, lblExpirationTime, lblRemainingTime;
	private User currentUser;
	private ParkingBooking currentBooking;
	private Timer bookingTimer;
	private static ParkingManager manager; // Changed to static

	private static MainUI instance;

	public static MainUI getInstance() {
		if (instance == null)
			instance = new MainUI();

		return instance;
	}

	public MainUI() {
		setTitle("Parking Management System");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// CardLayout to switch between screens
		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);

		// Initialize the manager
		if (manager == null) {
			manager = new ParkingManager();
		}

		// Add screens
		mainPanel.add(createLoginPanel(), "Login");
		mainPanel.add(createDashboardPanel(), "Dashboard");
		mainPanel.add(createManagerDashboardPanel(), "ManagerDashboard");
		mainPanel.add(createSuperManagerDashboardPanel(), "SuperManagerDashboard");

		add(mainPanel);
		setVisible(true);
	}

	private JPanel createLoginPanel() {
		JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

		panel.add(new JLabel("Select User Type:"));
		userTypeBox = new JComboBox<>(new String[]{"Student", "Faculty", "NonFaculty", "Visitor", "Manager", "SuperManager"});
		panel.add(userTypeBox);

		panel.add(new JLabel("Username:"));
		txtUsername = new JTextField();
		panel.add(txtUsername);

		panel.add(new JLabel("Email:"));
		txtEmail = new JTextField();
		panel.add(txtEmail);

		panel.add(new JLabel("Password:"));
		txtPassword = new JPasswordField();
		panel.add(txtPassword);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleLogin();
			}
		});

		panel.add(new JLabel());
		panel.add(btnLogin);

		return panel;
	}

	private JPanel createDashboardPanel() {
		JPanel panel = new JPanel(new GridLayout(7, 1, 10, 10));

		lblWelcome = new JLabel("Welcome, User", SwingConstants.CENTER);
		panel.add(lblWelcome);

		lblBookingStatus = new JLabel("No active booking", SwingConstants.CENTER);
		panel.add(lblBookingStatus);

		lblExpirationTime = new JLabel("", SwingConstants.CENTER);
		panel.add(lblExpirationTime);

		lblRemainingTime = new JLabel("", SwingConstants.CENTER);
		panel.add(lblRemainingTime);

		btnBookSpot = new JButton("Book Parking Spot");
		btnExtendBooking = new JButton("Extend Booking");
		btnCancelBooking = new JButton("Cancel Booking");
		btnViewParkingSpaces = new JButton("View Parking Spaces");
		btnLogout = new JButton("Logout");

		panel.add(btnBookSpot);
		panel.add(btnExtendBooking);
		panel.add(btnCancelBooking);
		panel.add(btnViewParkingSpaces);
		panel.add(btnLogout);

		// Button Actions
		btnBookSpot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleBooking();
			}
		});
		btnViewParkingSpaces.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ParkingSpaceViewer viewer = new ParkingSpaceViewer(manager);
				viewer.setVisible(true);
			}
		});
		btnExtendBooking.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleExtendBooking();
			}
		});

		btnCancelBooking.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCancelBooking();
			}
		});

		btnLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (bookingTimer != null) {
					bookingTimer.cancel();
					bookingTimer = null;
				}
				cardLayout.show(mainPanel, "Login");
			}
		});

		// Initially disable the extend button
		btnExtendBooking.setEnabled(false);

		return panel;
	}

	// Other dashboard panels remain the same...
	// creating a dashboard for the manager
	private JPanel createManagerDashboardPanel() {
		// Create info panel to display messages
		JPanel infoPanel = new JPanel(new BorderLayout());
		JTextArea infoArea = new JTextArea(6, 30);
		infoArea.setEditable(false);
		infoArea.setLineWrap(true);
		infoArea.setWrapStyleWord(true);
		JScrollPane infoScrollPane = new JScrollPane(infoArea);
		infoPanel.add(new JLabel("System Messages:"), BorderLayout.NORTH);
		infoPanel.add(infoScrollPane, BorderLayout.CENTER);

		// Add log method to display messages in the info panel
		Consumer<String> logMessage = (message) -> {
			infoArea.append(message + "\n");
			infoArea.setCaretPosition(infoArea.getDocument().getLength());
		};

		// Initialize spots message
		logMessage.accept("System initialized with parking spots A1-A9, B1-B9, C1-C9 (all enabled)");

		JPanel panel = new JPanel(new BorderLayout());

		JLabel lblManagerWelcome = new JLabel("Manager Dashboard", SwingConstants.CENTER);
		lblManagerWelcome.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(lblManagerWelcome, BorderLayout.NORTH);

		JPanel buttonPanel = new JPanel(new GridLayout(5, 1, 10, 10));

		JButton btnAdd = new JButton("Add Spot");
		JButton btnEnable = new JButton("Enable Spot");
		JButton btnDisable = new JButton("Disable Spot");
		JButton btnViewSpaces = new JButton("View Parking Spaces");
		JButton btnLogout = new JButton("Logout");

		buttonPanel.add(btnAdd);
		buttonPanel.add(btnEnable);
		buttonPanel.add(btnDisable);
		buttonPanel.add(btnViewSpaces);
		buttonPanel.add(btnLogout);

		panel.add(buttonPanel, BorderLayout.CENTER);
		panel.add(infoPanel, BorderLayout.SOUTH);

		// Function to validate spot ID format (one letter followed by one digit)
		Predicate<String> isValidSpotFormat = (id) -> {
			if (id == null || id.length() != 2) return false;
			return Character.isLetter(id.charAt(0)) && Character.isDigit(id.charAt(1));
		};

		// Add Spot Button
		btnAdd.addActionListener(e -> {
			String id = JOptionPane.showInputDialog(this,
					"Enter Spot ID to add:\n(Format: One letter followed by one digit, e.g. A6, R5, T7)");

			if (id != null && !id.isEmpty()) {
				if (isValidSpotFormat.test(id)) {
					// Check if max spots limit is reached
					if (manager.getSpotsCount() >= 100) {
						JOptionPane.showMessageDialog(this,
								"Maximum limit of 100 parking spots reached!",
								"Limit Reached", JOptionPane.WARNING_MESSAGE);
						logMessage.accept("Failed to add spot " + id + " - maximum limit reached");
						return;
					}

					if (manager.spotExists(id)) {
						JOptionPane.showMessageDialog(this,
								"Spot " + id + " already exists!",
								"Duplicate Spot", JOptionPane.WARNING_MESSAGE);
						logMessage.accept("Failed to add spot " + id + " - already exists");
					} else {
						Command addCommand = new AddParkingSpotCommand(manager, id);
						addCommand.execute();
						JOptionPane.showMessageDialog(this,
								"Added spot: " + id,
								"Success", JOptionPane.INFORMATION_MESSAGE);
						logMessage.accept("Added new spot: " + id);
					}
				} else {
					JOptionPane.showMessageDialog(this,
							"Invalid spot ID format. Please use one letter followed by one digit (e.g. A6, R5, T7).",
							"Format Error", JOptionPane.ERROR_MESSAGE);
					logMessage.accept("Failed to add spot - invalid format: " + id);
				}
			}
		});

		// Enable Spot Button
		btnEnable.addActionListener(e -> {
			String id = JOptionPane.showInputDialog(this, "Enter Spot ID to enable:");
			if (id != null && !id.isEmpty()) {
				if (isValidSpotFormat.test(id)) {
					if (manager.spotExists(id)) {
						Command enableCommand = new EnableParkingSpotCommand(manager, id);
						enableCommand.execute();
						JOptionPane.showMessageDialog(this,
								"Enabled spot: " + id,
								"Success", JOptionPane.INFORMATION_MESSAGE);
						logMessage.accept("Enabled spot: " + id);
					} else {
						JOptionPane.showMessageDialog(this,
								"Spot " + id + " has not been added. Please add it first using the Add feature.",
								"Spot Not Found", JOptionPane.WARNING_MESSAGE);
						logMessage.accept("Failed to enable spot " + id + " - not found");
					}
				} else {
					JOptionPane.showMessageDialog(this,
							"Invalid spot ID format. Please use one letter followed by one digit (e.g. A1, B2, C3).",
							"Format Error", JOptionPane.ERROR_MESSAGE);
					logMessage.accept("Failed to enable spot - invalid format: " + id);
				}
			}
		});

		// Disable Spot Button
		btnDisable.addActionListener(e -> {
			String id = JOptionPane.showInputDialog(this, "Enter Spot ID to disable:");
			if (id != null && !id.isEmpty()) {
				if (isValidSpotFormat.test(id)) {
					if (manager.spotExists(id)) {
						Command disableCommand = new DisableParkingSpotCommand(manager, id);
						disableCommand.execute();
						JOptionPane.showMessageDialog(this,
								"Disabled spot: " + id,
								"Success", JOptionPane.INFORMATION_MESSAGE);
						logMessage.accept("Disabled spot: " + id);
					} else {
						JOptionPane.showMessageDialog(this,
								"Spot " + id + " has not been added. Please add it first using the Add feature.",
								"Spot Not Found", JOptionPane.WARNING_MESSAGE);
						logMessage.accept("Failed to disable spot " + id + " - not found");
					}
				} else {
					JOptionPane.showMessageDialog(this,
							"Invalid spot ID format. Please use one letter followed by one digit (e.g. A1, B2, C3).",
							"Format Error", JOptionPane.ERROR_MESSAGE);
					logMessage.accept("Failed to disable spot - invalid format: " + id);
				}
			}
		});

		// View Parking Spaces Button
		btnViewSpaces.addActionListener(e -> {
			ParkingSpaceViewer viewer = new ParkingSpaceViewer(manager);
			viewer.setVisible(true);
			logMessage.accept("Manager opened parking space viewer");
		});
		btnLogout.addActionListener(e -> {
			logMessage.accept("Manager logged out");
			cardLayout.show(mainPanel, "Login");
		});

		return panel;
	}

	// super manager dashboard
	private JPanel createSuperManagerDashboardPanel() {
		JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));

		JLabel lblSuperManagerWelcome = new JLabel("Super Manager Dashboard", SwingConstants.CENTER);
		panel.add(lblSuperManagerWelcome);

		JButton btnEnableManager = new JButton("Enable Manager");
		JButton btnDisableManager = new JButton("Disable Manager");
		JButton btnSystemStatus = new JButton("View System Status");
		JButton btnLogout = new JButton("Logout");

		panel.add(btnEnableManager);
		panel.add(btnDisableManager);
		panel.add(btnSystemStatus);
		panel.add(btnLogout);

		btnEnableManager.addActionListener(e -> enableManager());
		btnDisableManager.addActionListener(e -> disableManager());

		btnLogout.addActionListener(e -> cardLayout.show(mainPanel, "Login"));

		return panel;
	}

	// enabling the manager
	private void enableManager() {
		if (currentUser instanceof SuperManager) {
			((SuperManager) currentUser).enableManager(new User("John Doe", 1002, "manager@yorku.ca", "password"));
			JOptionPane.showMessageDialog(this, "Manager enabled successfully!");
		} else {
			JOptionPane.showMessageDialog(this, "Access Denied!", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// disabling the manager
	private void disableManager() {
		if (currentUser instanceof SuperManager) {
			((SuperManager) currentUser).disableManager(new User("John Doe", 1002, "manager@yorku.ca", "password"));
			JOptionPane.showMessageDialog(this, "Manager disabled successfully!");
		} else {
			JOptionPane.showMessageDialog(this, "Access Denied!", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void handleLogin() {
		String userType = (String) userTypeBox.getSelectedItem();
		String username = txtUsername.getText();
		String email = txtEmail.getText();
		String password = new String(txtPassword.getPassword());

		if (userType != null && !username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
			if (userType.equalsIgnoreCase("SuperManager")) {
				currentUser = SuperManager.getInstance();  // Singleton Instance
				lblWelcome.setText("Welcome, SuperManager");
				cardLayout.show(mainPanel, "SuperManagerDashboard");
			} else if (userType.equalsIgnoreCase("Manager")) {
				currentUser = new GeneralManager(username, 2001, email, password); // Use a concrete class
				lblWelcome.setText("Welcome, Manager");
				cardLayout.show(mainPanel, "ManagerDashboard");
			} else {
				currentUser = UserFactory.createUser(userType.toUpperCase(), username, 1001, email, password, 1001, username);
				String[] paymentOptions = {"Credit Card", "Debit Card", "Mobile App"};
				String selection = (String) JOptionPane.showInputDialog(this,
						"Choose your payment method:",
						"Payment Method",
						JOptionPane.QUESTION_MESSAGE,
						null,
						paymentOptions,
						paymentOptions[0]);

				switch (selection) {
					case "Debit Card":
						currentUser.setPaymentStrategy(new DebitCardPaymentsStrategy());
						break;
					case "Mobile App":
						currentUser.setPaymentStrategy(new MobileAppPaymentsStrategy());
						break;
					default:
						currentUser.setPaymentStrategy(new CreditCardPaymentStrategy());
				}
				// setting the pricing strategy based on user type
				switch(userType.toLowerCase()) {
					case "student":
						currentUser.setPricingStrategy(new StudentPricing());
						break;
					case "faculty":
						currentUser.setPricingStrategy(new FacultyPricing());
						break;
					case "nonfaculty":
						currentUser.setPricingStrategy(new NonFacultyPricing());
						break;
					case "visitor":
						currentUser.setPricingStrategy(new VisitorPricing());
						break;
				}

				lblWelcome.setText("Welcome, " + currentUser.getName());
				updateBookingStatusDisplay();
				cardLayout.show(mainPanel, "Dashboard");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// Booking Logic with duration
	// Booking Logic with duration and consistent validation
	private void handleBooking() {
		if (currentUser == null) {
			JOptionPane.showMessageDialog(this, "No user logged in!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (currentBooking != null) {
			JOptionPane.showMessageDialog(this, "You already have a booking!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Function to validate spot ID format (one letter followed by one digit)
		Predicate<String> isValidSpotFormat = (id) -> {
			if (id == null || id.length() != 2) return false;
			return Character.isLetter(id.charAt(0)) && Character.isDigit(id.charAt(1));
		};

		// Asking the user for the parking spot
		String spotId = JOptionPane.showInputDialog(this,
				"Enter Parking Spot ID:\n(Format: One letter followed by one digit, e.g. A1, B2, C3)");

		if (spotId == null || spotId.trim().isEmpty()) {
			return; // User canceled
		}

		// Validate spot format
		if (!isValidSpotFormat.test(spotId)) {
			JOptionPane.showMessageDialog(this,
					"Invalid spot ID format. Please use one letter followed by one digit (e.g. A1, B2, C3).",
					"Format Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Check if spot exists
		if (!manager.spotExists(spotId)) {
			JOptionPane.showMessageDialog(this,
					"Spot " + spotId + " has not been added by the manager. Please select a different spot (e.g. A1, B2, C3).",
					"Spot Not Found", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// Get the actual spot from the manager
		ParkingSpot selectedSpot = manager.getSpots().get(spotId);

		// Check if the spot is enabled
		if (!selectedSpot.isEnabled()) {
			JOptionPane.showMessageDialog(this,
					"Spot " + spotId + " is currently disabled by the manager. Please select a different spot.",
					"Spot Disabled", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// Check if spot is already booked
		if (selectedSpot.isOccupied()) {
			JOptionPane.showMessageDialog(this,
					"Spot " + spotId + " is already occupied. Please select a different spot.",
					"Spot Occupied", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// Ask for booking duration
		String durationStr = JOptionPane.showInputDialog(this, "Enter parking duration in minutes:");
		int duration;
		try {
			duration = Integer.parseInt(durationStr);
			if (duration <= 0) {
				throw new NumberFormatException();
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Please enter a valid positive number for duration!",
					"Invalid Duration", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Calculate cost and process payment
		double cost = currentUser.calculateParkingPrice(duration);
		PaymentStrategy strategy = currentUser.getPaymentStrategy();
		if (strategy == null || !strategy.pay(currentUser, cost)) {
			JOptionPane.showMessageDialog(this, "Payment failed.", "Payment Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Mark the spot as occupied
		selectedSpot.setOccupied(true);

		// Create booking
		currentBooking = new ParkingBooking(currentUser, selectedSpot, duration);

		JOptionPane.showMessageDialog(this,
				"Parking Spot " + currentBooking.getSpot().getSpotId() +
						" Booked until " + currentBooking.getExpirationTimeString() +
						"!\nCharged: $" + cost +
						"\nRemaining balance: $" + currentUser.getBalance(),
				"Booking Successful", JOptionPane.INFORMATION_MESSAGE);

		// Start timer to update booking status
		startBookingTimer();

		// Update UI
		updateBookingStatusDisplay();
	}


	// Handle extending booking
	private void handleExtendBooking() {
		if (currentUser == null) {
			JOptionPane.showMessageDialog(this, "No user logged in!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (currentBooking == null) {
			JOptionPane.showMessageDialog(this, "No active booking to extend!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (currentBooking.isExpired()) {
			JOptionPane.showMessageDialog(this, "Cannot extend an expired booking!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Extend the booking using the state pattern
		currentBooking.extendBooking();

		JOptionPane.showMessageDialog(this, "Booking extended successfully until " +
				currentBooking.getExpirationTimeString());

		// Update UI
		updateBookingStatusDisplay();
	}

	// Cancel Logic
	// Update handleCancelBooking to release the spot when booking is canceled
	private void handleCancelBooking() {
		if (currentUser == null) {
			JOptionPane.showMessageDialog(this, "No user logged in!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (currentBooking == null || currentBooking.getSpot() == null) {
			JOptionPane.showMessageDialog(this, "No active booking to cancel!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		int confirm = JOptionPane.showConfirmDialog(this,
				"Cancel booking for spot " + currentBooking.getSpot().getSpotId() + "?",
				"Confirm Cancellation",
				JOptionPane.YES_NO_OPTION);

		if (confirm == JOptionPane.YES_OPTION) {
			// Mark the spot as unoccupied
			currentBooking.getSpot().setOccupied(false);

			JOptionPane.showMessageDialog(this,
					"Booking for Spot " + currentBooking.getSpot().getSpotId() + " Canceled!",
					"Booking Canceled", JOptionPane.INFORMATION_MESSAGE);

			// Cancel the timer if it's running
			if (bookingTimer != null) {
				bookingTimer.cancel();
				bookingTimer = null;
			}

			currentBooking = null;
			updateBookingStatusDisplay();
		}
	}

	// Start a timer to update booking status
	private void startBookingTimer() {
		// Cancel existing timer if any
		if (bookingTimer != null) {
			bookingTimer.cancel();
			bookingTimer = null;
		}

		// Create new timer
		bookingTimer = new Timer();
		bookingTimer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				SwingUtilities.invokeLater(() -> updateBookingStatusDisplay());
			}
		}, 0, 30000); // Update every 30 seconds
	}

	// Update the booking status display
	private void updateBookingStatusDisplay() {
		if (currentBooking == null) {
			lblBookingStatus.setText("No active booking");
			lblExpirationTime.setText("");
			lblRemainingTime.setText("");
			btnExtendBooking.setEnabled(false);
		} else {
			String statusText = "Booking Status: " + currentBooking.getStatus();
			lblBookingStatus.setText(statusText);

			String expirationText = "Expires at: " + currentBooking.getExpirationTimeString();
			lblExpirationTime.setText(expirationText);

			String remainingText = "Remaining time: " + currentBooking.getRemainingTimeString();
			lblRemainingTime.setText(remainingText);

			// Only enable extend button if booking is not expired
			btnExtendBooking.setEnabled(!currentBooking.isExpired());
		}
	}

	public static void main(String[] args) {
		new MainUI();
	}
}