package chap10.section01.example02;

public class Audio implements Remote{
    //Remote를 상속, turnOn을 재코딩


    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }


}
