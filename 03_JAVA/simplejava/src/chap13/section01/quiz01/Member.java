package chap13.section01.quiz01;

import java.util.Objects;

//1)객체 2)생성자 함수 3) 변수
public class Member {
    String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
