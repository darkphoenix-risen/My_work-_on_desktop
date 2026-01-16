package chap10.section01.example02;

public class Tv implements Remote{
    //인터패이스  remote상속, turn on 재코딩

    //매소드 구현으로 생성.

    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }
}
