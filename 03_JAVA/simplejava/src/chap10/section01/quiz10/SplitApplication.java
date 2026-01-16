package chap10.section01.quiz10;

import java.util.Arrays;

public class SplitApplication {
    public static void main(String[] args) {
        String n="010-123-1234";
        String []a= n.split("-");

        System.out.println(Arrays.toString(a));
    }

}
