package chap01.section03;

public class S4_conversion {
    public static void main(String[] args) {
        String a="10";
        int b=Integer.parseInt(a);
        //parseInt = 글자를 숫자로 바꾸어 준다
        System.out.println(b);


//2진수 변경가능

        int c=Integer.parseInt(a,2);
        System.out.println(c);
    }
}
