
package statsVisualiser.gui;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import logic.*;


public class MainUI extends JFrame {
	private CardLayout cardLayout;
	private JPanel mainPanel;
	private JComboBox<String> userTypeBox;
	private JTextField txtUsername, txtEmail;
    private JPasswordField txtPassword;
    private JButton btnLogin, btnBookSpot, btnCancelBooking, btnLogout;
    private JLabel lblWelcome;
    private User currentUser;
    private Booking currentBooking;
    private BookingSystem bookingSystem;
    private Command bookingCommand;
    private Command cancelCommand;
	
	
	private static MainUI instance;

	public static MainUI getInstance() {
		if (instance == null)
			instance = new MainUI();

		return instance;
	}
	
	public MainUI() {
        setTitle("Parking Management System");
        setSize(450, 300);
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
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));

        lblWelcome = new JLabel("Welcome, User", SwingConstants.CENTER);
        panel.add(lblWelcome);

        btnBookSpot = new JButton("Book Parking Spot");
        btnCancelBooking = new JButton("Cancel Booking");
        btnLogout = new JButton("Logout");

        panel.add(btnBookSpot);
        panel.add(btnCancelBooking);
        panel.add(btnLogout);

        // Button Actions
        btnBookSpot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleBooking();
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
                cardLayout.show(mainPanel, "Login");
            }
        });

        return panel;
    }
	
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
	            cardLayout.show(mainPanel, "Dashboard");
	        }
	        
	        // initializing the bookingSystem after user logged in
	        bookingSystem = new BookingSystem();
	    } else {
	        JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

    // Booking Logic
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

//	    ParkingSpot selectedSpot = new ParkingSpot(spotId, true);
//	    currentBooking = new Booking(currentUser, selectedSpot); // Passing ParkingSpot object
//	    JOptionPane.showMessageDialog(this, "Parking Spot " + currentBooking.getSpot().getSpotId() + " Booked!");
	    
	    ParkingSpot spot = new ParkingSpot(spotId, true);
	    bookingCommand = new BookingCommand(bookingSystem, currentUser, spot);
	    bookingCommand.execute();
	    
	    currentBooking = bookingSystem.getCurrentBooking();
	    JOptionPane.showMessageDialog(this, "Parking Spot " + currentBooking.getSpot().getSpotId() + " Booked!");

	    
	}


    //  Cancel Logic
	private void handleCancelBooking() {
	    if (currentUser == null) {
	        JOptionPane.showMessageDialog(this, "No user logged in!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    if (currentBooking == null || currentBooking.getSpot() == null) {
	        JOptionPane.showMessageDialog(this, "No active booking to cancel!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    
	    String spotId = currentBooking.getSpot().getSpotId();

	    int confirm = JOptionPane.showConfirmDialog(this, 
	        "Cancel booking for spot " + currentBooking.getSpot().getSpotId() + "?", 
	        "Confirm Cancellation", 
	        JOptionPane.YES_NO_OPTION);

	    if (confirm == JOptionPane.YES_OPTION) {
	    	cancelCommand = new CancellingBookingCommand(bookingSystem, currentBooking);
	    	cancelCommand.execute();
	    	currentBooking = null;
	        JOptionPane.showMessageDialog(this, "Booking for Spot " + spotId + " Canceled!");
	    	
	    }
	}


    public static void main(String[] args) {
        new MainUI();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
