package chap13.section02;

import java.util.Calendar;
import java.util.Date;

public class DateApplication {
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println(d.toString());
        System.out.println(d);//tostring 생략가능

        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        System.out.println(y);
        int m = c.get(Calendar.MONTH);
        System.out.println(m+1);
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
