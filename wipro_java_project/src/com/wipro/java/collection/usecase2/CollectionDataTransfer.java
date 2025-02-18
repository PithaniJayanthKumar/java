package com.wipro.java.collection.usecase2;
import java.util.*;

public class CollectionDataTransfer {
    public static void main(String[] args) {
        // Step 1: Create a TreeMap with sorted key-value pairs
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(101, "Jayanth");
        treeMap.put(105, "pradeep");
        treeMap.put(102, "naveen");
        treeMap.put(104, "David");
        treeMap.put(103, "hriday");

        // Step 2: Display the sorted TreeMap
        System.out.println("TreeMap (Sorted Order):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 3: Transfer data to a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);

        // Step 4: Display the HashMap (Unordered)
        System.out.println("\nHashMap (Unordered):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
