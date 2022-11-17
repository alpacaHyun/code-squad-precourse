package precourse.thirdweek.thu.mission1;

public class PlayerLv1 extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("천천히 달립니다");
    }
    @Override
    public void jump() {
        System.out.println("jump 할 줄 모르지롱~");
    }

    @Override
    public void turn() {
        System.out.println("turn 할 줄 모르지롱~");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***초급 레벨입니다***");
    }
}
