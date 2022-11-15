package precourse.thirdweek.tue.point;

public class TestPositive {
    public static void main(String[] args) {

        Point positivePoint = new PositivePoint();

        positivePoint.move(10, 10);
        String positiveP = positivePoint.toString();
        System.out.println(positiveP);

        positivePoint.move(-5, 5);
        positiveP = positivePoint.toString();
        System.out.println(positiveP);

        Point positivePoint2 = new PositivePoint(-10, -10);
        positiveP = positivePoint2.toString();
        System.out.println(positiveP);

    }
}
