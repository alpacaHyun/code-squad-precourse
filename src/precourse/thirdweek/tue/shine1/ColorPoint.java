package precourse.thirdweek.tue.shine1;

public class ColorPoint extends Point {

    protected int x;
    protected int y;
    protected String color;

    ColorPoint(int x, int y, String color) {
        this.x = x;
        this.y = y;
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
