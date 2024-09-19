
with temp as( 
select a.name as fir,a.salary as s1,b.name as sec,b.salary as s2 from Employee a Left join Employee b on a.id=b.managerId)
select sec as Employee from temp where s2 is not null and s1<s2;