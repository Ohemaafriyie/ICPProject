/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author OhemaaAfriyie
 */
public class Employee {
    public int id;
    public String name;
    public int age;
    public String address; 
    
    public Employee (int id, String name, int age, String address){
     this.address = address;
     this.age = age;
     this.name = name;
     this.id = id;
    }

    Employee(int id, String name, int age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public int getId() {
        return id; 
     }
     
     public String getName(){
         return name;
}
   public int getAge (){
       return age;
       
}
   
   public String getAddress(){
       return address;
   }
    public void setName (String newname) {
        newname = name;
    }   
    public void setAge (int newage) {
        newage = age;
    }   
    public void setId (int newId) {
        newId = id;
    }   
    
    public void setAddress (String newname) {
        newname = name;
    }   
    @Override
   public String toString(){
       return "The employee with the name and ID "+ getName()+ getId()+ "is " + getAge()+" years old and lives at " + getAddress();
   } 
       
       
}

