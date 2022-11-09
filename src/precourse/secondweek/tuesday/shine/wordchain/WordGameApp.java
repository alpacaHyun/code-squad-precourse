package precourse.secondweek.tuesday.shine.wordchain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordGameApp {

    public int num;
    public String word;
    public static boolean gameContinue = true;

    public void wordGameApp() throws IOException {
    }



    public void run() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Player[] player = new Player[num];
        word = "기러기";

        for (int i = 0; i < num; i++){

            System.out.println("참가자의 이름을 입력하세요");
            String name = br.readLine();
            player[i] = new Player(name);
        }

        System.out.println("시작하는 단어는" + word + "입니다");


        while(gameContinue){

            for (int i = 0; i < num; i++){
                player[i].getWordFromUser();
                player[i].checkSuccess();

            }

        }

    }


}
