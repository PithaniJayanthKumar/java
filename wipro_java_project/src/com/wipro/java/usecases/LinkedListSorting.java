package com.wipro.java.usecases;

import java.util.*; // Importing required classes from Java's utility package

class NameComparator implements Comparator<String> {
    @Override
    public int compare(String name1, String name2) {
        return name1.compareTo(name2); // Ascending order
    }
}

class DescendingNameComparator implements Comparator<String> {
    @Override
    public int compare(String name1, String name2) {
        return name2.compareTo(name1); // Descending order
    }
}

public class LinkedListSorting {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to LinkedList
        linkedList.add("Abhi");
        linkedList.add("David");
        linkedList.add("Chandan");
        linkedList.add("Bobby");

        System.out.println("Original LinkedList: " + linkedList);

        // Sorting in Ascending Order
        Collections.sort(linkedList, new NameComparator());
        System.out.println("Sorted (Ascending): " + linkedList);

        // Sorting in Descending Order
        Collections.sort(linkedList, new DescendingNameComparator());
        System.out.println("Sorted (Descending): " + linkedList);
    }
}
