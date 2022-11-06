package precourse.firstweek.thursday.shineMission.rectangle;

public class CalRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle y = new Rectangle(1, 1, 10, 10);

        r.area(r.width, r.height);
        r.show();

        s.area(s.width, s.height);
        s.show();

        y.area(y.width, y.height);
        y.show();

    }
    }


