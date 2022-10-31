package firstweek;

import java.util.Scanner;

public class PrintStar1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        int j;

        for (i = 1; i <= N; i++){
            for(j =0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}
