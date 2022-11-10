package precourse.mission;

public class Car {
    private static int carNum = 999; // static 함으로써 모든 차에서 carNum을 사용할 수 있도록 함 
    int carNumber = 0;

    public Car() {
        carNum++;
        carNumber = carNum;
    }

    public int showCarNumber() {
        return carNumber;
    }
}
