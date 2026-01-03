package com.example.tpjava.exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un verbe du premier groupe : ");
        String verb = scanner.nextLine().trim().toLowerCase();


        if (!verb.endsWith("er")) {
            System.out.println("Erreur : Le verbe doit se terminer par 'er'");
            scanner.close();
            return;
        }


        String root = verb.substring(0, verb.length() - 2);


        System.out.println("\nConjugaison au présent :");
        System.out.println("→ je " + root + "e");
        System.out.println("→ tu " + root + "es");
        System.out.println("→ il/elle " + root + "e");
        System.out.println("→ nous " + root + "ons");
        System.out.println("→ vous " + root + "ez");
        System.out.println("→ ils/elles " + root + "ent");

        scanner.close();
    }
}