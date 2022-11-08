package precourse.firstweek.thursday.shineMission.circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleManager {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Circle circles1 = new Circle(3.0, 3.0, 5);
        Circle circles2 = new Circle(2.5, 2.7, 6);
        Circle circles3 = new Circle(5.0, 2.0, 4);

//        for(int i = 0; i < 3; i++){
//            circles1. = Integer.parseInt(br.readLine());
//        }


        // 배열?
        circles1.show();
        circles2.show();
        circles3.show();
    }
}
