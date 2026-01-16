package chap06.section02.example02;

public class AmericanApplication {
    public static void main(String[] args) {
        American american=new American("James",123456);
        American american2=new American("Bones",234567);

        System.out.println(american.name);
        System.out.println(american.ssn);
        System.out.println(american2.name);
        System.out.println(american2.ssn);


    }
}
