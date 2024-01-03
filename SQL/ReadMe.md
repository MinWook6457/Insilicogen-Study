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