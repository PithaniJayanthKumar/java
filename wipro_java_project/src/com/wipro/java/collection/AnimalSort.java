package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalSort {
    public static void main(String[] args) {
        // Create a list of ComparableAnimal objects
        List<ComparableAnimal> animalList = new ArrayList<>();
        animalList.add(new ComparableAnimal("Zebra", 5));
        animalList.add(new ComparableAnimal("Lion", 7));
        animalList.add(new ComparableAnimal("Elephant", 10));

        // Sort animals using Comparable (by age)
        Collections.sort(animalList);  // This should now work with ComparableAnimal

        // Display the sorted list of animals
        System.out.println("Animals after sorting by age:");
        for (ComparableAnimal a : animalList) {
            System.out.println(a);  // Uses ComparableAnimal's toString() method
        }
    }
}
