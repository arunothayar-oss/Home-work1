CREATE TABLE CUSTOMERS
(
	customer_id int primary key,
	customer_name varchar(50) not null,
	city varchar(20) not null

);
CREATE TABLE Orders
(
	order_id int primary key,
	customer_id int,
	amount decimal(10,2),
	Foreign key(customer_id)References CUSTOMERS (customer_id)

);
insert into CUSTOMERS values(1,'Arun','chennai'),(2,'Priya','coimbatore'),
(3,'Rahul','madurai');
insert into Orders values(101,1,6000),(102,2,3000),
(103,3,8000),(104,1,2000);
SELECT o.order_id,c.customer_name,c.city,o.amount FROM Orders o,CUSTOMERS c 
where o.customer_id=c.customer_id and o.amount>5000;


/*Inner Join using WHERE
Tables:

orders (order_id, customer_id, amount)customers (customer_id, customer_name, city)
Task:
Write a query to display:

Order IDCustomer NameCityAmount
Conditions:

Use WHERE clause to join the tablesShow only orders where amount is greater than 5000*/