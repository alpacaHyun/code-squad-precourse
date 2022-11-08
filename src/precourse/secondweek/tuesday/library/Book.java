package precourse.secondweek.tuesday.library;

class Book implements Cloneable {

    private String bookName;
    private String author;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public void changeName(String bookName) {
        this.bookName = bookName;
    }

    public String getName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String showBookInfo() {
        return "[" + bookName + "|" + author + "]";
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
