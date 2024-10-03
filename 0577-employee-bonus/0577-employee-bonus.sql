# Write your MySQL query statement below
select e.name , b.bonus from Employee e left join Bonus b on e.Employee = b.Bonus where bonus>100