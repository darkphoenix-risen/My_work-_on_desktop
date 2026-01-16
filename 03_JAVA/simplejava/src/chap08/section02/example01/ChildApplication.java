package chap08.section02.example01;

public class ChildApplication {
    public static void main(String[] args) {
        // 자식1 객체 만들기: 클래스 변수 =new 생성자 함수();
        Child child  = new Child();
        Child2 child2 = new Child2();
        //다형성 : 함수 이름 같은데 다양한 기능

        Parent parent = child2;
        //부모는 자식이다
         parent.method();

     }
}
