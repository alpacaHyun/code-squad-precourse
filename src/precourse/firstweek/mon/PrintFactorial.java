package precourse.firstweek.mon;

import java.util.Scanner;

public class PrintFactorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.nextLine();
        sc.close();

        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += a.charAt(i)-'0';
        }
        System.out.println(sum);

    }
}
