package precourse.firstweek.thursday.shineMission.grade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Grade {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("수학, 과학, 영 순으로 3개의 성적 입력. " + "\n");
        bw.flush();

        int mathScore = Integer.parseInt(br.readLine());
        int scienceScore = Integer.parseInt(br.readLine());
        int englishScore = Integer.parseInt(br.readLine());

        bw.write("평균은 : " + Average.averageScore(mathScore, scienceScore, englishScore) + "\n");
        bw.flush();
        bw.close();
    }
}


