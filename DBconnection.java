import java.sql.connection;
import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    private static final String URL="jdbc:mysql://localhost:3306/student_Management?allowPublicKeyRetrively=true&use SSL=false";
    private static final String PASSWORD="password";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}

