package precourse.mission;

public class CarTest {

    public static void main(String[] args) {
        Car firstCar = HyundaiFactory.createCar();
        Car secondCar = HyundaiFactory.createCar();

        System.out.println("첫번째 차 번호는" + firstCar.showCarNumber());
        System.out.println("두번째 차 번호는" + secondCar.showCarNumber());
    }
}
