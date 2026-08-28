package com.amigoscode._1_beginners;

import java.util.Scanner;

/**
 * Exercise: Scanner (User Input)
 *
 * Learn how to read user input from the console using the Scanner class.
 * Scanner allows your programs to be interactive by accepting input at runtime.
 */
public class _9_ScannerExercises {

    public static void main(String[] args) {

        // TODO: 1 - Create a Scanner object to read from System.in
        Scanner scanner = new Scanner(System.in);


        // TODO: 2 - Prompt the user for their name and read it using nextLine()
        // Print "Enter your name: " then read the input into a String variable.
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        // TODO: 3 - Prompt the user for their age and read it using nextInt()
        // Print "Enter your age: " then read the input into an int variable.
        // Note: After nextInt(), the newline character remains in the buffer.
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        // TODO: 4 - Print a greeting using the name and age
        // Example output: "Hello, Alice! You are 25 years old."
        System.out.println("Hello, " + name+"! You are " + age +" years old.");


        // TODO: 5 - Prompt the user for two numbers, read them, and print their sum
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Sum: " + _7_MethodExercises.add(a,b));


        // TODO: 6 - Close the scanner to free resources
        scanner.close();

    }
}
