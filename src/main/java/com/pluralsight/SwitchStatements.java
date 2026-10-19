package com.pluralsight;

import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {


        ///create a scanner so we can take and use input from the user
        Scanner theScanner = new Scanner(System.in);

        ///Ask the user for their first number
        System.out.println("Please enter the first number: ");

        ///capture the answer with theScanner
        int firstNumber = theScanner.nextInt();

        ///Ask the user for their second number
        System.out.println("Please enter the second number: ");

        ///capture the answer with theScanner
        int secondNumber = theScanner.nextInt();

        ///eat the new line from input buffer as we switch from numerical input to string
        theScanner.nextLine();

        ///calculator menu
        System.out.print(
                """
                        Possible calculations:
                            (A)dd
                            (S)ubtract
                            (M)ultiply
                            (D)ivide
                        Please select an option: """);

        ///We store the answer of what calculation type they want
        String calculationChoice = theScanner.nextLine();

        int result = 0;
        ///I first just did calculationChoice.equals and then realized people might do lowercase and it would error...
        ///(It's me, I'm people)
        ///I did learn you can use Ctrl + R to find and replace though.
//        if (calculationChoice.equalsIgnoreCase("A") ) {
//
//            ///The necessary code to do addition, given the user's choice
//            System.out.println("You have chosen addition ");
//            result = add(firstNumber, secondNumber);
//            ///The necessary code to do subtraction, given the user's choice
//        } else if (calculationChoice.equalsIgnoreCase("S") ) {
//            System.out.println("You have chosen subtraction ");
//            result = subtract(firstNumber, secondNumber);
//            ///The necessary code to do multiplication, given the user's choice
//        } else if (calculationChoice.equalsIgnoreCase("M") ) {
//            System.out.println("You have chosen multiplication ");
//            result = multiply(firstNumber, secondNumber);
//            ///The necessary code to do division, given the user's choice
//        } else if (calculationChoice.equalsIgnoreCase("D") ) {
//            System.out.println("You have chosen division ");
//            result = divide(firstNumber, secondNumber);
//            ///In case they typo or put numbers or something not supported.
//        }else{
//            System.out.println("You have chosen something not supported or recognizable ");
//            System.exit(1);
//
//            ///We are printing the answer / calculation to the user now.
//        }
//        System.out.println("The result is " + result);

        switch (calculationChoice.to) {
            case "A" -> result = add(firstNumber, secondNumber);
            case "S" -> result = subtract(firstNumber, secondNumber);
            case "M" -> result = multiply(firstNumber, secondNumber);
            case "D" -> result = divide(firstNumber, secondNumber);
            case "E" -> result =
            default -> {
                System.out.println("Invalid operation!");
                System.exit(0);
            }
        }
        System.out.println("The result is: " + result);
    }




    public static int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;

    }

    public static int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;

    }

    public static int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public static int divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

}