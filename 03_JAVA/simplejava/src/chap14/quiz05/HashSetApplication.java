package chap14.quiz05;

import java.util.HashSet;
import java.util.Set;

public class HashSetApplication {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("가");
        set.add("가");
        set.add("나");
        set.add("나");
        System.out.println(set);
//      (참고) 반복문: 향상된 for문:
//      for (String 변수: 배열){실행문(변수)}
        System.out.println(set);
        for (String e : set) {
            System.out.println(e);
        }
    }
}