package chap08.section01.example01;

public class TabletApplication {
    public static void main(String[] args) {
        IPad iPad = new IPad("애플");
        System.out.println(iPad.brand);

        iPad.click();
        iPad.powerOff();

    }
}
