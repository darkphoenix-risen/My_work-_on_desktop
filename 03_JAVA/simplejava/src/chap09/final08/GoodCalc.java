package chap09.final08;

public class GoodCalc extends Calculator{

    // GookCalc 작성
    // add, subtract 작성 매개변수 2개까지
    //추상은 구현에서


    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }
}
