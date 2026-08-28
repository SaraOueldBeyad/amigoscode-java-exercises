package com.amigoscode._1_beginners;

/**
 * Exercise: Methods
 *
 * Learn how to define and call methods in Java.
 * Methods allow you to organize code into reusable blocks, each performing a specific task.
 */
public class _7_MethodExercises {

    // TODO: 1 - Create a method called greet that takes a String parameter 'name'
    // and prints "Hello, {name}!"
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }


    // TODO: 2 - Create a method called add that takes two int parameters (a, b)
    // and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }


    // TODO: 3 - Create a method called isEven that takes an int parameter 'number'
    // and returns true if the number is even, false otherwise
    public static String isEven(int number) {
        return ((number % 2 == 0) ? "true" : "false");
    }


    // TODO: 4 - Create a method called max that takes two int parameters (a, b)
    // and returns the larger of the two
    public static int max(int a, int b){
        return ((a >= b) ? a : b);
    }


    // TODO: 5 - Create a method called factorial that takes an int parameter 'n'
    // and returns n! (n factorial) using a loop
    public static long factorial(int n){
        long factorial = n;
        for (int i = n-1; i > 0 ; i--) {
            factorial *= i;
        }
        return factorial;
    }


    // TODO: 6 - Create two overloaded methods called multiply:
    //   - One that takes 2 int parameters and returns their product
    //   - One that takes 3 int parameters and returns their product
    // Overloading means having multiple methods with the same name but different parameters.
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int multiply(int a, int b, int c){
        return a * b * c;
    }


    public static void main(String[] args) {

        // TODO: 7 - Call all the methods above and print their results
        greet("Sara");
        System.out.println(add(10,20));
        System.out.println(isEven(3));
        System.out.println(max(5,6));
        System.out.println(factorial(5));
        System.out.println("Calling method multp[ly with 2 parameters: " + multiply(2,3));
        System.out.println("Calling method multp[ly with 3 parameters: " + multiply(2,3, 4));

    }
}
