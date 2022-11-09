package precourse.secondweek.tuesday.shine.wordchain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// class 다시 만들기
public class Player {

    private String name;
    private static String nowWord = "기러기";
    private static String lastWord;


    public Player(String name) {
        this.name = name;
    }

    public void getWordFromUser() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(this.name + ">>");

        lastWord = nowWord;
        nowWord = br.readLine();
    }

    public void checkSuccess() {

        int lastIndex = lastWord.length()-1;
        char lastChar = lastWord.charAt(lastIndex);
        char firstChar = nowWord.charAt(0);

        if(lastChar != firstChar){
            System.out.println(name + "이(가) 졌습니다.");
            WordGameApp.gameContinue = false;
        }

    }
}
