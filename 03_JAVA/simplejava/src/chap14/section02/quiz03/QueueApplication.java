package chap14.section02.quiz03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApplication {
    public static void main(String[] args) {
        //queue는 객체를 만들수 없다. 인터페이스라서
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());

        System.out.println(q);// 남아 있는게 없을듯

    }
}
