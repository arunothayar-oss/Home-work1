CREATE TABLE Orders1
(
	order_id int primary key,
	customer_id int,
	amount decimal(10,2)
);
insert into Orders1 values(101,1,6000),(102,2,3000),(103,3,8000),(104,1,2000);
select order_id,customer_id, amount from Orders1 
where amount>(select(Avg(amount)) from Orders1);
CREATE TABLE HIGHVALUE
(
	order_id int primary key,
	customer_id int,
	amount decimal(10,2)

);
insert into HIGHVALUE select order_id,customer_id, amount from Orders1 
where amount>(select(Avg(amount)) from Orders1);
update orders1 set amount=amount*1.10  
where amount>(select(Avg(amount)) from Orders1);
select*from orders1;
delete from orders1 where amount<(select(Avg(amount)) from Orders1);
delete from orders1;
insert into Orders1 values(101,1,6000),(102,2,3000),(103,3,8000),(104,1,2000);
/*Question 3: Subquery using WHERE
Table:

orders (order_id, customer_id, amount)
Task:
Write a query to display:

Order IDCustomer IDAmount
Conditions:

Use a subquery inside the WHERE clauseShow only orders where amount is greater than the average amount*/