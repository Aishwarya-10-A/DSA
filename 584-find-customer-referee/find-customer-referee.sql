# Write your MySQL query statement below
Select c.name from Customer c LEFT JOIN Customer r on c.referee_id = r.id
Where r.id IS NULL OR r.id != 2;
