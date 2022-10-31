package firstweek;

import java.util.Scanner;

public class CompareNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("두 수를 입력하세요 : ");

        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A + " " + B);

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
