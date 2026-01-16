package chap06.section02.example03;

// 일반 클래스명: Taxi
//◼ 필드:
//◆ String  model
//◆ int maxSpeed - 생성자: 4개 만들기
//◼ 매개변수 없음
//◼ model 매개변수
//◼ maxSpeed 매개변수
//◼ model, maxSpeed 매개변수
public class Taxi {
    //    객체의 3요소: 1) 필드 2) 생성자함수 3) 메소드
//    필드
    String model;
    int maxSpeed;

    //    생성자함수: 메뉴 클릭
    //◼ 매개변수 없음
    public Taxi() {
    }
    //    model 매개변수
    public Taxi(String model) {
        this.model = model;
    }
    //◼ maxSpeed 매개변수
    public Taxi(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    //◼ model, maxSpeed 매개변수
    public Taxi(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
