package precourse.secondweek.thursday.mission2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class File {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p1 = new PrintWriter("학생정보.txt");
        p1.write(Student.studentKimInformation());
        p1.write(Student.studentLeeInformation());
        p1.close();


    }
}
