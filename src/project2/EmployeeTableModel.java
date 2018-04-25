        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author OhemaaAfriyie
 */
public class EmployeeTableModel extends AbstractTableModel{
    private List<Employee> listofEmployees;
    
    public EmployeeTableModel(List<Employee> lisofEmployees){
        this.listofEmployees = listofEmployees;
    }
        
    @Override
    public int getRowCount() {
        return listofEmployees.size();
          }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Employee employee = listofEmployees.get(rowIndex);
        switch (columnIndex){
            case 0:
                return employee.getName();
            case 1:
                return employee.getAge();
            case 2: 
                return employee.getName();
            default :
                return null;
                
            
        }
    }
    public String getColumName(int column) {
        switch (column){
            case 0:
                return "Name";
            case 1:
                return "Age";
            case 2:
                return "Address";
            default:
                return " "; 
        }
    }
}
