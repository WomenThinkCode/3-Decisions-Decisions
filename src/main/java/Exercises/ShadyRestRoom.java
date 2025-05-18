package Exercises;

import java.util.Scanner;

public class ShadyRestRoom {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in );
        System.out.println("Please select a room type:");
        System.out.println("1 - Queen Bed (R500)");
        System.out.println("2 - King Bed (R700)");
        System.out.println("3 - King Bed + Pullout Couch (R900)");
        System.out.println("pick a room (1,2,3)");
        int roomnumber = scanner.nextInt();


        switch (roomnumber) {
            case 1:
                System.out.println("R500");
                break;
            case 2:
                System.out.println("R700");
                break;
            case 3:
                System.out.println("R900");
                break;
            default:
                System.out.println("R0");
        }

    }

}
