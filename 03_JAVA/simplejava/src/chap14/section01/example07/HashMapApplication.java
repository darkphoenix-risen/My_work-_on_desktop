package chap14.section01.example07;

import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {

    public static void main(String[] args) {

        //여러가지 값 저장
        //꺽쇠 이꼬르 제네릭
        Map<String, Object> map = new HashMap<>();

        map.put("no", 1);
        map.put("name", "홍길동");
        System.out.println(map);

        map.remove("no");

        System.out.println(map.size());

        //조회 = 값가져오기
        System.out.println(map.get("name"));
    }
}
