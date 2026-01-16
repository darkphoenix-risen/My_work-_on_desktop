package chap01.section04;

import java.util.Scanner;

public class S5_Scanner {
    public static void main(String[] args) {
//문장입력 .nextLine
        // 단어 입력 .next
        //숫자입력 (소수점) .nextDouble
        //숫자입력  .next

        Scanner a=new Scanner(System.in);
        String b = a.nextLine();

        System.out.println(b);
    }
}
