package com.wipro.java.collection.linkedlist;

import java.util.Scanner;

//Class representing a node in the linked list
class Node {
 int data; // Data stored in the node
 Node next; // Pointer to the next node

 // Constructor to initialize a new node
 public Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//Class representing a singly linked list
class LinkedList {
 Node head; // Head of the linked list

 // Method to insert a new node at the end of the list
 public void insert(int data) {
     Node newNode = new Node(data); // Create a new node
     if (head == null) { // If the list is empty, set new node as head
         head = newNode;
     } else {
         Node temp = head;
         while (temp.next != null) { // Traverse to the last node
             temp = temp.next;
         }
         temp.next = newNode; // Link the last node to the new node
     }
 }

 // Method to display the linked list
 public void display() {
     if (head == null) { // Check if the list is empty
         System.out.println("The list is empty.");
         return;
     }
     Node temp = head;
     while (temp != null) { // Traverse the list and print each node
         System.out.print(temp.data + " -> ");
         temp = temp.next;
     }
     System.out.println("NULL"); // Indicate the end of the list
 }
}

//Main class to interact with the user
public class UserLinkedList {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     LinkedList list = new LinkedList(); // Create an empty linked list

     while (true) {
         // Display menu options
         System.out.println("1. Insert\n2. Display\n3. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter value to insert: ");
                 int value = scanner.nextInt();
                 list.insert(value); // Insert value into the linked list
                 break;
             case 2:
                 list.display(); // Display the linked list
                 break;
             case 3:
                 System.out.println("Exiting...");
                 scanner.close(); // Close scanner and exit program
                 return;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }
}
