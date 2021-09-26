package EvenOrOdd;

import java.util.Scanner;

public class EvenOrOddMain {
    public static void main(String[] args) {
        System.out.println("Enter the number to check");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
