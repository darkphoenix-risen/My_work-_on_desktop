package chap14.section01.example03;

import java.util.ArrayList;
import java.util.List;
//자식 클래스 : arraylist, Vector, LinkedList
//vector : 멀티 스레드 환경에서 사용 -실무에서 잘 안씀
public class BoardApplication {
    public static void main(String[] args) {
        Board board = new Board("제목", "내용");

        //배역에 위의 board객체 저장

        List<Board> list= new ArrayList<>();
        //생성자를 ArrayList에서 vector로 바꾸기만 하면 되다
        list.add(board);
        //list.add(new Board("제목", "내용"));로 짧게 가능
        list.add(
                new Board("제목2", "내용2"));
//toString  재정의 필요(board)
        System.out.println(list);

//list = 부모
    }
    }
