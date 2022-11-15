package precourse.thirdweek.mon.mission1;

public class Member {
    protected double saleRatio;
    protected double pointRatio;
    protected int parkingTime;
    protected int parkingCost;
    protected int payAmount;
    protected double shoppingAmount;
    protected int earnPoint;
    protected String memberGrade;
    protected String memberName;

    public Member(String memberName, double shoppingAmount, int parkingTime) {
        this.memberName = memberName;
        this.shoppingAmount = shoppingAmount;
        this.pointRatio = pointRatio;
        this.parkingTime = parkingTime;
    }

    public String showMemberInfo() {
        return memberName + "님의 지불 금액은 " + payAmount + "이며, 적립 포인트는 " + earnPoint + "점 입니다.\n" + "주차 요금은 "
                + parkingCost + "입니다.";
    }


    public int getPayAmount() {
        return payAmount = (int) Math.round(saleRatio * shoppingAmount);
    }

    public void setShoppingAmount(int shoppingAmount) {
        this.shoppingAmount = shoppingAmount;
    }

    public int getEarnPoint() {
        return earnPoint; // 할인 후 포인트 적립?
    }

    public int getParkingCost() {

        return parkingTime;
    }

}
