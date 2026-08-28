package com.amigoscode._1_beginners;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class _3_TypeCasting {

    public static void main(String[] args) {
        // TODO: 1 - Widen an int to a double (implicit casting)
        int a = 20;
        double b = a;
        // Print both variables to see the result.
        System.out.println(a);
        System.out.println(b);


        // TODO: 2 - Narrow a double to an int (explicit casting)
        double c  = 9.78;
        int d = (int)c;
        // Print both variables to see what happens to the decimal part.
        System.out.println(c);
        System.out.println(d);


        // TODO: 3 - Cast an int to a char to get the character it represents
        int num = 65;
        char e = (char)num;
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
        System.out.println(e);

        // TODO: 4 - Cast a char to an int to get its ASCII value
        char character = 'Z';
        int n = character;
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        System.out.println(n);


        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        String s = "42";
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        System.out.println(Integer.parseInt(s));

        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        int v = 42;
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        System.out.println(String.valueOf(v));
    }
}
