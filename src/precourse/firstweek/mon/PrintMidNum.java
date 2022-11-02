package precourse.firstweek.mon;


import java.io.*;
import java.util.Arrays;

public class PrintMidNum {
    public static void main(String [] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String threeInt = bf.readLine();

        String [] temp = threeInt.split(" ");

//        int [] nums = Arrays.asList(temp).stream().mapToInt(Integer::parseInt).toArray();

//        int [] nums = new int[temp.length];
//        for (int i = 0; i < temp.length; i++){
//            nums [i] = Integer.parseInt(temp[i]);
//        }

        int [] nums = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
