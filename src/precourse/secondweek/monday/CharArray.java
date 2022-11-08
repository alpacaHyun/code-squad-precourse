package precourse.secondweek.monday;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] alphabetArray = new char[26];
        for(int i = 0; i < alphabetArray.length; i++){
            alphabetArray[i] = (char)('A' + i);
        }

        System.out.println(Arrays.toString(alphabetArray));


    }
}
