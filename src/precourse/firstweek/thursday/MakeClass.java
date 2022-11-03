package precourse.firstweek.thursday;

public class MakeClass {
    static int a = 10;
    static int b = 2;
    public static void main (String [] args){
        CalculatePlus.calPlus(a, b);
        CalculateMinus.calMinus(a, b);
        CalculateMultiplication.calMultiplication(a, b);
        CalculateDivide.calDivide(a, b);
    }
}

class CalculatePlus{
    public static void calPlus(int a, int b){
        int answer = a + b;

        System.out.printf("%d + %d = %d \n", a, b, answer);
    }
}

class CalculateMinus{
    public static void calMinus(int a, int b){
        int answer = a - b;

        System.out.printf("%d - %d = %d \n", a, b, answer);
    }
}

class CalculateMultiplication{
    public static void calMultiplication(int a, int b){
        int answer = a * b;

        System.out.printf("%d * %d = %d \n" , a, b, answer);
    }
}

class CalculateDivide{
    public static void calDivide(int a, int b){
        int answer = a / b;

        System.out.printf("%d / %d = %d \n", a, b, answer);
    }
}
