package chap10.section01.example01;

// 자식클래스
// 예제) Remote, Searchable 인터페이스를 상속하고, turnOn(), search() 재코딩하세요
// TODO: 인터페이스 상속하면 추상메소드를 반드시 재코딩(재정의) 해야합니다.
public class SmartTv implements Remote, Searchable {
    //    메소드 재코딩(재정의, overriding)
//  의미? turnOn 메소드 재정의된 함수이고, "TV 켜기" 화면 표시하고 있습니다.
    @Override
    public void turnOn() {
        // 기능) "TV 켜기" 화면 표시
        System.out.println("TV 켜기");
    }

    @Override
    public void search() {
        System.out.println("검색");
    }
}
