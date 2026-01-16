package chap03;

public class S5_Switch {
    public static void main(String[] args) {
        int a= 9;

        switch (a){
            case  9:
                System.out.println("출발");
                break;
                // 한번실행하면 밑에를 실행할 필요가 없다.

            case 8:
                System.out.println("준비");
                break;

            default:
                System.out.println("대기");
                break;
        }
    }
}
