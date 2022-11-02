package precourse.firstweek.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecCrash {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String [] temp = a.split(" ");
        int [] nums = new int [temp.length];

        for(int i = 0; i < temp.length; i++){
            nums[i] = Integer.parseInt(temp[i]);
        }

//        int x = Integer.parseInt(br.readLine());
//        int y = Integer.parseInt(br.readLine());

        if(isInRec(nums[0],nums[1]) == true){
            System.out.println("충돌하지 않습니다.");
        }else{
            System.out.println("충돌합니다!");
        }
    }
    public static boolean isInRec(int x, int y){
        if((x>=100 && x <= 200) && (y >= 100 && y <= 200)){
            return true;
        }else{
            return false;
        }

    }
}
