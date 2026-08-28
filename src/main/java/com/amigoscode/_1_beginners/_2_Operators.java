package com.amigoscode._1_beginners;

/**
 * Exercise: Operators
 *
 * Learn how to use arithmetic, comparison, logical, and other operators in Java.
 * Operators allow you to perform operations on variables and values.
 */
public class _2_Operators {

    public static void main(String[] args) {
        // TODO: 1 - Use arithmetic operators (+, -, *, /) on two int variables and print the results
        int a = 10, b = 3;

        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        System.out.println("a / b: " + (a / b));


        // TODO: 2 - Use the modulus operator (%) to check if a number is even
        int number = 0;
        // Print the result of number % 2
        // Print whether the number is even (result is 0) or odd (result is 1
        number = a % b;
        System.out.println((number == 0) ? "Even" : "Odd");


        // TODO: 3 - Use increment (++) and decrement (--) operators
        int counter = 5;
        // Use counter++ and print the result, then use counter-- and print the result
        System.out.println(counter++);
        System.out.println(counter--);


        // TODO: 4 - Use compound assignment operators (+=, -=, *=)
        int score = 10;
        // Use +=, -=, and *= on score, printing after each operation
        score += 10;
        System.out.println("Score + 10 = " + score);
        score -= 10;
        System.out.println("Score - 10 = " + score);
        score *= 10;
        System.out.println("Score * 10 = " + score);


        // TODO: 5 - Use comparison operators (==, !=, >, <, >=, <=) and print the boolean results
        int x = 5, y = 10;
        // Print the result of each comparison, e.g.: System.out.println("x == y: " + (x == y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));


        // TODO: 6 - Use logical operators (&&, ||, !) to combine conditions
        boolean hasLicense = true, hasInsurance = false;
        // Print the result of: hasLicense && hasInsurance
        // Print the result of: hasLicense || hasInsurance
        // Print the result of: !hasLicense
        System.out.println("hasLicense && hasInsurance : " + (hasLicense && hasInsurance));
        System.out.println("hasLicense || hasInsurance : " + (hasLicense || hasInsurance));
        System.out.println("!hasLicense : " + (!hasLicense));


        // TODO: 7 - Use the ternary operator to assign "adult" or "minor" based on age
        int age = 24;
        // Use the ternary operator: String status = (condition) ? "adult" : "minor";
        // Print the status
        System.out.println((age >= 18) ? "adult" : "minor");

    }
}
