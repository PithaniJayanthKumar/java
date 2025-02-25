package com.wipro.java.usecases;

import java.util.Scanner;

public class CountPairs {

    public static int countPairs(int N, int[] A) {
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int min = Math.min(A[i], A[j]);
                boolean isValid = true;
                
                // Check if all elements between i and j are smaller than min
                for (int k = i + 1; k < j; k++) {
                    if (A[k] >= min) {
                        isValid = false;
                        break;
                    }
                }
                
                if (isValid) {
                    count++;
                }
            }
        }
        
        return count;
    }

    // Non-editable part
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        
        int N = scanner.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input");
                return;
            }
            A[i] = scanner.nextInt();
        }
        
        System.out.println(countPairs(N, A));
        scanner.close();
    }
}