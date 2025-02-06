# Write your MySQL query statement below
SELECT Distinct l1.num as ConsecutiveNums 
from Logs l1
Join Logs l2 on l1.id=l2.id-1
Join Logs l3 on l2.id=l3.id-1
Where l1.num=l2.num and l1.num=l3.num;