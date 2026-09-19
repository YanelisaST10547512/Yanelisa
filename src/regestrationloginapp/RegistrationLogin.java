
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regestrationloginapp; 
        
import java.util.Scanner;
import.java.util.yane.Pattern;

    boolean registration() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
/**
 *
 * @author Student
 */
public class RegistrationLogin {
    
    String username;
  private  String password;
 private String cellphone;
    private Scanner input = new Scanner (System.in);
    
    public String registration(){
     StringBuilder user = new StringBuilder();   
  
      
      System.out.println("Enter the username");
       username = input.nextLine();
      
      System.out.println("Enter password");
      password = input.nextLine();
      
      
      System.out.println("Enter cellphone number (+27XXXXXXXXX) : ");
      cellphone = input.nextLine();
      
      
      if(username.contains(user)){
          System.out.println("Username Correct format");
         
      }else{
          System.out.println("Incorrect format");
      }
         if (checkPasswordComplexity(password)){
        System.out.println("Password successfully captured\n");
  }
         else {
                System.out.println("Incorrect format");
                 }
         if(checkCellphone(cellphone)){
             System.out.println("Cell phone successfully Captured\n");
         }
         else {
             System.out.println("Incorrect format");
             
         }
        return null;
    }
  
  public boolean checkUsername(String uername){
      regestrationlogin.username = username;
      if(username.contains("_")&& username.length()<=5){
          System.out.println("Username Successfully Captured");
          return true;
      }
      else {
          System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length");
      } 
         return false;
  }
      
   boolean length = password.length()>=8;
   boolean hasUpper = password.matches(".*[A-Z].*");
   boolean hasDigit = password.matches(".*[0-9].*");
   boolean hasSpecial = password.chars().anyMatch(c-> !Character.isLetterOrDigit(c));
   
  return length && hasUpper && hasDigit && hasSpecial;
  }
 public boolean checkCellphone (String cellphone){
     String yane = "^\\+27[0-9]{9}$";
     
        return cellphone.matches(yane);
   }  
 public boolean loginPrompt() {
     System.out.println("Enter username");
     String eneteredUsername = input.nextLine();
     
     System.out.println("Enter password");
     String enteredPassword = input.nextLine();
        return login (enteredUsername, enteredPassword);
  
 }
 public boolean login(String enteredUsername, String enteredPassword){
     return username.equals(enteredUsername )&& password.equals(enteredPassword);
 }
 public String returnLoginStatus(boolean loginStatus){
    if (loginStatus){
       return "Successful login";
   }
 else {
    return "Failed login, please try again";
    }
 
}