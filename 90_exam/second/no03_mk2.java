package second;

import java.util.Arrays;
import java.util.Scanner;

public class no03_mk2 {
    public static void main(String[] args) {
        System.out.println("숫자를 설정해줘");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println(n + "개의 숫자를 입력해줘");

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a.nextInt();
        }
        System.out.println("오름차순으로 정렬해줄게");

        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            System.out.print(
                    b[i] + " "
            );
        }
    }
}
