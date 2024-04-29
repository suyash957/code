
import java.sql.*;

/* 
1. install mysql {sudo apt install mysql-server}
2. install jdbc driver from mysql website
3. create a jaav proect in vs code using command
4. Go to usr/share anf find connector path
5. run command {export CLASSPATH=/usr/share/java/mysql-connector-java-8.0.26.jar:$CLASSPATH}
6. java lib references libraries add connector jar file
 
 */
public class App {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String CREATE_DB = "CREATE DATABASE IF NOT EXISTS Students";
    private static final String USE_DB = "USE Students";
    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Student (Roll_No INT PRIMARY KEY, Name VARCHAR(50), City VARCHAR(50), Grade CHAR(1), Marks DOUBLE)";
    private static final String INSERT_QUERY = "INSERT INTO Student (Roll_No, Name, City, Grade, Marks) VALUES (?, ?, ?, ?, ?)";
    private static final String DELETE_QUERY = "DELETE FROM Student WHERE Roll_No = ?";
    private static final String UPDATE_QUERY = "UPDATE Student SET City = ? WHERE City = ?";
    private static final String SELECT_GREATER_THAN_60_QUERY = "SELECT Name FROM Student WHERE Marks > 60";
    private static final String SELECT_ORDER_BY_MARKS_DESC_QUERY = "SELECT * FROM Student ORDER BY Marks DESC";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(CREATE_DB);
            statement.executeUpdate(USE_DB);
            statement.executeUpdate(CREATE_TABLE);

            insertData(connection);
            deleteRecord(connection, 5);
            updateCity(connection, "Sangli", "Pune");
            displayStudentsGreaterThan60(connection);
            displayStudentsOrderByMarksDesc(connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertData(Connection connection) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(INSERT_QUERY);
        statement.setInt(1, 1);
        statement.setString(2, "Atul");
        statement.setString(3, "Sangli");
        statement.setString(4, "A");
        statement.setDouble(5, 90.50);
        statement.executeUpdate();

        statement.setInt(1, 2);
        statement.setString(2, "Sangram");
        statement.setString(3, "Sangli");
        statement.setString(4, "B");
        statement.setDouble(5, 70.25);
        statement.executeUpdate();

        statement.setInt(1, 3);
        statement.setString(2, "Satya");
        statement.setString(3, "Mumbai");
        statement.setString(4, "B");
        statement.setDouble(5, 61.36);
        statement.executeUpdate();

        statement.setInt(1, 4);
        statement.setString(2, "Jaydeep");
        statement.setString(3, "Pune");
        statement.setString(4, "B");
        statement.setDouble(5, 60.95);
        statement.executeUpdate();

        statement.setInt(1, 5);
        statement.setString(2, "Prashant");
        statement.setString(3, "Sangli");
        statement.setString(4, "C");
        statement.setDouble(5, 55.26);
        statement.executeUpdate();

        statement.setInt(1, 6);
        statement.setString(2, "Abhi");
        statement.setString(3, "Pune");
        statement.setString(4, "C");
        statement.setDouble(5, 55.84);
        statement.executeUpdate();

        statement.close();
    }

    private static void deleteRecord(Connection connection, int rollNo) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(DELETE_QUERY);
        statement.setInt(1, rollNo);
        statement.executeUpdate();
        statement.close();
    }

    private static void updateCity(Connection connection, String oldCity, String newCity) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(UPDATE_QUERY);
        statement.setString(1, newCity);
        statement.setString(2, oldCity);
        statement.executeUpdate();
        statement.close();
    }

    private static void displayStudentsGreaterThan60(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SELECT_GREATER_THAN_60_QUERY);
        System.out.println("Names of students having marks greater than 60:");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("Name"));
        }
        resultSet.close();
        statement.close();
    }

    private static void displayStudentsOrderByMarksDesc(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SELECT_ORDER_BY_MARKS_DESC_QUERY);
        System.out.println("\nStudents ordered by marks (Descending order):");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("Name") + " - " + resultSet.getDouble("Marks"));
        }
        resultSet.close();
        statement.close();
    }
}