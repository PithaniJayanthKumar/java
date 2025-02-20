package com.wipro.java.collection.hashmap;

import java.util.HashMap;

public class StudentHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        
        // Adding elements
        students.put(101, "AbhiRam");
        students.put(102, "naveen");
        students.put(103, "Charan");
        students.put(null, "David"); // Allowed
        students.put(104, null);     // Allowed
        students.put(103,"jayanth"); // Duplicate RollNumber
        students.put(105, "naveen"); // Duplicate name

        // Retrieving elements
        System.out.println("Student 101: " + students.get(101));
        System.out.println("--------------------------------");

        // Iterating over HashMap
        for (Integer key : students.keySet()) {
            System.out.println("Roll No: " + key + ", Name: " + students.get(key));
        }
    }
}
