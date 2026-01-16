package chap01.section03;

public class S6_Printf {
    public static void main(String[] args) {
        System.out.println("홍길돌");
        //화면 표시함수 2
        System.out.print("장길산");

        //화면 표시함수 3
        System.out.printf("%d", 10);
        System.out.printf("%s", "hi");
        //글자를 화면에 표시
        System.out.printf("%.3f", 3.14127);
        //실수(소수점)를 화면에 표시
        //?f =  소수점의 개수를 표시
        // "\n" = 자동 줄바꿈
    }
}
