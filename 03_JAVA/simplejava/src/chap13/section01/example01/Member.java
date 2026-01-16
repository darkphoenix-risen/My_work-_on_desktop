package chap13.section01.example01;

import java.util.Objects;

//객체: 필드, 메소드를 목적에 따라 묶은것
//객체 3요소 : 1) 필드(정보저장) 2) 생성자 함수 3)메소드
//생성자 함수  : 객체 만드는 함수
//1)공간부여 2)저장 3)실행
public class Member {
    public String id;
    //생성자 매게변수

    public Member(String id) {
        this.id = id;
    }

    //equals 와 hashCode(객채의 고유숫지 부여) 같이 재정의

    @Override //필드값비교
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override //필드 고유보너호 내보내기
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
