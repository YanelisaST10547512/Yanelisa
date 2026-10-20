package regestrationloginapp;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.*;
   
/**
 *
 * @author Student
 */
public class Message {
   
    static Scanner vee = new Scanner(System.in);
    static RegistrationLogin lisa = new RegistrationLogin();
    
    
    public void yane(){
    
   
        
        int choice;
    do {
        
    System.out.print("Welcome to QuickChat");
    System.out.print("Option 1" + "Send Message");
    System.out.print("Option 2" + "Coming soon");
    System.out.print("Option 3" + "Quit");      
      choice = vee.nextInt();       
                    
    if(choice == 1){
        sendMessage();
    }
        
        else if(choice == 2){
          System.out.println("Coming soon.");  
        }
        else if(choice == 3){
            System.out.println("Quit.");
               
                }
                else{
                System.out.println("Invaild options chosen!");
                }
    }
    while(choice != 3);
    
    
}
      public static void sendMessage(){
          Random ran = new Random();
          
         
          System.out.println("Enter the number of messages you want to enter");
         int n = vee.nextInt();
         String messageL = vee.nextLine();
         
         for (int i = 0; i < n; i++);
         int messageID = ran.nextInt();
         System.out.println("Enter Unique Message ID");
         String messageid = vee.nextLine();
         while (messageid.length() > 10){
             System.out.println("Incorrect format, Enter the Unique Message ID again");
            messageid = vee.nextLine();
         }
         String firstTwoNumbers = messageid.substring(0,2);
         String[] words = messageL.split(" ");
         int Count = words.length;
        
         String firstWord = words[0];
         String lastWord = words[Count -1];
         
         String messageHash = firstTwoNumbers + ":" + Count + ":" + firstWord + lastWord;
         System.out.println(messageHash);
         messageHash = messageHash.toUpperCase();
         
         
         System.out.println("How many times do you want to send");
          int v = vee.nextInt();
          
          vee.nextLine();
          for(int i = 0; i < v; i++){
              System.out.println("Enter Recipient Number");
              String recNO = vee.nextLine();
          while (!lisa.checkCellphone(recNO)){
          System.out.println("Incorrect format, Enter Recipient Number");
          recNO = vee.nextLine();
          }
         
          System.out.println("Enter the message ");
          String message = vee.nextLine();
          while(message.length() < 250);
          System.out.println("Incorrect format of the message, Enter the message again");
          recNO = vee.nextLine();
      }      
   System.out.println("Choose an option");
    System.out.println("1. Send Message");
    System.out.println("2. Diregard massage");
    System.out.println("3. Store message to send letter");
    
    System.out.println("Enter your option: ");
    int option = vee.nextInt();
    
    switch (option){
        case 1:System.out.println("Message successfully sent");
        break;
        case 2: 
            System.out.println("Press 0 to delete the message");
            int delete = vee.nextInt();
            
            if(delete ==0){
                System.out.println("Message deleted");
            }
            else{
                System.out.println("Message not deleted");
                break;
            }
        case 3: 
            System.out.println("Message successfully stored");
            break;
            
        default:
            System.out.println("Invaild option");
            vee.close();
      }
    
      }
}

   
      

 
