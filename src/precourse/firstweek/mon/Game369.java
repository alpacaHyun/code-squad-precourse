package precourse.firstweek.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game369 {
    public static void main (String [] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String num = bf.readLine();
        String [] a = num.split("");
        int clap = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i].equals("3") || a[i].equals("6") || a[i].equals("9")){
                clap++;
            }
        }
        if (clap == 1){
            System.out.println("박수짝");
        }
        if (clap >= 2){
            System.out.println("박수짝짝");
        }
    }
}
