package com.amigoscode._1_beginners;

import java.util.Scanner;

/**
 * Mini Project: Simple Calculator
 *
 * Put together everything you have learned so far to build a simple calculator.
 * The calculator should display a menu, read the user's choice and two numbers,
 * perform the chosen operation, and print the result.
 */
public class _10_MiniProject {

    public static void main(String[] args) {

        // TODO: 1 - Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // TODO: 2 - Display a menu with the following options:
        // Print:
        System.out.print("=== Simple Calculator ==="
                + "\n1. Add"
                + "\n2. Subtract"
                + "\n3. Multiply"
                + "\n4. Divide"
                + "\nChoose an operation (1-4): ");


        // TODO: 3 - Read the user's choice into an int variable
        int operation = scanner.nextInt();

        // TODO: 4 - Prompt and read two double numbers from the user
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();


        // TODO: 5 - Use a switch statement to perform the chosen operation and print the result
        switch (operation){
            case 1 :
                System.out.println("Result: " + (a + b));
                break;
            case 2 :
                System.out.println("Result: " + (a - b));
                break;
            case 3 :
                System.out.println("Result: " + (a * b));
                break;
            case 4 :
                System.out.println("Result: " + ((b != 0) ? (a/b) : "Cannot by 0"));
                break;
            default :
                System.out.println("Invalid choice");
        }


        // TODO: 6 - Inside case 4, handle division by zero with an if statement
        // If the second number is 0, print "Error: Cannot divide by zero"
        // Otherwise, print the result of the division

    }

}
