# Write your MySQL query statement below
with table1 as
(select employee.*, department.name as Department from employee inner join department 
on employee.departmentId=department.id)

select Department, name as Employee, salary as Salary from 
(select *,dense_rank() over(partition by departmentId order by salary desc) as rank1 from table1)t
where rank1<=3