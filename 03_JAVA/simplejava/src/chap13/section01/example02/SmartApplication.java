package chap13.section01.example02;

public class SmartApplication {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone
                ("apple", "ios");

        System.out.println(phone.toString());//해쉬코드나옴
        //필드값 송출= 재정의 (재코딩 = overriding)

    }

    //override toString()

}
