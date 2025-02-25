package com.wipro.java.usecases;


import java.util.Scanner;

// write your logic here:
class Stack<T> {
    private Node<T> top;

    // Node class to represent each element in the stack
    private static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data) {
            this.data = data;
        }
    }
    
    // push(): Adds the specified item to the top of the stack.
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
    }
    
    // pop(): Removes and returns the item from the top of the stack.
    // Returns null if the stack is empty.
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T item = top.data;
        top = top.next;
        return item;
    }
    
    // peek(): Returns the item from the top of the stack without removing it.
    // Returns null if the stack is empty.
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }
    
    // isEmpty(): Returns true if the stack is empty, false otherwise.
    public boolean isEmpty() {
        return top == null;
    }
}

// non editable starts here
public class GenericLinkedList {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            integerStack.push(userInput);
        }

        System.out.println("Peek: " + integerStack.peek());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());

        // Prompt for string stack (if needed for clarity, uncomment the next line)
        // System.out.println("Enter strings to push onto the stack (enter an empty string to stop):");
        Stack<String> stringStack = new Stack<>();
        scanner.nextLine(); // clear the newline

        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            stringStack.push(userInput);
        }

        System.out.println("Peek: " + stringStack.peek());
        scanner.close();
    }

}
// non editable ends here