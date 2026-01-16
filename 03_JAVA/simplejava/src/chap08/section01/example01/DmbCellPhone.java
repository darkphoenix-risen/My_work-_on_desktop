package chap08.section01.example01;

public class DmbCellPhone extends CellPhone {

    int channel;

    public DmbCellPhone(int channel, String model) {
        this.model = model; //부모클래스 필드
        this.channel = channel; //자식클래스 필드
    }

    // 매소드 만들기 = 함수
void turnOn () {
    System.out.println("tv를 수신합니다.");
}

}
