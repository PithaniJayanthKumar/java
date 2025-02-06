package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparator to sort movie by  age
class Age implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a2.getAge(), a1.getAge()); // Descending order
    }

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Zebra", 5));
        animalList.add(new Animal("Lion", 7));
        animalList.add(new Animal("Elephant", 10));

        // Sort animals by age in descending order
        Collections.sort(animalList, new Age());

        System.out.println("\nAnimals sorted by age (Descending):");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }
}
