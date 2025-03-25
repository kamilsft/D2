package statsVisualiser.gui;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import logic.*;

public class MainUI extends JFrame {
	private CardLayout cardLayout;
	private JPanel mainPanel;
	private JComboBox<String> userTypeBox;
	private JTextField txtUsername, txtEmail;
	private JPasswordField txtPassword;
	private JButton btnLogin, btnBookSpot, btnCancelBooking, btnLogout, btnExtendBooking;
	private JLabel lblWelcome, lblBookingStatus, lblExpirationTime, lblRemainingTime;
	private User currentUser;
	private ParkingBooking currentBooking;
	private Timer bookingTimer;

	private static MainUI instance;

	public static MainUI getInstance() {
		if (instance == null)
			instance = new MainUI();

		return instance;
	}

	public MainUI() {
		setTitle("Parking Management System");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// CardLayout to switch between screens
		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);

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
		btnLogout = new JButton("Logout");

		panel.add(btnBookSpot);
		panel.add(btnExtendBooking);
		panel.add(btnCancelBooking);
		panel.add(btnLogout);

		// Button Actions
		btnBookSpot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleBooking();
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
		JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));

		JLabel lblManagerWelcome = new JLabel("Manager Dashboard", SwingConstants.CENTER);
		panel.add(lblManagerWelcome);

		JButton btnEnableParking = new JButton("Enable Parking Lot");
		JButton btnDisableParking = new JButton("Disable Parking Lot");
		JButton btnApproveUser = new JButton("Approve User");
		JButton btnLogout = new JButton("Logout");

		panel.add(btnEnableParking);
		panel.add(btnDisableParking);
		panel.add(btnApproveUser);
		panel.add(btnLogout);

		btnEnableParking.addActionListener(e -> enableParkingLot());
		btnDisableParking.addActionListener(e -> disableParkingLot());

		btnLogout.addActionListener(e -> cardLayout.show(mainPanel, "Login"));

		return panel;
	}
	
	
	

	// enabling the parking lot
	private void enableParkingLot() {
		if (currentUser instanceof Manager) {
			((Manager) currentUser).enableParkingLot(new ParkingLot("Lot1"));
			JOptionPane.showMessageDialog(this, "Parking lot enabled successfully!");
		} else {
			JOptionPane.showMessageDialog(this, "Access Denied!", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// disabling the parking lot
	private void disableParkingLot() {
		if (currentUser instanceof Manager) {
			((Manager) currentUser).disableParkingLot(new ParkingLot("Lot1"));
			JOptionPane.showMessageDialog(this, "Parking lot disabled successfully!");
		} else {
			JOptionPane.showMessageDialog(this, "Access Denied!", "Error", JOptionPane.ERROR_MESSAGE);
		}
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
				lblWelcome.setText("Welcome, " + currentUser.getName());
				updateBookingStatusDisplay();
				cardLayout.show(mainPanel, "Dashboard");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// Booking Logic with duration
	private void handleBooking() {
		if (currentUser == null) {
			JOptionPane.showMessageDialog(this, "No user logged in!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (currentBooking != null) {
			JOptionPane.showMessageDialog(this, "You already have a booking!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Asking the user for the parking spot
		String spotId = JOptionPane.showInputDialog(this, "Enter Parking Spot ID (e.g., A1, B2):");

		if (spotId == null || spotId.trim().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Invalid parking spot!", "Error", JOptionPane.ERROR_MESSAGE);
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
			JOptionPane.showMessageDialog(this, "Please enter a valid positive number for duration!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		ParkingSpot selectedSpot = new ParkingSpot(spotId, true);
		currentBooking = new ParkingBooking(currentUser, selectedSpot, duration);

		JOptionPane.showMessageDialog(this, "Parking Spot " + currentBooking.getSpot().getSpotId() +
				" Booked until " + currentBooking.getExpirationTimeString() + "!");

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
			JOptionPane.showMessageDialog(this, "Booking for Spot " + currentBooking.getSpot().getSpotId() + " Canceled!");

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