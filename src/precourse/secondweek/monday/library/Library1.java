package precourse.secondweek.monday.library;

import java.util.ArrayList;

public class Library1 {
    public static void main(String[] args) {

        ArrayList<String> libraryA = new ArrayList<>();
        libraryA.add("|태백산맥 , 조정래|");
        libraryA.add("|이기적 유전자 , 리처드 도킨즈|");
        libraryA.add("|자전거 도둑 , 박완서|");
        libraryA.add("|토지 , 박경리|");
        libraryA.add("|대변동 , 제레드 다이몬드|");

        ArrayList<String> libraryA1 = new ArrayList<>();
        libraryA1.addAll(libraryA);


        ArrayList<String> libraryB = new ArrayList<>();
        libraryB.addAll(libraryA);

        System.out.println(libraryA);
        System.out.println(libraryA1);
        System.out.println(libraryB);

        libraryA.set(2, "|그 많던 싱아는 누가 다 먹었을까, 박완서|");
        libraryB.add(5, "|사피엔스, 유발 하라리|");

        System.out.println(libraryA);
        System.out.println(libraryB);

    }
}
