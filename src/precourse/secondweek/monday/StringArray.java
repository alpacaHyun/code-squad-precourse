package precourse.secondweek.monday;

import java.util.ArrayList;

public class StringArray {
    public static void main(String[] args) {
        String [] capital = {"A ", "B ", "C ", "D ", "E ", "F ", "G ", "H ", "I ", "J ", "K ", "L ", "M ", "N ", "O ", "P ", "Q ", "R ", "S ", "T ", "U ", "V ", "W ", "X ", "Y ", "Z "};
        ArrayList<String> smallLetter = new ArrayList<>();
        ArrayList<String> capitalLetter = new ArrayList<>();

        for(int i = 0; i < capital.length; i++){
            capitalLetter.add(capital[i]);
            smallLetter.add(capital[i].toLowerCase());
        }

        System.out.println(capitalLetter);
        System.out.println(smallLetter);
    }
}
