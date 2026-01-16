package chap01.section04;

import java.util.Scanner;

public class S3_Scanner {
    public static void main(String[] args) {
        //문장입력 .nextLine
        // 단어 입력 .next
        //숫자입력 (소수점) .nextDouble
        //숫자입력  .next
        //여러개 입력시 여러개 지정

        Scanner a = new Scanner(System.in);
        double b = a.nextDouble();

        System.out.println(b);
    }
}
