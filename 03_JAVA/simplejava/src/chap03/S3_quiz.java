package chap03;

import java.util.Scanner;

public class S3_quiz {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if (b > 90) {
            System.out.println("A");
        } else if (b == 90) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}