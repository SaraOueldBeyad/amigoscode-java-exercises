package com.amigoscode._1_beginners;

/**
 * Exercise: Strings
 *
 * Learn how to work with Strings in Java.
 * Strings are objects that represent sequences of characters and come with
 * many useful built-in methods.
 */
public class _8_StringExercises {

    public static void main(String[] args) {

        String message = "Hello, Welcome to Amigoscode!";
        String padded = "   Hello World   ";
        String csv = "apple,banana,cherry,date,elderberry";

        // TODO: 1 - Get the length of the 'message' string and print it
        System.out.println(message.length());


        // TODO: 2 - Convert 'message' to uppercase and lowercase, and print both
        System.out.println("Message is uppercase: " + message.toUpperCase()
                + "\nMessage to lowercase: " + message.toLowerCase());


        // TODO: 3 - Get a substring of 'message' containing the first 5 characters and print it
        System.out.println(message.substring(0, 5));


        // TODO: 4 - Check if 'message' contains the word "Amigoscode" and print the result
        System.out.println(message.contains("Amigoscode"));


        // TODO: 5 - Replace "Amigoscode" with "Java" in 'message' and print the new string
        System.out.println(message.replace("Amigoscode", "Java"));


        // TODO: 6 - Trim the whitespace from the 'padded' string and print the result
        System.out.println(padded.trim());


        // TODO: 7 - Split the 'csv' string by commas into a String array and print each element
        String[] tmpTab = csv.split(",");
        for (String tmp : tmpTab) {
            System.out.println(tmp);
        }


        // TODO: 8 - Check if two strings are equal using .equals() (not ==)
        // Create two String variables with the same text content and compare them.
        String firstName = "Sara";
        String secondName = "Sara";

        //.equals() compare the content of the string not the placement in memory
        System.out.println(firstName.equals(secondName));

    }
}
