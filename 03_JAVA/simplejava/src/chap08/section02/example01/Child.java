package chap08.section02.example01;

public class Child extends Parent {
// 매소트 기능 : 자식-method 화면에 표시, method이름
    //매개변수 없음.  void
    //method 재코딩 (재정의 : override


    @Override
    void method() {
//super = 부모함수를 실행한다. 바꾸지 못하니 super를 지운다
        System.out.println("자식-method");
    }
}
