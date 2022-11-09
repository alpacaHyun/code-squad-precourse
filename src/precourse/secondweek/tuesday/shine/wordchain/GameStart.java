package precourse.secondweek.tuesday.shine.wordchain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameStart {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        WordGameApp wga = new WordGameApp();

        System.out.println("끝말잇기 게임을 시작합니다... \n 게임에 참가하는 인원은 몇명입니까?");

        wga.num = Integer.parseInt(br.readLine());
        wga.run();
    }
}
