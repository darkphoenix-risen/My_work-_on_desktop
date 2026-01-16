package chap01.section04;

import java.util.Scanner;

public class S1_Scanner {
    public static void main(String[] args) {
        //문장입력 .nextLine
        // 단어 입력 .next
        //숫자입력 (소수점) .nextDouble
        //숫자입력  .next
        //여러개 입력시 여러개 지정
        // 단어 1개만 입력가능

        Scanner a = new Scanner(System.in);
        String b = a.next();

        System.out.println(b);
    }
}
