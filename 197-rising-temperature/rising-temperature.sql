# Write your MySQL query statement below
SELECT 
    t1.id AS id
FROM 
    Weather t1
JOIN 
    Weather t2 ON t1.recordDate = DATE_ADD(t2.recordDate, INTERVAL 1 DAY)
WHERE 
    t1.temperature > t2.temperature

