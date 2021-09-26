package FlipCoin;

import java.util.Scanner;

public class FlipCoin {

    Scanner scanner;

    public FlipCoin() {
       scanner = new Scanner(System.in);
    }

    public int getNum(){
        System.out.println("Please Enter Number of flip a coin");
        int num = scanner.nextInt();
        return num;
    }

    public double getHeadPercentage(int num){
        //int lete toh kyu
        double numHead = 0;

        for (int i = 0;i<=num;i++){
            double random = Math.random();
            if(random>0.5){
                System.out.println(random);
                ++numHead;
            }
        }


       double headPereceent = numHead/num*100;
        System.out.println(numHead);
        System.out.println(num);
        System.out.println(headPereceent);
        return headPereceent;
    }


}
