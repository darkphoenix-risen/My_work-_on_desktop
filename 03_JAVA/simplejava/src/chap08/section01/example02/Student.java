package chap08.section01.example02;

public class Student extends People {
    public int no;

    public Student(String name, int no) {
        super(name);  //슈퍼는 부모 생성자를 의미. 상속시
        this.no = no;
    }
}
