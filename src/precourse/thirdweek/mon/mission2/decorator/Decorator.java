package precourse.thirdweek.mon.mission2.decorator;

// 상속에만 목적을 두는 클래스도 추상 클래스로 정의한다.
public abstract class Decorator extends Coffee{

    Coffee coffee;
    public Decorator (Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
