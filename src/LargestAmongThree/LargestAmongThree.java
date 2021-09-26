package LargestAmongThree;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

      int  temp=a>b?a:b;

      int  largest=c>temp?c:temp;
        System.out.println("The largest number is: "+largest);

    }
}
