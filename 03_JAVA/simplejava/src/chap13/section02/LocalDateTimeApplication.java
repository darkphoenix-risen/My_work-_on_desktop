package chap13.section02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApplication {
    public static void main(String[] args) {
        LocalDateTime l=LocalDateTime.now();
        System.out.println(l);

        DateTimeFormatter d
                =DateTimeFormatter.ofPattern("yyyy=MM-dd HH:mm:ss");
        String s=l.format(d);
        System.out.println(s);

    }
}
