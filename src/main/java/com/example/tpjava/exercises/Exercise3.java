package com.example.tpjava.exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        int choice;

        do {
            System.out.println("\n===== STRING OPERATIONS MENU =====");
            System.out.println("1. Enter a string");
            System.out.println("2. Display the string");
            System.out.println("3. Reverse the string");
            System.out.println("4. Count number of words");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    text = scanner.nextLine();
                    System.out.println("String saved!");
                    break;
                case 2:
                    displayString(text);
                    break;
                case 3:
                    reverseString(text);
                    break;
                case 4:
                    countWords(text);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            if (choice != 0) {
                System.out.println("\nPress Enter to return to the menu...");
                scanner.nextLine();
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void displayString(String text) {
        if (text.isEmpty()) {
            System.out.println("No string entered yet!");
        } else {
            System.out.println("Your string: " + text);
        }
    }

    public static void reverseString(String text) {
        if (text.isEmpty()) {
            System.out.println("No string entered yet!");
        } else {
            String reversed = new StringBuilder(text).reverse().toString();
            System.out.println("Reversed string: " + reversed);
        }
    }

    public static void countWords(String text) {
        if (text.isEmpty()) {
            System.out.println("No string entered yet!");
            return;
        }

        String[] words = text.trim().split("\\s+");

        
        int wordCount = (text.trim().isEmpty()) ? 0 : words.length;

        System.out.println("Number of words: " + wordCount);
    }
}
