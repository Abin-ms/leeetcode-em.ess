# Write your MySQL query statement below
select Class
from Courses
group by class
having count(student)>=5;