package logic;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Map;
import logic.*;
   
public class ParkingSpaceViewer extends JFrame {
    private JTable parkingTable;
    private DefaultTableModel tableModel;
    private ParkingManager manager;

    public ParkingSpaceViewer(ParkingManager manager) {
        this.manager = manager;
        setTitle("Parking Space Viewer");
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Create table model with columns
        String[] columnNames = {"ID", "Location", "Status", "Occupied"};
        tableModel = new DefaultTableModel(columnNames, 0);
        parkingTable = new JTable(tableModel);

        // Add a scroll pane for the table
        JScrollPane scrollPane = new JScrollPane(parkingTable);
        add(scrollPane, BorderLayout.CENTER);

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> refreshParkingData());
        buttonPanel.add(refreshButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Load data initially
        refreshParkingData();
    }

    public void refreshParkingData() {
        // Clear existing data
        tableModel.setRowCount(0);

        // Add all parking spots to the table
        Map<String, ParkingSpot> spots = manager.getSpots();
        for (ParkingSpot spot : spots.values()) {
            Object[] rowData = {
                    spot.getSpotId(),
                    spot.getLocation(),
                    spot.isEnabled() ? "Enabled" : "Disabled",
                    spot.isOccupied() ? "Yes" : "No"
            };
            tableModel.addRow(rowData);
        }
    }
}