package precourse.mission;

public class Car {
    private static int carNum = 999;
    int carNumber = 0;

    public Car() {
        carNum++;
        carNumber = carNum;
    }

    public int showCarNumber() {
        return carNumber;
    }
}
