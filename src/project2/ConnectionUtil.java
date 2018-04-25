/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author OhemaaAfriyie
 */
public class ConnectionUtil{
    static String URL = "jdbc:mysql://localhost/EmployeeDB";
    static String USER = "root";
    static String PASSWORD = "";
    public static Connection getConnection() {
        try {
            
            return DriverManager.getConnection (URL,USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        }
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    static Connection getConnection(String URL, String USER, String PASSWORD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
