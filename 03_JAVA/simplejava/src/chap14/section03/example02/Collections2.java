package chap14.section03.example02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Collections2 {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();



        //       1) ArrayList 에 값을 한번에 넣기: Collections.addAll(변수,값,값2,...)
        Collections.addAll(l,1,2,3);
        System.out.println(l); // [1, 2, 3] ->

//       2) 배열 값 회전시키기: Collections.rotate(변수,오른쪽으로 칸이동)
//         3칸이동 -> [1, 2, 3] -> 1칸: [3, 1, 2] -> 2칸: [2, 3, 1]->3칸: [1,2,3]
        Collections.rotate(l,1);
        System.out.println(l); // [3, 1, 2]

        //       3) 배열 값 바꾸기: Collections.swap(변수,순번,바꿀순번)
        Collections.swap(l,0,1); // 순번: 0 <-> 1 값 바꾸기
        System.out.println(l);      // [3, 1, 2] -> [1, 3, 2]

//      4) 내림차순 정렬: Collections.sort(변수,Collections.reverseOrder())
//        내림차순(큰수부터 ~ 작은수 차례로 표시)
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);      // [3, 2, 1]
//      5) 오름차순 정렬: Collections.sort(변수)
//        오름차순(작은수부터 ~ 큰수 차례로 표시)
        Collections.sort(l);
        System.out.println(l);      // [1, 2, 3]

//      6) 배열 값중에서 최대값 구하기:
        System.out.println(Collections.max(l)); // ?

//      7) 배열 값중에서 최소값 구하기: Collections.min(변수)
        System.out.println(Collections.min(l)); // 1
    }
}

