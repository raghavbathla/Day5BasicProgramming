package PowerOfTwo;

import LeapYear.LeapYearClass;

import java.util.Scanner;

public class PowerOFTwoClass {
    public   boolean checkYear(int year)
    {

        if (year % 400 == 0)
            return true;

        if (year % 100 == 0)
            return false;

        if (year % 4 == 0)
            return true;
        return false;
    }

    public int input(){
        System.out.println("Enter the number between 0 to 30 ");
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
             num = scanner.nextInt();
            if(num>=0 && num<31){
                flag = false;
            }
else{
    System.out.println("Please Enter num between 0 to 30");
            }
        }

        return num;
    }


    public void powerOfTwo(int n){
        for(int i =0;i<=n;i++)
        {
        int number =(int) Math.pow(2,i);
            System.out.println(number);
            System.out.println(checkYear(number)? "Leap Year" : "Not a Leap Year" );

        }
    }

}
