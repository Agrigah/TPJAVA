package com.example.tpjava.exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text (max. 100 characters): ");
        String text = scanner.nextLine();


        if (text.length() > 100) {
            System.out.println("Text too long! Maximum 100 characters.");
            scanner.close();
            return;
        }


        String originalText = text;


        int[] nbOccurrences = new int[26];


        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int index = c - 'A';
                nbOccurrences[index]++;
            }
        }


        System.out.println("\nThe string \"" + originalText + "\" contains:");

        boolean found = false;
        for (int i = 0; i < 26; i++) {
            if (nbOccurrences[i] > 0) {
                found = true;
                char letter = (char) ('A' + i);
                if (nbOccurrences[i] == 1) {
                    System.out.println(nbOccurrences[i] + " occurrence of the letter '" + letter + "'");
                } else {
                    System.out.println(nbOccurrences[i] + " occurrences of the letter '" + letter + "'");
                }
            }
        }

        if (!found) {
            System.out.println("No letters found in the text.");
        }

        scanner.close();
    }
}
