package chap14.section02.example04;

// 객체: 동전(Coin) -> 값(value) 필드
// 3요소: 1)필드 2)생성자함수 3)메소드
public class Coin {
    int value;

    //    생성자(Constructor): 모든 필드 선택
    public Coin(int value) {
        this.value = value;
    }
    //    setter/getter 함수 만들기: 인텔리제이가 함
//    setter : 필드에 값을 저장하는 함수
//    getter : 필드에 값을 가져오는 함수
//    오른쪽 클릭 - 생성(generate) - setter,getter 선택 - 확인 클릭
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    //    toString 재정의
//    오른쪽 클릭 - 생성(generate) - toString 선택 - 다음 연타 - 끝
    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                '}';
    }
}

