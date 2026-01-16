package chap14.section02.example02;

import java.util.Stack;

public class StackApplication {
    public static void main(String[] args) {
        //stack 객체 만들기

        Stack<Coin> s = new Stack<>();

        //coin 객체 만들기
        s.push(new Coin(100));
        s.push(new Coin(50));

        //stack에는 객체를 넣을수 있다.
        System.out.println(s);

//꺼내기 =  delete : s.pop()
        System.out.println(s.pop());//꺼낸값 = 삭제
//끝값 가져오기 : s.peek()
        System.out.println(s.peek());//
    }
}
