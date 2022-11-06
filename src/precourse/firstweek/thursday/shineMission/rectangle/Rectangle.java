package precourse.firstweek.thursday.shineMission.rectangle;
class Rectangle {
    int x;
    int y;
    int width;
    int height;

    Rectangle(int x, int y, int width, int height){   // 공통으로 실행되는 생성자
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    }
    public int area(int width, int height){
        return width * height;
    }
    void show(){
        System.out.println( "좌표: (" + x + "," + y + ") " + "넓이: " + area(width, height));
    }

//    boolean contains(Rectangle r){
//        if()
//        return true;
//    }
}
