package firstweek;

import java.util.Scanner;

public class OvenTimer {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if((B+C) < 60){
            System.out.println(A + " " +(B+C));
        }
        if((B+C) == 60){
            if(A == 23){
                System.out.println(0 +" "+ 0);
            }else {
                System.out.println(A + 1 + " " + 0);
            }
        }
        if ((B+C) > 60){
            if(A == 23){
                System.out.println(0 + " "+ (B+C-60));
            }else {
                System.out.println(A + 1 + " " + (B + C - 60));
            }
        }
    }
}
