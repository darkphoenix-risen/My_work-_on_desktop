package second;

import java.util.Scanner;

public class no02 {

    // a=> 19이상 성인
    // 이하 미성년자

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();



        if (b >= 19) {
            System.out.println("성인");

        }
        else {
            System.out.println("미성년자");
        }
    }

}
