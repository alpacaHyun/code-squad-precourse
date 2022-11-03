package precourse.firstweek.thursday;

public class LeftMoney {

    public static int leftMoney(int a, int b){
        int answer = a - b;
        return answer;
    }

    public static void main(String[] args) {

        InformationOfPerson JamesInfo = new InformationOfPerson();
            JamesInfo.name = "James";
            JamesInfo.moneyInHand = 5000;
            JamesInfo.CoffeeShopName = "별 다방";
            JamesInfo.CoffeeMenu = "아메리카노";
            JamesInfo.payedMoney = 4000;

        InformationOfPerson TomasInfo = new InformationOfPerson();
        TomasInfo.name = "Tomas";
        TomasInfo.moneyInHand = 10000;
        TomasInfo.CoffeeShopName = "콩 다방";
        TomasInfo.CoffeeMenu = "라떼";
        TomasInfo.payedMoney = 5000;

        System.out.println(JamesInfo.name + "님의 남은 돈은 " + leftMoney(JamesInfo.moneyInHand, JamesInfo.payedMoney) + "원 입니다. " + JamesInfo.CoffeeShopName + "에서 " + JamesInfo.CoffeeMenu + "를 마셨습니다." );
        System.out.println(TomasInfo.name + "님의 남은 돈은 " + leftMoney(TomasInfo.moneyInHand, TomasInfo.payedMoney) + "원 입니다. " + TomasInfo.CoffeeShopName + "에서 " + TomasInfo.CoffeeMenu + "를 마셨습니다." );

    }
}

class InformationOfPerson{

    String name;
    int moneyInHand;
    String CoffeeShopName;
    String CoffeeMenu;
    int payedMoney;

}
