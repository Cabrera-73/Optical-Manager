
package umg.gt.opticalmanager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BD {
    
    private static final String URL = "jdbc:mysql://localhost:3306/optical manager"; 
    private static final String USER = "root";  
    private static final String PASSWORD = ""; 

    // Método para obtener la conexión
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
