/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OhemaaAfriyie
 */
public class EmployeeDB {
    public List <Employee> getAllEmployee(){
        List <Employee> listofEmployees = new ArrayList<>();
        try {
            Connection conn = ConnectionUtil.getConnection();
            if(!conn.isClosed()){
               System.out.println("Hello");
            }else{
                System.out.println("sorry!");
            }
            CallableStatement stmt = conn.prepareCall("(Call getAllEmployees())");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String address = rs.getString("Address");
 
                Employee employee = new Employee(id, name, age, address);
                listofEmployees.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listofEmployees;
    
}
}