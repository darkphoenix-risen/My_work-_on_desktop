 -- 글자에 공백 없애기  함수
-- 예제) 글자 양옆에 공백을 없애 보세요
-- 테이블명 DUAL
-- 사용법: SELECT TRIM(컬럼) FROM 테이블;
SELECT TRIM('  Oracle Db   ') FROM DUAL;
-- (참고) LTRIM() : LEFT TRIM(), 왼쪽 공백만 제거
-- (참고) RTRIM() : RIGHT TRIM(), 오른쪽 공백만 제거