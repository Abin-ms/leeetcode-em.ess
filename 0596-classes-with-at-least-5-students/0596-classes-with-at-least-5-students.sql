# Write your MySQL query statement below
SELECT Class
FROM Courses
GROUP BY class
HAVING count(student)>=5;