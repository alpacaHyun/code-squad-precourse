package firstweek;

import java.util.Scanner;

public class CompareNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B){
            System.out.println(">");
        }
        if(A < B){
            System.out.println("<");
        }
        if (A == B){
            System.out.println("==");
        }
    }
}
