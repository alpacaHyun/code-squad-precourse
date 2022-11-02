package precourse.firstweek.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideNum {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();                             //두 수 입력받기
        String [] temp = num.split(" ");                 // 문자열로 두 수 입력

        double [] twoNum = new double [num.length()];          // 문자열 double 형으로 변경
        for (int i = 0; i < temp.length; i++){
            twoNum[i] = Double.parseDouble(temp[i]);
        }
        System.out.println(twoNum[0]/twoNum[1]);
    }
}
