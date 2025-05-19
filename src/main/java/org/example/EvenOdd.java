package org.example;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num % 2 == 0) {
            System.out.println("This number is: EVEN!");
        } else {
            System.out.println("This number is: ODD!");
        }

    }
}