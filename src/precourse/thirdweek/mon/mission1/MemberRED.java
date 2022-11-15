package precourse.thirdweek.mon.mission1;

public class MemberRED extends Member {

    public MemberRED(String memberName, double shoppingAmount, int parkingTime) {
        super(memberName, shoppingAmount, parkingTime);
        memberGrade = "RED";
        this.pointRatio = 0.01;
        this.saleRatio = 1;

    }
    public int getPayAmount() {
        return payAmount = (int) Math.round(saleRatio * shoppingAmount);
    }

    public int getEarnPoint() {
        double calPoint = pointRatio * shoppingAmount;
        return earnPoint = (int) Math.round(calPoint);
    }

    public int getParkingCost() {
        return parkingCost = 3000 * parkingTime;
    }


}
