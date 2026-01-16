package chap15.section01.example01;
//테스트용으로 만들때, 
public class Noname {
    // 주제: 익명 클래스: 이름없는 클래스,
//      1회성 클래스(클래스를 1번만 사용하겠다는 의미)
    Person p = new Person() {
        @Override
        void wake() {
            super.wake();
            System.out.println("5시에 일어납니다. ");
        }
    };
    //no name에서 person을 상속받아서 쓸 수있다.
    // 바로 아래 위치에서만 wake 함수를 재코딩 해서 사용할시
//상속아니고
    //생성자 뒤에 중괄호 나오면 익명 클래스

    //void method1() 기능) Person 변수 작성
    void method1() {
        Person p2 = new Person() {
            @Override
            void wake() {
                System.out.println("12시에 일어납니다");
            }

        };
        p2.wake();
        //Person p2 = new Person()이까지가 객체만들기
        }
    void method2(Person p){
        p.wake();
    }
}
