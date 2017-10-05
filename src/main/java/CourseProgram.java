/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.joda.time.DateTime;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class CourseProgram {
   
    
    private String  CourseName;     
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    private ArrayList<modules> modules;

     

    public CourseProgram(String Name, DateTime startDate, DateTime endDate ){
        this.CourseName   = Name;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<modules>();
    }
    
    public ArrayList<modules> getModules() {
    return modules;
    }
    
    public String getCourseName() {
        return CourseName;
    }
    
    public DateTime getStartDate() {
        return startDate;
    }
    
    public DateTime getEndDate() {
        return endDate;
    }
    
    public void setCourseName(String Name) {
        this.CourseName = Name;
    }
    
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }
    
    public void getEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    public void addModules(modules module){
        modules.add(module);
    }
}
