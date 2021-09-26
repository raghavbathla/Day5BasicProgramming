package ProgrameQuestionRemain;

import java.util.Scanner;

public class QuestionRemain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to divide");
        int num = scanner.nextInt();
        System.out.println("Enter the divident");
        int div = scanner.nextInt();
        System.out.println("Quotient is "+num/div);
        System.out.println("Remainder is "+num%div);
    }
}
