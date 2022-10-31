package firstweek;

import java.util.Scanner;

public class Testing {
    public static void main(String []args){
        String result = null;
        Scanner sc = new Scanner(System.in);

        int testScore = sc.nextInt();
        if(90<=testScore && testScore<=100){
            result = "A";
            System.out.println(result);
        }
        if(80<=testScore && testScore<=89){
            result = "B";
            System.out.println(result);
        }
        if(70<=testScore && testScore<=79){
            result = "C";
            System.out.println(result);
        }
        if(60<=testScore && testScore<=69){
            result = "D";
            System.out.println(result);
        }
        if(0<=testScore && testScore<=59){
            result = "F";
            System.out.println(result);
        }
    }
}
