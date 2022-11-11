package precourse.secondweek.thursday.mission1;

public class HyundaiFactory {

    // 클래스 내부에 private 인스턴스 생성
    private static HyundaiFactory getFactory = new HyundaiFactory();

    //생성자를 private 으로 선언해서 외부에서 객체생성 못하게 한다.
    private HyundaiFactory() {
    }

    public static HyundaiFactory getFactory() {

        return getFactory;
    }

    public static Car createCar() {
        Car car = new Car();
        return car;
    }

}
