package chap03.section02;

public class S6_InfiniteLoop {
    public static void main(String[] args) {
        int i = 1; //처음 값
        while (true) {
            System.out.println(i);
            i++; //1증가
            if (i == 6) {
                break;
            }
        }
    }
}
