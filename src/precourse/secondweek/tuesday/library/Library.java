package precourse.secondweek.tuesday.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static List<Book> libraryListA() {
        List<Book> libraryA = new ArrayList<>();
        libraryA.add(new Book("태백산맥", "조정래"));
        libraryA.add(new Book("이기적 유전자", "리처드 도킨즈"));
        libraryA.add(new Book("자전거 도둑", "박완서"));
        libraryA.add(new Book("토지", "박경리"));
        libraryA.add(new Book("대변동", "제레드 다이아몬드"));

        return libraryA;
    }

    // 얕은 복사
    public static List<Book> libraryListA_1() {
        List<Book> libraryACopy = new ArrayList<>(libraryListA());

        return libraryACopy;
    }
    // 깊은 복사

    public static List<Book> libraryListB() throws CloneNotSupportedException {
        ArrayList<Book> libraryB = new ArrayList<>();
        for (Book book : libraryListA()) {
            libraryB.add((Book) book.clone());
        }
        return libraryB;
    }

    // 도서관 A 출력
    public static void PrintLibraryA() {
        System.out.println("A 도서관 도서 목록");
        for (int i = 0; i < libraryListA().size(); i++) {
            System.out.println(libraryListA().get(i).showBookInfo());
        }
        System.out.println();
    }

    //도서관 A_1 출력
    public static void PrintLibraryA_1() {
        System.out.println("A_1 도서관 도서 목록");
        for (int i = 0; i < libraryListA_1().size(); i++) {
            System.out.println(libraryListA_1().get(i).showBookInfo());
        }
        System.out.println();
    }

    // 도서관 B 출력
    public static void PrintLibraryB() throws CloneNotSupportedException {
        System.out.println("B 도서관 도서 목록");
        for (int i = 0; i < libraryListB().size(); i++) {
            System.out.println(libraryListB().get(i).showBookInfo());
        }
        System.out.println();
    }

    public static List<Book> changeLibraryList() {
        List<Book> changedLibraryAList = libraryListA();
        changedLibraryAList.get(2).setBookName("그 많던 싱아는 누가 먹었을까?");
        changedLibraryAList.get(2).setAuthor("박완서");

        return changedLibraryAList;
    }

    public static List<Book> addLibraryBList() throws CloneNotSupportedException {
        List<Book> changedLibraryBList = libraryListB();
        changedLibraryBList.add(new Book("호모 사피엔스", "유발 하라리"));

        return changedLibraryBList;
    }

    public static void printNewLibraryA() {
        System.out.println("A 도서관 도서 목록");
        for (int i = 0; i < libraryListA().size(); i++) {
            System.out.println(changeLibraryList().get(i).showBookInfo());
        }
        System.out.println();
    }

    public static void printNewLibraryB() throws CloneNotSupportedException {
        System.out.println("B 도서관 목록");
        for (int i = 0; i < addLibraryBList().size(); i++) {
            System.out.println(addLibraryBList().get(i).showBookInfo());
        }
    }

}
