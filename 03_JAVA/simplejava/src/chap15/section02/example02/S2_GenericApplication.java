package chap15.section02.example02;

import java.util.ArrayList;
import java.util.List;

public class S2_GenericApplication {
    public static void main(String[] args) {
        List<Product> p=new ArrayList<>();
        List<Audio> c = new ArrayList<>();

        List<? extends Audio> d= c; //c=자신, p=부모
        List<? super  Audio> e=p;
        List<?> f=c; //
    }
}
