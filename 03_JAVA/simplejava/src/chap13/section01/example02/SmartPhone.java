package chap13.section01.example02;

public class SmartPhone {
    private String company;
    public  String os;

    //생정자


    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
