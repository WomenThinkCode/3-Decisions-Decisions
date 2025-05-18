package org.example;

import java.util.*;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.print("Please enter any 5 numbers: "); 
        

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            } 
            try {
                int number = Integer.parseInt(input);
                nums.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or done");
            }
        }
        Collections.sort(nums);

        System.out.println("Ascending order: ");
        for (int number : nums) {
            System.out.print(number + "; ");
        }
        System.out.println();
        scanner.close();


        // if (nums < 5) {
        //     System.out.print("Please enter any 5 numbers: "); 
        // } else {

        // }
    }
}
