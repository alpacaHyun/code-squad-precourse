package precourse.firstweek.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alarm {
    public static void main(String [] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int H = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());


        if((M-45) < 0){
            if(H == 0){
                System.out.println((23) + " " + (M+15));
            }if(H > 0) {
                System.out.println((H - 1) + " " + (M+15));
            }
        }
        if((M-45) >= 0){
            System.out.println(H + " " + (M-45));
        }
    }
}
