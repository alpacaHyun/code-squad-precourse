package precourse.thirdweek.tue.point;

public class Test {

    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint(0,0,"BLACK");
        String zeroP = zeroPoint.toString();
        System.out.println(zeroP);

        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str);
    }


}
