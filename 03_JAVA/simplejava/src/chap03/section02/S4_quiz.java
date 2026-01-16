package chap03.section02;

import java.util.Scanner;

public class S4_quiz {
    public static void main(String[] args) {
        System.out.println("구구단의 몇단을 원해?");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.println(b +"단을 입력했네? 공부해ㅋ");

        for (int i = 1; i <= 9; i++) {
            System.out.println(b + "x" + i + "=" +(i*b));
        }
    }
}
