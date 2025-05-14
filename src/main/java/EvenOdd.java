import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer of your choice");
    int choice = sc.nextInt();
    boolean isEven = true;
    boolean isOdd = false;
    if (choice%2 ==0){
        System.out.println(isEven);
    }else {
        System.out.println(isOdd);
    }

    }
}
