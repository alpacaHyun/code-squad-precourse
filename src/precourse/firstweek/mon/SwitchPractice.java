package precourse.firstweek.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchPractice {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("두 값을 입력하세요 : ");
        String a = br.readLine();
        int [] num = new int [a.length()];
        String [] b = a.split(" ");

        for(int i =0; i < b.length; i++){
            num[i] = Integer.parseInt(b[i]);
        }
        System.out.println("연산자를 입력하세요 : ");
        String operator = br.readLine();
        if(operator.equals("+")){
            System.out.printf(" %d + %d = %d 입니다.",num[0],num[1],num[0] + num[1]);
        }
        if(operator.equals("-")){
            System.out.printf(" %d - %d = %d 입니다.",num[0],num[1], num[0] + num[1]);
        }
        if(operator.equals("*")){
            System.out.printf(" %d * %d = %d 입니다.",num[0],num[1], num[0] + num[1]);
        }
        if(operator.equals("/")){
            System.out.printf(" %d / %d = %d 입니다.",num[0],num[1], num[0] + num[1]);
        }



//        switch(operator){
//            case 1:
//                System.out.printf("%d + %d = %d 입니다.",num[0],num[1], num[0] + num[1]);
//                break;
//            case 2:
//                System.out.printf("%d - %d = %d 입니다.",num[0], num[1], num[0] + num[1]);
//                break;
//            case 3:
//                System.out.printf("%d * %d = %d 입니다.",num[0], num[1], num[0] + num[1]);
//                break;
//            case 4:
//                System.out.printf("%d / %d = %d 입니다.",num[0], num[1], num[0] + num[1]);
//                break;
//        }
        }

//    final static void PROMPT(){
//        System.out.println("연산>>");
//    }
}
