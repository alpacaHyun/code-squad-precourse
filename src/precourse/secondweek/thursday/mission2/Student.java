package precourse.secondweek.thursday.mission2;

public class Student {
    static int serialNum;
    static String name;
    static String major;
    static int koreanScore;
    static int mathScore;
    static int englishScore;
    static int subjectCount;

    Student(String name, int serialNum, String major, int koreanScore, int mathScore, int englishScore,
            int subjectCount) {
        this.name = name;
        this.serialNum = serialNum;
        this.major = major;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }


    static Student studentKim = new Student("Kim", 1001, "'수학", 100, 100, englishScore, 2);
    static Student studentLee = new Student("Lee", 1002, "국어", 55, 55, 100, 3);


    static int totalScore() {
        return koreanScore + mathScore + englishScore;
    }

    static int averageScore() {
        return (koreanScore + mathScore + englishScore) / 3;
    }

    static String studentKimInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append(studentKim.name)
                .append("학생은 ")
                .append(studentKim.subjectCount)
                .append("과목을 수강했습니다. ")
                .append("\n")
                .append("총점은 ")
                .append(totalScore())
                .append("이고 ")
                .append("평균은 ")
                .append(averageScore())
                .append("입니다. ")
                .append("\n");
        return sb.toString();
    }

    static String studentLeeInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append(studentLee.name)
                .append("학생은 ")
                .append(studentLee.subjectCount)
                .append("과목을 수강했습니다. ")
                .append("\n")
                .append("총점은 ")
                .append(totalScore())
                .append("이고 ")
                .append("평균은 ")
                .append(averageScore())
                .append("입니다. ")
                .append("\n");
        return sb.toString();
    }


}
