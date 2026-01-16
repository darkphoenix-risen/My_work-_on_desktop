package chap10.section01.example01;

// 실행클래스: main
public class SmartApplication {
    public static void main(String[] args) {
//        인터페이스는 객체 만들기를 할 수 없습니다.
//        자식클래스를 이용합니다.
//        쳇gpt 물어보기 : Person 객체 만들기
//        사용법: 인터페이스(부모) 변수=new 자식생성자(); // 다형성
        Remote remote=new SmartTv();
//        객체 안에 함수 사용법: 변수.함수()
        remote.turnOn();
        Searchable searchable=new SmartTv();
        searchable.search();
    }
}
