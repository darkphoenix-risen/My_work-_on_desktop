package chap08.section02.example02;

public class DriverApplication {
    // 매개변수 Vehicle vehicle, 공유함수 (Static)
    //매소드 함수를 여기에 작성. vehicle.run() 실행
    public static void drive(Vehicle vehicle) {
        vehicle.run();
    }
    //drive main에 사용하기
    public static void main(String[] args) {
        //다형성: 자식 1(버스), 자식2(택시) 객체 만들기
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //다형성은 부모안에 자식넣기
        drive(bus);
    }
}
