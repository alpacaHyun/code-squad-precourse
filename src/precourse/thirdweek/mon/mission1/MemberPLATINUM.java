package precourse.thirdweek.mon.mission1;

public class MemberPLATINUM extends Member {

    public MemberPLATINUM(String memberName, double shoppingAmount, int parkingTime) {
        super(memberName, shoppingAmount, parkingTime);
        memberGrade = "PLATINUM";
        this.pointRatio = 0.05;
        this.saleRatio = 0.95;

        getPayAmount();
        getEarnPoint();
        getParkingCost();
    }

    public int getParkingCost() {
        return parkingCost = 1000 * parkingTime;
    }

    public int getEarnPoint() {
        double calPoint = pointRatio * shoppingAmount;
        return earnPoint = (int) Math.round(calPoint);
    }

    public int getPayAmount() {
        return payAmount = (int) Math.round(saleRatio * shoppingAmount);
    }

}
