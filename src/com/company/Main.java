
// You are going to accept customer information from a user. You will ask them if they are a residential or
// business customer. If they are a residential customer you will accept their name and phone number.
// If they are a business customer you will accept their business name, contact name, and phone number.
//Create an overloaded method with two signatures, pass the appropriate parameters into the method and display
// the information correctly on the screen. Implement both methods.


//Pseudo code
// Display a menu and have the user select either a residential or business customer
// For residential customers query the user for a name and phone number - save as strings
// For a business customer query the user for a business name, contact name, and phone.
// create a method that accepts two strings as arguments, called printCustomer
// create a method that accepts three strings as arguments, called printCustomer - this is the overloaded method as
// it involves using a different list of arguments.


package com.company;

import java.util.Scanner;

public class Main {

    // create an object of type Scanner to manage user input.
    static Scanner scanner = new Scanner(System.in);

    // create a variable to handle user menu inputs
    static int userSelection = 0;

    // these variables hold the user provided input for.
 //   static String name = new String("");
    static String contactName = new String("");
    static String phoneNumber = new String("");

//*****************************************************************************
// method: printCustomer
// Requirements: Two strings allowed in the arguments
// Results: Prints the customers name and phone number
// Skips some lines for formatting

static void printCustomer(String customerName, String customerPhoneNumber) {
        System.out.println("\n\n");
        System.out.println("Residential Customer");
        System.out.println("Customers name is " + customerName);
        System.out.println("Customers Phone # is " + customerPhoneNumber );


}

//*****************************************************************************
// method: printCustomer
// this is an overloaded method with three arguments and same name as previous method
// Requirements: Three strings allowed in the arguments
// Results: Skips some lines for formatting
// Prints a business customers business name, contact name and phone number
static void printCustomer(String businessName, String contactName, String phoneNumber) {
    System.out.println("\n\n");
    System.out.println("Business Customer");
    System.out.println("Business Name " + businessName);
    System.out.println("Contact Name " + contactName);
    System.out.println("Phone Number " + phoneNumber);

}





    public static void main(String[] args) {

        // set up a loop to handle user input and provide a graceful exit
        do {
            // this block displays the program main menu
            System.out.println("\nPlease select one of the following");
            System.out.println("1 .. Enter Residential contact information");
            System.out.println("2 .. Enter Business contact information");
            System.out.println("3 .. exit the program");

            // get the users selection
            userSelection = scanner.nextInt();

            // parse the selection
            switch (userSelection) {

                case 1:
                    // Query for Residential contact information
                    System.out.println("Please enter your name: ");
                    scanner.nextLine();                                     // needed to consume the \n character
                    String name = scanner.nextLine();

                    System.out.print("Please enter your phone number: ");
                    String phoneNumber = scanner.nextLine();
                    printCustomer(name, phoneNumber);
                    break;

                case 2:
                    // Query for business customer information
                    System.out.print("Please enter your business name: ");
                    scanner.nextLine();                                     // needed to consume the \n character
                    name = scanner.nextLine();
                    System.out.print("Please enter your contact name: ");
                    contactName = scanner.nextLine();
                    System.out.print("Please enter your phone number: ");
                    phoneNumber = scanner.nextLine();
                    // call the overloaded method
                    printCustomer(name, contactName, phoneNumber);
                    break;

                case 3:
                    System.out.println("Program exiting, thank you");
                    break;

                default:
                    // default to handle incorrect user input
                    System.out.println("You must select 1, 2 or 3 please try again");
            }
        }
        // graceful exit if the user selects 3 from the main menu
        while (userSelection != 3);
    }
}




