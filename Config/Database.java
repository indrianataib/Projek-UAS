
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    private static Connection mysqlConfig;
    public static Connection configDB() throws SQLException{
        try{
        String url = "jdbc:mysql://localhost:3306/latihannetbeans1";
        String username = "root";
        String password = "";
        
        DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
        mysqlConfig = DriverManager.getConnection(url, username, password);
        }catch (SQLException exc){
            System.out.println("KONEKSI KE DATABASE GAGAL" + exc.getMessage());
        }
    return mysqlConfig;
    
}
}
