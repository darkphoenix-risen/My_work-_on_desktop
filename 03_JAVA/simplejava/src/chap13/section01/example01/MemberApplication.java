package chap13.section01.example01;

// 주제: 2개의 객체를 만들고 비교했을때 같은지 여부 알아보기
public class MemberApplication {
    public static void main(String[] args) {
        Member m = new Member("blue");
        Member m2 = new Member(" blue");

        //equals() 글자비교,  객체비교 - 재정의 할것
//재정의전 false 나옴 맴버에서 재정의
        System.out.println(m.equals(m2));
    }
}
