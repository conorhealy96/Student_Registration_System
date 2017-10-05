/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class modules {
   
    private String  ModName;     
    private String ID; 
    private ArrayList<Student> Students;
 
   
    public modules(String Name, String last) {
        this.ModName   = Name;
        this.ID = ID;
        Students = new ArrayList<Student>();
    }
    public ArrayList<Student> getstudents() {
        return Students;
    }
    public void addStudent(Student student){
        this.Students.add(student);
    }
    
    public String getID(){
        return ID;
    }
    
    public String getModuleName(){
        return ModName;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    
    public void setName(String Name){
        this.ModName = Name;
    }
    
    public void removeStudent(Student student){
        this.Students.remove(student);
    }
}
