package precourse.thirdweek.tue.point;

public class Test3D {

    public static void main(String[] args) {
        Point p = new Point3D(1, 2, 3);
        String xyzString = p.toString();
        System.out.println(xyzString);

        p.moveUp();
        xyzString = p.toString();
        System.out.println(xyzString);

        p.moveDown();

        p.move(10, 10);// x, y
        xyzString = p.toString();
        System.out.println(xyzString);

        p.move(100, 200, 300);// x, y, z
        xyzString = p.toString();
        System.out.println(xyzString);
    }
}
