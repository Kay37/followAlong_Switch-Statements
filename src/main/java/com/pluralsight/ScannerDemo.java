package com.pluralsight;

///imported Scanner
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        ///created a scanner for use in this ScannerDemo class
        ///gets input from the keyboard in the terminal
        ///we can use this as many times as we want
        Scanner theScanner = new Scanner(System.in);

        ///I'm asking the user a question so they know to answer
        ///or know what input to give me
        System.out.println("Please enter your first name: ");

        ///capture the answer from the user
        String firstName = theScanner.nextLine();

        System.out.printf("Your first name is %s%n", firstName);

        System.out.println("Please enter your last name: ");

        String lastName = theScanner.nextLine();

        System.out.printf("Your name is %s, %s%n", lastName, firstName);

        ///ask the user what their lucky number is
        System.out.println("What is your lucky number?");
        int luckyNumber = theScanner.nextInt();

        
    }
}
