import java.util.Scanner;
import java.util.Arrays;
public class AscendingAndDescending {
    public static void main(String[] args) {
        int[] ascending = new int[5];
        int[] descending = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int counter = 5; counter > 0; counter--) {
            System.out.println("Choose a random number");
            int choice = sc.nextInt();
            if (choice > ascending[0]) {
                ascending[4] = choice;
            } else if (choice < ascending[0]) {
                ascending[0] = choice;
            }
            if (choice > descending[0]) {
                descending[0] = choice;
            } else if (choice < descending[0]) {
                descending[4] = choice;
            }
        }System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));
    }
}

/*    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {

        arr[i] = i + 1;        // Fills array with values 1, 2, 3, 4, 5

    }*/