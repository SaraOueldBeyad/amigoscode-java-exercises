package com.amigoscode._1_beginners;

/**
 * Exercise: Loops
 *
 * Learn how to use for, while, and do-while loops to repeat code.
 * Loops are fundamental for iterating over data and performing repetitive tasks.
 */
public class _5_LoopExercises {

    public static void main(String[] args) {
        // TODO: 1 - Write a for loop to print numbers 1 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        // TODO: 2 - Write a while loop to print numbers 10 down to 1 (countdown)
        int decrement = 10;
        int d = decrement;
        while (d > 0) {
            System.out.println(d);
            d--;
        }

        // TODO: 3 - Write a do-while loop that runs at least once
        // Print "This runs at least once!" inside the loop.
        // Use a condition that is false so the loop only runs once.
        do {
            System.out.println("This runs at least once!");
        } while (false);


        // TODO: 4 - Write a for loop to print only even numbers from 1 to 20
        for (int i = 20; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }
        }


        // TODO: 5 - Write a for loop to calculate the factorial of 5 (5! = 120)
        int factorial = 1;
        // Multiply factorial by each number from 1 to 5.
        // Print the result.
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println(factorial);


        // TODO: 6 - Use an enhanced for loop (for-each) to iterate over a String array
        String[] fruits = {"Banana", "Apple", "Orange", "Kiwi"};
        // Declare a String array called fruits with at least 4 fruit names.
        // Use an enhanced for loop to print each fruit.
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        // TODO: 7 - Write a nested for loop to print a 3x3 multiplication table
        // The output should look like:
        //   1  2  3
        //   2  4  6
        //   3  6  9
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }


        // TODO: 8 - Use break and continue in a loop
        // Write a for loop from 1 to 10:
        //   - Use 'continue' to skip the number 5 (do not print it)
        //   - Use 'break' to stop the loop when you reach 8
        // Print each number that is not skipped.
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            } else if (i == 8) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
