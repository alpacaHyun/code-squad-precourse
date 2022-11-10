package precourse.secondweek.thursday.mission1;


public class Car {
    private static int carNum = 1000;
    int carNumber = 0;

    public Car() {
        carNumber = carNum;
        carNum++;
    }

    public int showCarNumber() {
        return carNumber;
    }
}
