/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student {

    private String  First;     
    private String Last;      
    private String Address;
    private int Age;
    private String DOB; 
    private int ID;

    // construct a new student with given fields
    public Student(String first, String last, String Address, String DOB, int age, int ID) {
        this.First   = first;
        this.Last    = last;
        this.Address   = Address;
        this.DOB = DOB;
        this.Age = age;
        this.ID = ID;
    }
    
    public String getFirst(){
        return First;
    }
    
    public String getLast(){
        return Last;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getUsername(){
        return  First + Last+ Age;
    }
    
    public String getAddress(){
        return Address;
    }
    
    public int getAage(){
        return Age;
    }
    
    public String getDOB(){
        return DOB;
    }
    // return a string representation of the invoking object
    public String getString() {
        return ID + " " + First + " " + Last + " " + Age ;
    }
}
