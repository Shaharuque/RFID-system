import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
    
    private static String serverName = "localhost";
    private static String username = "root";
    private static String dbName = "rfid_db";
    private static Integer portNumber = 3306;
    private static String password = "";
    
    public static Connection getConnection(){
        Connection con = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(serverName);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portNumber);
        
        try {
            con = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" GetConnection -> " +MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
