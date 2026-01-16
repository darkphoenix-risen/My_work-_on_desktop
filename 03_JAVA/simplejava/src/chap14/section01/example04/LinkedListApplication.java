package chap14.section01.example04;

import java.util.ArrayList;
import java.util.List;

public class LinkedListApplication {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("홍길동");
        list.add("장길산");
        list.add("임꺽정");
        System.out.println(
                list
        );
        list.remove(1);
        System.out.println(list);
    }
}
