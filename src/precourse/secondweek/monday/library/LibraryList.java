package precourse.secondweek.monday.library;

import java.util.ArrayList;

class LibraryList {

    public static ArrayList<String> libraryAList(){
        ArrayList<String> libraryA = new ArrayList<>();
        libraryA.add("|태백산맥 , 조정래|");
        libraryA.add("|이기적 유전자 , 리처드 도킨즈|");
        libraryA.add("|자전거 도둑 , 박완서|");
        libraryA.add("|토지 , 박경리|");
        libraryA.add("|대변동 , 제레드 다이몬드|");

        return libraryA;
    }

    static ArrayList<String> libraryA1List(){
        ArrayList<String> libraryA1 = new ArrayList<>();

        libraryA1 = libraryAList();

        return libraryA1;
    }

    static ArrayList<String> libraryBList(){
        ArrayList<String> libraryB = new ArrayList<>();

        libraryB.add("|태백산맥 , 조정래|");
        libraryB.add("|이기적 유전자 , 리처드 도킨즈|");
        libraryB.add("|자전거 도둑 , 박완서|");
        libraryB.add("|토지 , 박경리|");
        libraryB.add("|대변동 , 제레드 다이몬드|");

        return libraryB;
    }

}
//    private String [][] libraryList = new String [][] {
//        {"태백산맥 ", "조정래"},
//        {"이기적 유전자 ", "리처드 도킨즈"},
//        {"자전거 도둑 ", "박완서"},
//        {"토지 ", "박경리"},
//        {"대변동 ", "제레드 다이아몬드"}
//    };
