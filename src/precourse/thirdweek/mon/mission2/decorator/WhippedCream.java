package precourse.thirdweek.mon.mission2.decorator;

public class WhippedCream extends Decorator{

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.println("Adding Whipped Cream");
    }


}
