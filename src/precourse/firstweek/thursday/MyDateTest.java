package precourse.firstweek.thursday;

public class MyDateTest {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid());
    }
}

class MyDate{
    private int year;
    private int month;
    private int date;
    String isValid;

    int isLeapYear = 0;
    int [] maxDays={31 ,28 ,31 ,30 ,31 ,30 ,31 ,31 ,30 ,31 ,30 ,31 };
    int [] leapMaxDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    MyDate(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    void isLeapYear(){
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            isLeapYear = 1;
        }
    }

    void testValid(){
        isLeapYear();
        if (1 > month || month > 12 ){
            isValid = "유효하지 않은";
        }else if(isLeapYear == 1 && month == 2 && date <= 29){
            isValid = "유효하지 않은";
        }
        else{
            isValid = "유효한";
        }
    }

    String isValid(){
        testValid();
        String result;
        result = year + "년 " + month + "월 " + date + "일은 " + isValid + "날짜입니다.";
        return result;
    }

}
