package Page;

import javax.swing.*;
import java.sql.*;

public class ConnectionDatabase {

    private static final String URL = "jdbc:ucanaccess://C://Users//yigitcan.alkac//Desktop//insurance.accdb";

    public boolean checkConnection(String userID,String password ) {
                
        String query = "SELECT * FROM User WHERE Id = ? AND [password] = ?"; // [password] ile tırnak kullanıldı.

        try (
            Connection connection = DriverManager.getConnection(URL);
            PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, userID);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return true; // Kullanıcı adı ve şifre doğru
            } else {
                return false; // Yanlış kullanıcı adı veya şifre
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
                    
   
    public static Connection connect () {
     
        try {
        Connection connection = DriverManager.getConnection(URL);
        return connection;
    } catch (SQLException e) {
        e.printStackTrace();
        return null; 
    }
        
        
    }     
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
       
    }

   
}
