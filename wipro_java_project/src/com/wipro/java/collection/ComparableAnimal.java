package com.wipro.java.collection;

// ComparableAnimal class implements Comparable to define default sorting by age
class ComparableAnimal implements Comparable<ComparableAnimal> {
    private String name;
    private int age;

    public ComparableAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Sorting by age (Ascending Order)
    @Override
    public int compareTo(ComparableAnimal a) {
        return Integer.compare(this.age, a.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Overriding toString() for better output
    @Override
    public String toString() {
        return name + " " + age;
    }
}
