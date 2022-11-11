package precourse.secondweek.thursday.mission1;


public class Car {
    private static int carNum = 999;
    private int carNumber = 0;

    public Car() {
        carNum++;
        carNumber = carNum;
    }

    public int showCarNumber() {
        return carNumber;
    }
}
