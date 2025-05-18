//package Exercises;
//import java.util.Scanner;
//
//public class EvenOdd {
//    public static void main(String[] args) {
//
//        int number;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        number = scanner.nextInt();
//
//        boolean isEven =  number % 2 == 0;
//        boolean isOdd = !isEven;
//
//        System.out.println();
//
//
//        }
//    }

package Exercises;
import java.util.Scanner;

public class EvenOdd {

    // Method to check if the number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.println("Enter a number:");
        number = scanner.nextInt();

        // Pass the number to the isEven method and store the result
        boolean result = isEven(number);

        // Display the result
        if (result) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

        scanner.close(); // Close the scanner

    }
}