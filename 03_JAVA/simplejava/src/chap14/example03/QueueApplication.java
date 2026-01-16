package chap14.example03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApplication {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        // 변수 offer(값 추가)
        q.offer(1);
        q.offer(2);
        System.out.println(q);
        //꺼내기
        System.out.println(q.poll());
        //delete 스택은 처음값을 꺼낸다=1를 꺼낸다 꺼낸값을 표시한것
        System.out.println(q);
    }
}
