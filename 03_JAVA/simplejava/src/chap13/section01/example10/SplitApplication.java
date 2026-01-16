package chap13.section01.example10;

import java.util.Arrays;

public class SplitApplication {
    public static void main(String[] args) {
        String s = "123456-1234567";
        String[] a= s.split("-");
        System.out.println(a[0]);
        System.out.println(a[1]);
        //array 객체 : 목적)배열에 관한 것을 다루는 객체
        System.out.println(Arrays.toString(a));
    }
}
