# Write your MySQL query statement below

Select name as Customers 
from Customers C
Left join Orders O
on C.id = O.CustomerId
where O.CustomerId Is Null;
