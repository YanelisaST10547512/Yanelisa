/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regestrationloginapp;

/**
 *
 * @author Student
 */
public class RegestrationLoginApp {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       RegistrationLogin key = new RegistrationLogin();
       Message lisa = new Message();
        
       System.out.println("REGISTRATION");
      System.out.println(key.registration());
       
       System.out.println("LOGIN");
       boolean LoginStatus = key.loginPrompt();
       System.out.println(key.returnLoginStatus(LoginStatus));
       lisa.yane();
    }
    }
   
       
        
    

