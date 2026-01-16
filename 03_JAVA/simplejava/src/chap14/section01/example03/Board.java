package chap14.section01.example03;

public class Board {
    String subject;
    String content;


    public Board(String subject, String content) {
        this.subject = subject;
        this.content = content;

    }
    @Override
    public String toString() {
        return "Board{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}
