package precourse.thirdweek.tue.point;

public class ColorPoint extends Point {

    protected String color;

    public ColorPoint(int x, int y, String color) {
        super(x,y);
        this.color = color;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return color + "색의 " + "(" + x + "," + y + ")" + "의 점입니다.";
    }
}
