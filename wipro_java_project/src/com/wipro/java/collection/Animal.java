package com.wipro.java.collection;

class Animal {
    private String name;//Animal name
    private int age;//Animal Age
    
    
    //Constructor to initialize the animal details 
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
