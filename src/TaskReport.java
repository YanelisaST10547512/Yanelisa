/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskReport;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Student
 */
public class TaskReport {

    // Class-level static ArrayLists so all methods can access them
    public static ArrayList<String> sentMessages = new ArrayList<>();
    public static ArrayList<String> disregardedMessages = new ArrayList<>();
    public static ArrayList<String> storedMessages = new ArrayList<>();
    public static ArrayList<String> messageHash = new ArrayList<>();
    public static ArrayList<String> messageID = new ArrayList<>();
    public static ArrayList<String> recipients = new ArrayList<>();

    public static void main(String[] args) {
        loadTestDataSet();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n  MAIN MENU ");
          
            System.out.println("1. Send/Process Messages");
            System.out.println("2. View Sent Messages");
            System.out.println("3. View Disregarded Messages");
            System.out.println("4. Stored Messages (New menu option)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Process messages feature goes here.");
                    break;
                case 2:
                    System.out.println("Displaying Sent Messages...");
                    break;
                case 3:
                    System.out.println("Displaying Disregarded Messages...");
                    break;
                case 4:
                    runStoredMessagesMenu(scanner);
                    break;
                case 5:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void loadTestDataSet() {
        recipients.add("+27834557896");
        sentMessages.add("Did you get the cake?");
        messageID.add("MID001");
        messageHash.add("Hash101");

        recipients.add("+27838884567");
        storedMessages.add("Where are you? You are late! I have asked you to be on time.");
        messageID.add("MID002");
        messageHash.add("Hash102");

        recipients.add("+27834484567");
        disregardedMessages.add("Yo, Im at your gate.");
        messageID.add("MID003");
        messageHash.add("Hash103");

        recipients.add("0838884567");
        sentMessages.add("It is dinner time !");
        messageID.add("MID004");
        messageHash.add("Hash104");

        recipients.add("+27838884567");
        storedMessages.add("Okay, i am leaving without you.");
        messageID.add("MID005");
        messageHash.add("Hash105");
    }

    public static void runStoredMessagesMenu(Scanner scanner) {
        String input;
        do {
            System.out.println("\n--- STORED MESSAGES MENU ---");
            System.out.println("a. Display sender and recipient of all stored messages");
            System.out.println("b. Display the longest stored message");
            System.out.println("c. Search for a message ID and display recipient & message");
            System.out.println("d. Search all messages stored for a particular recipient");
            System.out.println("e. Delete a message using the message hash");
            System.out.println("f. Display a report of all stored messages");
            System.out.println("7. Return to Main Menu");
            System.out.print("Select an option (a-f or 7 to return): ");

            input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "a":
                    displaySenderAndRecipient();
                    break;
                case "b":
                    displayLongestStoredMessage();
                    break;
                case "c":
                    searchByMessageID(scanner);
                    break;
                case "d":
                    searchByRecipient(scanner);
                    break;
                case "e":
                    deleteByMessageHash(scanner);
                    break;
                case "f":
                    displayStoredMessageReport();
                    break;
                case "7":
                    System.out.println("Returning to Main Menu.");
                    return;
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        } while (true);
    }

    public static void displaySenderAndRecipient() {
        System.out.println("\n- Stored Messages Senders & Recipients -");
        for (int i = 0; i < storedMessages.size(); i++) {
            System.out.println("Recipient: " + recipients.get(i) + " | Message: " + storedMessages.get(i));
        }
    }

    public static void displayLongestStoredMessage() {
        if (storedMessages.isEmpty()) {
            System.out.println("No stored messages available.");
            return;
        }
        String longest = storedMessages.get(0);
        for (String msg : storedMessages) {
            if (msg.length() > longest.length()) {
                longest = msg;
            }
        }
        System.out.println("\n- Longest Stored Message -");
        System.out.println(longest);
    }

    public static void searchByMessageID(Scanner scanner) {
        System.out.print("Enter Message ID to search: ");
        String targetID = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < messageID.size(); i++) {
            if (messageID.get(i).equalsIgnoreCase(targetID)) {
                System.out.println("Found -> Recipient: " + recipients.get(i) + " | Message: " + storedMessages.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Message ID not found.");
        }
    }

    public static void searchByRecipient(Scanner scanner) {
        System.out.print("Enter Recipient number: ");
        String targetRecipient = scanner.nextLine();
        System.out.println("\n- Messages for " + targetRecipient + " -");
        boolean found = false;

        for (int i = 0; i < recipients.size(); i++) {
            if (recipients.get(i).equals(targetRecipient)) {
                System.out.println("- " + storedMessages.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No messages found for this recipient.");
        }
    }

    public static void deleteByMessageHash(Scanner scanner) {
        System.out.print("Enter Message Hash to delete: ");
        String targetHash = scanner.nextLine();
        int index = messageHash.indexOf(targetHash);

        if (index != -1) {
            messageHash.remove(index);
            messageID.remove(index);
            recipients.remove(index);
            if (index < storedMessages.size()) {
                storedMessages.remove(index);
            }
            System.out.println("Message successfully deleted using message hash.");
        } else {
            System.out.println("Hash not found.");
        }
    }

    public static void displayStoredMessageReport() {
        System.out.println("\n  FULL STORED MESSAGES REPORT ");
        for (int i = 0; i < storedMessages.size(); i++) {
            System.out.println("Hash: " + messageHash.get(i));
            System.out.println("ID:   " + messageID.get(i));
            System.out.println("To:   " + recipients.get(i));
            System.out.println("Msg:  " + storedMessages.get(i));
  
        }
    }
}