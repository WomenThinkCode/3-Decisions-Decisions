package Exercises;

import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Room selection
        System.out.println("Please select a room type:");
        System.out.println("1 - Queen Bed (R500)");
        System.out.println("2 - King Bed (R700)");
        System.out.println("3 - King Bed + Pullout Couch (R900)");
        System.out.print("Pick a room (1, 2, or 3): ");
        int roomnumber = scanner.nextInt();

        String roomType = "";
        int basePrice = 0;

        switch (roomnumber) {
            case 1:
                roomType = "Queen Bed";
                basePrice = 500;
                break;
            case 2:
                roomType = "King Bed";
                basePrice = 700;
                break;
            case 3:
                roomType = "King Bed + Pullout Couch";
                basePrice = 900;
                break;
            default:
                System.out.println("Invalid room selection. Price: R0");
                scanner.close();
                return;
        }

        // View selection
        System.out.println("Please select the view:");
        System.out.println("1 - Lake View (R200 extra)");
        System.out.println("2 - Park View (no extra cost)");
        System.out.print("Pick a view (1 or 2): ");
        int viewchoice = scanner.nextInt();

        String viewType = "";
        int viewCost = 0;

        switch (viewchoice) {
            case 1:
                viewType = "Lake View";
                viewCost = 200;
                break;
            case 2:
                viewType = "Park View";
                viewCost = 0;
                break;
            default:
                System.out.println("Invalid view selection. Price: R0");
                scanner.close();
                return;
        }

        // Final output
        int totalPrice = basePrice + viewCost;
        System.out.println("Room Type: " + roomType);
        System.out.println("View Type: " + viewType);
        System.out.println("Total Price: R" + totalPrice);

        scanner.close();
    }
}






