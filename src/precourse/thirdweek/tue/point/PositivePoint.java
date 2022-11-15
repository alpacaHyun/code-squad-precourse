package precourse.thirdweek.tue.point;

public class PositivePoint extends Point {

    public PositivePoint(){
    }

    public PositivePoint(int x, int y) {
        if(x > 0 && y > 0) {
            this.x =x;
            this.y = y;
        }
        if(this.x <= 0 || this.y <= 0){
            this.x = 0;
            this.y = 0;
        }
    }

    protected void move(int x, int y) {
        if (x > 0 && y > 0) {
            this.x = x;
            this.y = y;
        }
        if(x <= 0 || y <= 0) {
            this.x = super.x;
            this.y = super.y;
        }
    }

    public String toString() {
        return "(" + x + "," + y + ")" + "의 점입니다.";
    }
}
