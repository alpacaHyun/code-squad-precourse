package precourse.thirdweek.mon.mission1;

public class MemberDIAMOND extends Member {
    protected int agentID = 1000;

    public MemberDIAMOND(String memberName, double shoppingAmount, int parkingTime){
        super(memberName, shoppingAmount, parkingTime);
        memberGrade = "DIAMOND";
        this.pointRatio = 0.1;
        this.saleRatio = 0.9;

        getPayAmount();
        getEarnPoint();
        getParkingCost();
        getAgentID();
    }
    public int getPayAmount() {
        return payAmount = (int) Math.round(saleRatio * shoppingAmount);
    }

    public int getEarnPoint() {
        double calPoint = pointRatio * shoppingAmount;
        return earnPoint = (int) Math.round(calPoint);
    }

    public int getParkingCost() {
        return parkingCost = 0 * parkingTime;
    }

    public int getAgentID(){
        return agentID;
    }

}
