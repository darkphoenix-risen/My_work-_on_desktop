package chap05;

public class S3_Deepcopy {
    public static void main(String[] args) {
        //배열복사
// "="단점 : 복사본 수정하면 원본 값도 같이 수정된
      //개선 반복문을 이용한 깊은 복사

        int[] a={1,2}; //원본 {} = 값이 있음
        int[] b = new int[2]; //빈방예약 [] = 값이 없음

        //
//
//        b[0]=a[0];
//        b[1]= a[1];

        for (int i = 0; i < 2; i++) {
            b[i]=a[i];
        }
        b[0]=10;
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}
