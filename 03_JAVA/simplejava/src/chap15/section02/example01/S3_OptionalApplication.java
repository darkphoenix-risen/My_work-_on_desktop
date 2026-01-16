package chap15.section02.example01;

import java.util.Optional;

public class S3_OptionalApplication {
    public static void main(String[] args) {
        Optional<String> a = Optional.ofNullable(null );
    a.orElseThrow(()->new NullPointerException("null 에러 발생"));
    }
}
