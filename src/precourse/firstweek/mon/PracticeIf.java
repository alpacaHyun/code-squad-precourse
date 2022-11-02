package precourse.firstweek.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeIf {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String b = br.readLine();

        String[] num1 = b.split(" ");
        int[] num = new int[num1.length];
        for (int i = 0; i < num1.length; i++) {
            num[i] = Integer.parseInt(num1[i]);
        }
        br.close();
        if (100 < num[0] && num[0] <= 200 && 100 <= num[1] && num[1] <= 200) {
            System.out.printf("(%d , %d) 는 안에 있습니다.", num[0], num[1]);
        } else {
            System.out.printf("(%d , %d) 는 밖에 있습니다.", num[0], num[1]);
        }
    }
}



