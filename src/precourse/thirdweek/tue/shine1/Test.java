package precourse.thirdweek.tue.shine1;

public class Test extends Point {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + " . ");
    }
}
