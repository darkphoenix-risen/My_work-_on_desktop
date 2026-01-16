package chap15.section02.example02;

import java.util.ArrayList;
import java.util.List;

public class S1_GenericApplication {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        //a.add("가"); //숫자만 됨

        List<Product> p = new ArrayList<>();//향상된 배열
        //product객체만 제한한 제네릭 부모제한
        List<Audio> c = new ArrayList<>(); //자식제한


        p.add(new Audio()); //자식저장 가능
      //  c.add(new Product()); //부모저장 불가
    }

}
