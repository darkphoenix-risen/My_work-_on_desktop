package chap13.section02;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateApplication {

    public static void main(String[] args) {
        LocalDate a=LocalDate.now();
        System.out.println(a);
        System.out.println(a.getMonth());

        LocalTime t = LocalTime.now();
        System.out.println(t);
    }
}
