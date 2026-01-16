package chap08.section01.example01;

public class CellApplication {
    public static void main(String[] args) {
DmbCellPhone dmbCellPhone = new DmbCellPhone(10, "자바");
        System.out.println(dmbCellPhone.channel);
        System.out.println(dmbCellPhone.model);

        dmbCellPhone.powerOn();
        dmbCellPhone.turnOn();
    }
}
