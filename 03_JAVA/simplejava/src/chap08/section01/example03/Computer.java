package chap08.section01.example03;

public class Computer extends Calculator {
//메소드 오버라이딩 :


    @Override
        //@ = 어노테이션 : 부모의 함수명과 자식의 함수명 같음검사
    // 이름이 다르면 에러를 발생시킨다.  검사만 해준다.
    double circle(double r) {
        return r*r* Math.PI;
    }
}


