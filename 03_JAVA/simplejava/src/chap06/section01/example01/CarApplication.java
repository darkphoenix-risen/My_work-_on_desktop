package chap06.section01.example01;

public class CarApplication {
    public static void main(String[] args) {
//클래스(객체)사용
        Car car = new Car();
        //객체 변수
        System.out.println(car.company);
        System.out.println(car.maxSpeed);

        // to do: 값 수정: 30-60
        car.maxSpeed=60;
        System.out.println(car.maxSpeed);
    }
}
