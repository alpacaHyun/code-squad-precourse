package precourse.thirdweek.tue.point;

public class Point3D extends Point {
    protected int z;

    Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    protected void moveUp() {
        this.z = z + 1;
    }

    protected void moveDown() {
        this.z = z - 1;
    }


    protected void move(int x, int y, int z) {
        this.x = x;
        this.y = y;
//        super(x, y); // 안되는 이유가 super 는 생성자에서만 사용하는지?
        this.z = z;
    }

    public String toString() { // protected 가 안되는 이유가 Test3D 에서 x,y,z 값을 받아오기 때문인건가?
        return "(" + x + "," + y + "," + z + ")" + "의 점입니다.";
    }

}
