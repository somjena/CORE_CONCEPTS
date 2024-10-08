package com.conditional_Statement;

import java.util.Scanner;

public class Marraige_app {
    static int min_age = 25;
    static int max_age = 35;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        if (age >= min_age && age <= max_age) {
            System.out.println("You Are Eligible For Marriage");
        } else if (age > max_age) {
            System.out.println("You Are Not Eligible For Marriage");
        } else {
            System.out.println("Go To Himalaya and Praise Lord");
        }

        sc.close();  // Closing the scanner to avoid resource leak
    }
}