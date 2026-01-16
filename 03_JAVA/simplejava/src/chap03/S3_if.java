package chap03;

import java.util.Scanner;

public class S3_if {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        if (b >9) {
            System.out.println("출발");

        } else if (b==9){
            System.out.println("준비");
        } else {
            System.out.println("대기");
        }
    }
}
