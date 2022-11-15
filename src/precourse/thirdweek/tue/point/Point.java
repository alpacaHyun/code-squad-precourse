package precourse.thirdweek.tue.point;

public class Point {

    protected int x, y;

    // PositivePoint 기본생성자 만들어주기 위해 Point 기본생성자 생성함
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected void move(int x, int y, int z) {
    }

    protected void moveUp() {
    }

    protected void moveDown() {
    }
}
