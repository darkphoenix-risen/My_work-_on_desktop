package chap10.section01.example03;

public class SoundApplication {


    static void print(Soundable soundable){

        System.out.println(soundable.sound());
        //매개변수에서 변수를 받아 실행하겠다.

    }
    public static void main(String[] args) {
        print(new Cat());//자식넣기
        print(new Dog());

    }

}
