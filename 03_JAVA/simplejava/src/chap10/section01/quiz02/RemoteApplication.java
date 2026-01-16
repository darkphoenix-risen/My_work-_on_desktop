package chap10.section01.quiz02;

public class RemoteApplication {
    public static void main(String[] args) {
        //tv를 끕니다
        Remote rc = new Tv();
        rc.turnOff();

        //오디오를 끕니다.
        rc = new Audio();
        rc.turnOff();

    }
}
