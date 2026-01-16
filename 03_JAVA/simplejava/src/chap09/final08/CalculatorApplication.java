package chap09.final08;

// 실행 클래스
public class CalculatorApplication {
    public static void main(String[] args) {
        // GookCalc 작성
        // add, subtract 작성 매개변수 2개까지



        GoodCalc goodCalc = new GoodCalc();
        System.out.println(goodCalc.add(2,3));
        System.out.println(goodCalc.subtract(2,3));
    }
}