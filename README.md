# Parking Management System

## Overview
The **Parking Management System** is a Java-based application designed to manage parking spots efficiently. It supports multiple user types, including Students, Faculty, Visitors, and Managers, and provides features such as booking, canceling, and managing parking spots. The system is built with modular architecture and follows design principles to ensure scalability, maintainability, and adaptability.

## Features
- **User Management**: Supports different user roles (Student, Faculty, Non-Faculty, Visitor, Manager, SuperManager).
- **Parking Spot Booking**: Allows users to book and cancel parking spots.
- **Manager Dashboard**: Enables managers to monitor and manage parking lots.
- **SuperManager Dashboard**: Provides advanced administrative controls for super managers.
- **SQLite Database Integration**: Uses a local SQLite database for data persistence.

## Project Structure
- **csv-example**: Contains logic for user management and parking system operations.
  - `src/logic`: Core business logic for users, bookings, and parking management.
  - `src/Connections`: Database connection logic using SQLite.
- **GUI-Demo**: Demonstrates the graphical user interface for the system.
  - `src/main/java/statsVisualiser/gui`: Contains the main UI logic for the application.

## Prerequisites
- Java 8 or higher
- SQLite installed locally
- Maven (for managing dependencies in the `GUI-Demo` module)

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd D2
   ```
3. Ensure the SQLite database file (`parkingsystem.db`) is placed in the `resources` folder.
4. Build and run the project:
   - For the `csv-example` module:
     ```bash
     javac -d bin src/**/*.java
     java -cp bin Connections.DatabaseConnection
     ```
   - For the `GUI-Demo` module:
     ```bash
     mvn clean install
     mvn exec:java
     ```

## Setting Up the Database
### 1. Install SQLite Studio
- Visit the [SQLite Studio official website](https://sqlitestudio.pl/).
- Download the appropriate version for your operating system (Windows, macOS, or Linux).
- Install SQLite Studio:
  - **Windows**: Run the downloaded `.exe` file and follow the installation wizard.
  - **macOS/Linux**: Extract the downloaded `.tar.gz` or `.zip` file to a desired location.
- Launch SQLite Studio from your installed applications or extracted folder.

### 2. Create the Database
- Open SQLite Studio.
- Click on the **Database** menu and select **Add a Database**.
- In the dialog box, click the **...** (browse) button.
- Navigate to the `resources` folder (like: `c:\Path\To\Project\D2\resources`).
  - If the `resources` folder does not exist, create it manually.
- Enter `parkingsystem.db` as the file name and click **OK**.
- The newly created `parkingsystem.db` will appear in the SQLite Studio database list. Double-click on it to connect.

### 3. Load the Schema
- Ensure the `schema.sql` file is placed in the `resources` folder (like: `c:\Path\To\Project\D2\resources`).
- In SQLite Studio, right-click on the `parkingsystem.db` database in the left panel and select **Tools > Open SQL Editor**.
- In the SQL editor, click on the **File** menu and select **Open**.
- Navigate to the `resources` folder and open `schema.sql`.
- Once the schema is loaded in the SQL editor, click the **Execute All** button (blue play icon) to create the tables and structure defined in `schema.sql`.

### 4. Verify the Database
- Right-click on `parkingsystem.db` in the left panel and select **Refresh** if you don't already see the tables.
- Expand the `Tables` section under `parkingsystem.db` to verify that the tables from `schema.sql` have been created.

### 5. Use the Database in Your Project
- Ensure the `DatabaseConnection` class in your project points to the `parkingsystem.db` file in the `resources` folder.
- Example connection string in the `DatabaseConnection` class:
  ```java
  String url = "jdbc:sqlite:" + DatabaseConnection.class.getClassLoader().getResource("parkingsystem.db").getPath();
  ```

## Technologies Used
- **Java**: Core programming language.
- **SQLite**: Local database for data persistence.
- **Maven**: Dependency management for the `GUI-Demo` module.

## Contributing
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with a detailed description of your changes.

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Acknowledgments
- **YorkU EECS 3311**: For providing the initial GUI sample code.
- **JFreeChart**: For the charting library used in the GUI module.
