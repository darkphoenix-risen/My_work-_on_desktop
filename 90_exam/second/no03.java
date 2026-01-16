package second;

import java.util.Arrays;
import java.util.Scanner;

public class no03 {
    public static void main(String[] args) {

        System.out.println("5개의 숫자를 입력");
        Scanner a = new Scanner(System.in);
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
           b[i] = a.nextInt();
        }
        System.out.println("오름차순으로 정렬해줄게");

        Arrays.sort(b);
        for (int i = 0; i < 5; i++) {
            System.out.print(
                    b[i] + " "
            );
        }
    }
}
