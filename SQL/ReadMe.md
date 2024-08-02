### 2024-08-02/LV4/[5월 식품들의 총매출 조회하기](https://school.programmers.co.kr/learn/courses/30/lessons/131117)
```sql
SELECT 
    fp.PRODUCT_ID,
    fp.PRODUCT_NAME,
    SUM(fp.PRICE * fo.AMOUNT) AS TOTAL_SALES
FROM 
    FOOD_PRODUCT fp
JOIN 
    FOOD_ORDER fo ON fp.PRODUCT_ID = fo.PRODUCT_ID
WHERE 
    EXTRACT(YEAR FROM fo.PRODUCE_DATE) = 2022
    AND EXTRACT(MONTH FROM fo.PRODUCE_DATE) = 5
GROUP BY 
    fp.PRODUCT_ID, 
    fp.PRODUCT_NAME
ORDER BY 
    TOTAL_SALES DESC, 
    fp.PRODUCT_ID ASC;

```

### 2024-03-09/LV2/[노선별 평균 역 사이 거리 조회하기](https://school.programmers.co.kr/learn/courses/30/lessons/284531)
```sql
SELECT ROUTE, 
CONCAT(ROUND(SUM(D_BETWEEN_DIST), 1),'km') AS TOTAL_DISTANCE, 
CONCAT(ROUND(AVG(D_BETWEEN_DIST), 2), 'km') AS AVERAGE_DISTANCE
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
ORDER BY ROUND(SUM(D_BETWEEN_DIST), 1) DESC;
```

### 2024-01-05/LV2/[조건에 맞는 도서와 저자 리스트 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/144854)
```sql
SELECT  -- 기본적인 JOIN을 사용한 문제
B.BOOK_ID , 
A.AUTHOR_NAME, 
DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK B JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE CATEGORY = '경제'
ORDER BY PUBLISHED_DATE
```

### 2024-01-05/LV2/[중성화 여부 파악하기](https://school.programmers.co.kr/learn/courses/30/lessons/59409)
```sql
SELECT ANIMAL_ID, NAME, 
CASE
 WHEN SEX_UPON_INTAKE LIKE 'Neutered%' OR SEX_UPON_INTAKE LIKE 'Spayed%'
 THEN 'O' 
 ELSE 'X' END AS '중성화' 
FROM ANIMAL_INS ORDER BY ANIMAL_ID; -- 아이디 순으로 조회
```

### 2024-01-04/LV2/[자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/151137)
```sql
SELECT CAR_TYPE , COUNT(OPTIONS) AS CARS
FROM CAR_RENTAL_COMPANY_CAR 
WHERE OPTIONS LIKE '%시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE
```

### 2024-01-04/LV2/[가격대 별 상품 개수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/131530)
```sql
SELECT (CASE -- 조건식으로 CASE ~ WHEN 사용
            WHEN PRICE < 10000 THEN 0 -- 10000원 이하는 0 , 최소 금액 10000원 이상이기 때문
            ELSE TRUNCATE(PRICE,-4) -- 4자리 버리기
        END) AS PRICE_GROUP, COUNT(PRODUCT_ID) AS PRODUCT -- 카운팅 하여 PRODUCT로 나타냄
FROM PRODUCT
GROUP BY PRICE_GROUP -- 가격대 별로 그룹화
ORDER BY PRICE_GROUP -- 오름차순
```

### 2024-01-03/LV2/[동물 수 구하기](https://school.programmers.co.kr/learn/courses/30/lessons/59406)
```sql
SELECT COUNT(*) FROM ANIMAL_INS;
```
### 2024-01-03/LV2/[중복 제거하기](https://school.programmers.co.kr/learn/courses/30/lessons/59408)
```sql
select count(DISTINCT NAME) as animal_type from animal_ins;
```

### 2024-01-03/LV2/[즐겨찾기가 가장 많은 식당 정보 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/131123)

```sql
-- 쿼리 실행 순서 : from -> where -> group by -> having -> select -> order_by
select FOOD_TYPE, REST_ID, REST_NAME, FAVORITES 
from REST_INFO 
where (FOOD_TYPE , FAVORITES)
in (select FOOD_TYPE , MAX(FAVORITES) -- 서브 쿼리 사용 , MAX를 사용하여 조건 충족
    from REST_INFO 
    group by FOOD_TYPE ) -- food_type 으로 그룹화
order by FOOD_TYPE DESC ;
```

