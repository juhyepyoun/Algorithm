-- 코드를 입력하세요
# 자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하고 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차에 대해서 자동차 ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력하는 SQL문을 작성해주세요
SELECT C.CAR_ID, C.CAR_TYPE, ROUND(C.DAILY_FEE*30*((100-D.DISCOUNT_RATE)/100)) AS FEE
FROM CAR_RENTAL_COMPANY_CAR C
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY R ON C.CAR_ID = R.CAR_ID
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN D ON D.CAR_TYPE = C.CAR_TYPE
WHERE C.CAR_ID NOT IN (SELECT CAR_ID
                       FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                       WHERE END_DATE > '2022-11-01' AND START_DATE < '2022-12-01'
                      ) 
                      AND D.DURATION_TYPE = '30일 이상'
GROUP BY CAR_ID
HAVING CAR_TYPE IN ('세단', 'SUV') AND FEE >= 500000 AND FEE < 2000000
ORDER BY FEE DESC, CAR_TYPE ASC, CAR_ID DESC;