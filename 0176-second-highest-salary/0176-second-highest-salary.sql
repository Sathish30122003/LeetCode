with temp as(
    select *,Dense_rank() over(order by salary desc) as r from employee
)
select ifnull((Select salary from temp where r=2 limit 1),null) as SecondHighestSalary;