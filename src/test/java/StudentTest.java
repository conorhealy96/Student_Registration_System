/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class StudentTest {
    private static Student student;
    
    public StudentTest() {
        
    }
    
    @Before
    public void setUp() {
          student = new Student("conor", "healy","Ballygar", "30-04-1996", 21, 14322261);
    }
    
    @Test
    public void testUsername(){
       String name = student.getUsername();
       String expectedResult = "conorhealy21";
       System.out.println(name);
       assertTrue(expectedResult.equals(name));
       
    }
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
}
