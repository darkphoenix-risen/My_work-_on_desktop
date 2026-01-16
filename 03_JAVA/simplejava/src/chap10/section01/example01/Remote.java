package chap10.section01.example01;
// 인터페이스: 1) 필드 2) 추상메소드(abstract 생략) (생성자가 없습니다.)
public interface Remote {
    int MAX_VOLUMN = 10;
    //    추상메소드: void, 매개변수 x, turnOn(이름), {} 사용하지 않습니다.
    void turnOn();
}
