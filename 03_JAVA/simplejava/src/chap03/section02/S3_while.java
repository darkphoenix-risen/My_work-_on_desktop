package chap03.section02;

public class S3_while {
    public static void main(String[] args) {
        int i = 1; //처음값 밖으로 나옴
        while ( i < 20 ) { //조건은 그대로
            System.out.println("안녕");
            i++; //증가 연산자 {안으로 들어옴}
        }
    }
}
