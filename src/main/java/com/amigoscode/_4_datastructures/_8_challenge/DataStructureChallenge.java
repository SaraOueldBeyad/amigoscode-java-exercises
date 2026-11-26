package com.amigoscode._4_datastructures._8_challenge;

// Exercise: Data Structure Challenge
// Combine multiple data structures to solve a real-world problem.
// Manage a collection of students, group them, track recently viewed, and generate reports.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DataStructureChallenge {

    // TODO: 1 - Create a Student record (or class) with three fields:
    //           String name, int grade, String subject
    //           If using a record: record Student(String name, int grade, String subject) {}
    //           If using a class: include constructor, getters, and a toString() method
    record Student(String name, int grade, String subject) {}


    public static void main(String[] args) {

        // TODO: 2 - Create a List of 10 students with various names, grades, and subjects
        //           Use at least 3 different subjects (e.g., "Math", "Science", "English")
        //           Example: new Student("Alice", 92, "Math")
        List<Student> list = new ArrayList<>(List.of(
                new Student("Sara", 92, "Math"),
                new Student("Omar", 78, "Physics"),
                new Student("Fatima", 85, "English"),
                new Student("Youssef", 65, "Computer Science"),
                new Student("Amina", 98, "Biology"),
                new Student("Ahmed", 72, "Physics"),
                new Student("Salma", 88, "Math"),
                new Student("Hamza", 55, "Computer Science"),
                new Student("Maryam", 95, "Biology"),
                new Student("Khalid", 81, "English")
        ));

        // TODO: 3 - Use a Map<String, List<Student>> to group students by subject
        //           Iterate through the student list
        //           For each student, use computeIfAbsent() to get or create the list for their subject
        //           Then add the student to that list
        //           Print each subject and its students
        Map<String, List<Student>> studentsBySubject = new HashMap<>();
        for (Student student : list){
            studentsBySubject.computeIfAbsent(student.subject, s -> new ArrayList<>()).add(student);
        }
        studentsBySubject.entrySet().forEach(System.out::println);

        // TODO: 4 - Use a Set<String> to find all unique subjects
        //           Iterate through the students and add each subject to the set
        //           Print the unique subjects
        Set<String> uniqueSubjects = new HashSet<>();
        for (Student student : list){
            uniqueSubjects.add(student.subject());
        }
        System.out.println(uniqueSubjects);

        // TODO: 5 - Use a Stack<Student> to track the last 3 students "viewed"
        //           Push any 3 students from the list onto the stack
        //           Then pop and print them to show the viewing history (most recent first)
        Stack<Student> viewed = new Stack<>();
        viewed.push(list.get(3));
        viewed.push(list.get(9));
        viewed.push(list.get(6));

        while (!viewed.isEmpty()){
            System.out.println(viewed.pop());
        }

        // TODO: 6 - Sort the student list by grade in descending order using a Comparator
        //           Use list.sort() with Comparator.comparingInt() and .reversed()
        //           Print the sorted list
        list.sort(Comparator.comparingInt((Student s) -> s.grade).reversed());
        list.forEach(System.out::println);

        // TODO: 7 - Print a summary report:
        //           - Total number of students
        //           - Number of unique subjects (from the Set)
        //           - Highest grade student (first in sorted list)
        //           - Number of students per subject (from the Map)
        System.out.println("Total number of students: " + list.size());
        System.out.println("Number of unique subjects: " + uniqueSubjects.size());
        System.out.println("Highest grade student: " + list.getFirst().name);
        System.out.println("Number of students per subject: ");
        studentsBySubject.forEach((subject, listOfStudents) -> System.out.println(subject + ": " + listOfStudents.size()));
    }
}
