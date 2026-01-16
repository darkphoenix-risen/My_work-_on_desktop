package chap14.section03.example01;

import java.util.Arrays;
import java.util.Collections;

public class ArraysApplication {
    public static void main(String[] args) {
        int[] a = {0, 1, 2};
//반복문 돌려서 볼수있다
        System.out.println(Arrays.toString(a));

      int[] [] b = {{10, 11},{12, 13}};

        System.out.println(Arrays.deepToString(b));

        int[] c = new int[3];
        Arrays.fill(c, 9);
        System.out.println(Arrays.toString(c));

        String[] d={"A", "C", "B"};
        Arrays.sort(d, Collections.reverseOrder());
        System.out.println(Arrays.toString(d));

        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
    }
}
