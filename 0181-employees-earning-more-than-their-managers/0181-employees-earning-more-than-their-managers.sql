/* Write your PL/SQL query statement below */
SELECT e.name AS "Employee"
FROM Employee e
where e.salary > (
    SELECT m.salary
    FROM Employee m
    WHERE m.id = e.managerId
);