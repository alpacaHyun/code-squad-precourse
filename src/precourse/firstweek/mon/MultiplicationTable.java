package precourse.firstweek.mon;

public class MultiplicationTable {
    public static void main(String [] args){
        for(int i = 1; i <= 9; i++){
            System.out.println("**** i단 ***");
            for (int j = 1; j <= 9; j++){
                System.out.printf("%d x %d = %d  ",i,j,i*j);
                System.out.println(" ");
            }System.out.println(" ");
        }
    }

}
