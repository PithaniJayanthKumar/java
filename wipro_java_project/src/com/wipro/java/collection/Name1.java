package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparator to sort movie by  name
class Name1 implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
    	
    	//Sort by name in alphabetic order

        return a1.getName().compareTo(a2.getName());
    }

    public static void main(String[] args) {
    	
    	//creating list of animals
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Zebra", 5));
        animalList.add(new Animal("Lion", 7));
        animalList.add(new Animal("Elephant", 10));

        // Sort animals by name
        Collections.sort(animalList, new Name1());

        System.out.println("\nAnimals sorted by name:");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }
}
