package chap08.section01.example01;

public class IPad extends Tablet{
    String Ipad; //회색은 별로 필요 없다는 말이다

    //변수를 만들고 생성자 오른클릭 하면

//    public IPad(String ipad) {
//        Ipad = ipad;
//    } 이렇게 만들어 진다. 여기에서 브랜드에 애플이 들어가게 하려면
    //Ipad가  brand에 저장되게 하려면 괄호 이하 전부 브랜드로 바꾸고
    //this.brand = brand;

    public IPad(String brand) {
        this.brand = brand;
    }

    void click () {
    System.out.println("웹브라우저를 엽니다");

}


}

