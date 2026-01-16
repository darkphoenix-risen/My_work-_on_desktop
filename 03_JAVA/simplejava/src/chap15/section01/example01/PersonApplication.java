package chap15.section01.example01;

public class PersonApplication {

    public static void main(String[] args) {
        //noname객체 만들기 : 객체안에 필드, 함수를 사용하려고 만든다
        Noname n = new Noname();
        n.p.wake();
        n.method1();

        //3 참고 익명클래스를 매개변수 위치에 사용할 수 있다.
        n.method2(new Person(){
            @Override
            void wake() {
                System.out.println("17시에 일어납니다");
            }
        });
    }
}
