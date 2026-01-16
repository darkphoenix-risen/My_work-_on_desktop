package chap10.section01.example02;

public class RemoteApplication {
    public static void main(String[] args) {
        Remote remote = new Tv();
        //인터페이스는 객체를 만들수 없고 자식 클래스로만 만듬
        remote.turnOn();


        //한번 객체를 만들었기때문에 반복x
        //remore안에 turnon이 있어야 작동가능
        remote=new Audio();
        remote.turnOn();
    }

}
