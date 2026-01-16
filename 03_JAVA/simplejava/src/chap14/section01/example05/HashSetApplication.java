package chap14.section01.example05;

import java.util.HashSet;
import java.util.Set;

public class HashSetApplication {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();

        set.add("a");
        set.add("a");
        set.add("d");
        System.out.println(set);

        set.remove("d");
        System.out.println(set);
    }
}
