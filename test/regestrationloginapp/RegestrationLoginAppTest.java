/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package regestrationloginapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class RegestrationLoginAppTest {
    
    public RegestrationLoginAppTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class RegestrationLoginApp.
     */
    @Test
    public void testValidUsername() {
        System.out.println("CheckUsername");
        RegistrationLogin instance = new RegistrationLogin ();
        instance.username = "yane_";
        boolean expResult = true;
        boolean result = instance.checkUsername(instance.username);
        assertEquals(expResult, result);
    }
    public void testInValidUsername(){
        System.out.println("CheckUsername");
        RegistrationLogin instance = new RegistrationLogin();
        instance.username = "yanellll";
        boolean expResult = false;
        boolean result = instance.checkUsername(instance.username);
        assertEquals(expResult, result);
        
        
    }
    public void testcheckPasswordComplexity(String password){
        System.out.println("Check password");
        RegistrationLogin instance = new RegistrationLogin();
        instance.password = "yanelll";
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity("text vaild password");
        assertEquals(expResult, result);
    }
    public void testcheckPasswordComplexity(){
        System.out.println("Check password");
        RegistrationLogin instance = new RegistrationLogin();
        instance.password = "yanelll";
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity("text invaild password");
        assertEquals(expResult, result);
    }
    public void testcheckCellPhoneNumber(String cellphoneNumber){
        System.out.println("+27614066398");
        RegistrationLogin instance = new RegistrationLogin();
        instance.cellphone = "+27614066398";
       boolean expResult = true;
       boolean result = instance.checkCellphone("valid CellPhoneNumber");
       assertEquals(expResult, result); 
    }
    public void testCellPhoneNumber(String CellphoneNumber){
        System.out.println("+27614066398");
        RegistrationLogin instance = new RegistrationLogin();
        instance.cellphone = "+27614066398";
       boolean expResult = false;
       boolean result = instance.checkCellphone("invalid CellPhoneNumber");
       assertEquals(expResult, result); 
    
    }
    
}
