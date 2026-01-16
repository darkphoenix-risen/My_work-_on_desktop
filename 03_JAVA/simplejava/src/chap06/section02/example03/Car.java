package chap06.section02.example03;

public class Car {
    String company;
    int speed;

    public Car() {
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public Car(String company) {
        this.company = company;
    }

    public Car(String company, int speed) {
        this.company = company;
        this.speed = speed;
    }
}
