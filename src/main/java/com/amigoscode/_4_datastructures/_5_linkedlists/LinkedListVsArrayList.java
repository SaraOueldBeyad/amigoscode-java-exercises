package com.amigoscode._4_datastructures._5_linkedlists;

// Exercise: LinkedList vs ArrayList Performance Comparison
// Understand when to use LinkedList vs ArrayList by measuring operation times.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

    public static void main(String[] args) {

        // TODO: 1 - Create both an ArrayList<Integer> and a LinkedList<Integer>
        //           Fill each with 10000 elements (0 to 9999) using a for loop
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }

        // TODO: 2 - Measure time to add an element at the beginning (index 0) for both lists
        //           Use System.nanoTime() before and after the operation
        //           Perform the add(0, value) operation 1000 times for each list
        //           Print the time taken for each in milliseconds
        //           (divide nanoseconds by 1_000_000 to get milliseconds)
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, -1);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList: " + (end - start) / 1_000_000.0);

        long startL = System.nanoTime();
        linkedList.add(0, -1);
        long endL = System.nanoTime();
        System.out.println("LinkedList: " + (endL - startL) / 1_000_000.0);

        // TODO: 3 - Measure time to add an element at the end for both lists
        //           Perform the add(value) operation 1000 times for each list
        //           Print the time taken for each
        long startArr = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.addLast(-1);
        }
        long endArr = System.nanoTime();
        System.out.println("ArrayList: " + (endArr - startArr) / 1_000_000.0);

        long startLinked = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.addLast(-1);
        }
        long endLinked = System.nanoTime();
        System.out.println("LinkedList: " + (endLinked - startLinked) / 1_000_000.0);

        // TODO: 4 - Measure time to get an element at the middle index for both lists
        //           Perform get(list.size() / 2) operation 1000 times for each list
        //           Print the time taken for each
        long s = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.get(arrayList.size() / 2);
        }
        long e = System.nanoTime();
        System.out.println("ArrayList: " + (e - s) / 1_000_000.0);

        long st = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(arrayList.size() / 2);
        }
        long en = System.nanoTime();
        System.out.println("LinkedList: " + (en - st) / 1_000_000.0);

        // TODO: 5 - Print a summary explaining the differences
        //           Use System.out.println() to explain:
        //           - Why LinkedList is faster for insertions at the beginning
        //           - Why ArrayList is faster for random access (get by index)
        //           - When you would choose one over the other
        System.out.println("LinkedList is faster for insertions at the beginning " +
                "because it doesn't need to shift all elements.");
        System.out.println("ArrayList is faster for random access (get by index)" +
                " because it can easily access an element by the index.");
        System.out.println("ArrayList for a quick access to an element with an index " +
                "but for a quick insertion or deletion at the beginning I would choose the linked list");

    }
}
