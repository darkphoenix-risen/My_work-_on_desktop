package chap14.section02.example04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApplication {
    public static void main(String[] args) {
        Queue<Coin> q = new LinkedList<>();


           q.offer(new Coin(100));
           q.offer(new Coin(50));
        System.out.println(q.poll());

        //stack과 다른점 = FIFO(stack) vs FILO(Queue)
    }

}
