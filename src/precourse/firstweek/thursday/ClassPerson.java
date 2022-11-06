package precourse.firstweek.thursday;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ClassPerson {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Woman woman = new Woman();

        woman.name = "Jane";
        woman.age = 30;
        woman.gender = "여성";
        woman.isMarriage = "기혼자";
        woman.kidsNumber = 1;

        System.out.println("이름은 " + woman.name + "이고 나이는 " + woman.age + "입니다. 성별은 " + woman.gender + "이며, " + woman.isMarriage + " 입니다. 자녀는 " + woman.kidsNumber + "명이 있습니다.");
        System.out.printf("이름은 %s이고 나이는 %d입니다. 성별은 %s이며, %s입니다. 자녀는 %d명 있습니다.", woman.name, woman.age, woman.gender, woman.isMarriage, woman.kidsNumber);
        bw.write("이름은 " + woman.name + "이고 나이는 " + woman.age + "입니다. 성별은 " + woman.gender + "이며, " + woman.isMarriage + " 입니다. 자녀는 " + woman.kidsNumber + "명이 있습니다.");
        bw.flush();
        bw.close();
    }

}

class Woman{

    String name;
    int age;
    String gender;
    String isMarriage;
    int kidsNumber;

}
