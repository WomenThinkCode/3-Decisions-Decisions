package Exercises;

import java.util.Arrays;
import java.util.Scanner;


public class AscendingAndDescending {
    public static void main(String[] args) {

        int [] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();


            Arrays.sort(numbers);


            System.out.println("Numbers in ascending order:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();


            System.out.println("Numbers in descending order:");
            for (i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }

            scanner.close(); // Close the scanner
        }

    }
}
