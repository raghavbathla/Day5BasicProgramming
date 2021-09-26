package Swapping;

import java.util.Scanner;

public class SwapTheNum {
    public void swapping(){
        System.out.println("ENter Two numbers you want to swap");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = num1;
        num1=num2;
        num2=num3;
        System.out.println("Swapped value is " + num1 +"and"+num2);
    }
}
