package precourse.firstweek.thursday;

public class ClassPerson {

    public static void main(String[] args) {
        Woman woman = new Woman();

        woman.name = "Jane";
        woman.age = 30;
        woman.sex = "여성";
        woman.isMarriage = "기혼자";
        woman.kidsNumber = 1;

        System.out.println("이름은 " + woman.name + "이고 나이는 " + woman.age + "입니다. 성별은 " + woman.sex + "이며, " + woman.isMarriage + " 입니다. 자녀는 " + woman.kidsNumber + "명이 있습니다.");
    }

}

class Woman{

    String name;
    int age;
    String sex;
    String isMarriage;
    int kidsNumber;

}
