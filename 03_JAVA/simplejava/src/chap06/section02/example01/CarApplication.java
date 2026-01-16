package chap06.section02.example01;

public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car("검정");
        //줄복사 ctrl + d
        Car car2 = new Car("흰색");

        System.out.println(car.colour);
        System.out.println(car2.colour);
    }
}
