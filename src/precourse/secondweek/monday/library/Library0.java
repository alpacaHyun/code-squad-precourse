package precourse.secondweek.monday.library;

public class Library0 {
    public static void main(String[] args) {
        System.out.println(LibraryList.libraryAList());
        System.out.println(LibraryList.libraryA1List());
        System.out.println(LibraryList.libraryBList());

        LibraryList.libraryAList().set(2, "|그 많던 싱아는 누가 다 먹었을까, 박완서 |");
        LibraryList.libraryBList().add(5,"|사피엔스 , 유발 하라리|");

        System.out.println(LibraryList.libraryAList());
        System.out.println(LibraryList.libraryBList());
    }
}


