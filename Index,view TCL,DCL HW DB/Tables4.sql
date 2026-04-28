Create Table Bank_Account 
(
	acc_no int primary key,
	acc_name varchar(50) not null,
	balance Numeric(10,2)
);
insert into Bank_Account values(101,'Arun',5000),(102,'Bala',1000);
Select * from Bank_Account;
update Bank_Account set balance =balance-500 where acc_no=101;
Begin;
update Bank_Account set balance =balance+500 where acc_no=101;
rollback;
create Table Employees(emp_id int primary key,emp_name varchar(50),salary numeric(10,2),department varchar(50) );
insert into Employees values(1, 'Arun', 25000, 'HR'),(2, 'Kumar', 30000, 'IT'),
(3, 'Ravi', 28000, 'Sales');
create view employee_names As select emp_name from  Employees;
CREATE USER guest WITH PASSWORD 'guest123';
GRANT SELECT ON employee_names TO guest;
REVOKE SELECT ON employee_names FROM guest;
select *from employee_names;

CREATE TABLE employee1
(
   emp_id INT PRIMARY KEY,
   emp_name VARCHAR(50),
   salary NUMERIC(10,2)
);
INSERT INTO employee1 VALUES
(1,'Arun',25000),
(2,'Kumar',30000),
(3,'Ravi',28000);
create or replace procedure View_menu(choice int)
language plpgsql As $$
Begin
If choice=1 then
create or replace view employee_view As select emp_id, emp_name,salary from employee1;
RAISE NOTICE 'View Created';
Elsif choice=2 then 
RAISE NOTICE 'Run this query: select *from employee_view;';
Elsif choice=3 then 
update employee_view set salary=salary+5000 where emp_id=1;
RAISE NOTICE 'Data Updated Through View';
Elseif choice=4 then
Drop view if exists employee_view;
RAISE NOTICE 'View Dropped';
Elseif choice=5 then
RAISE NOTICE 'Exit';
 ELSE
        RAISE NOTICE 'Invalid Choice';
    END IF;
END;
$$;



CALL view_menu(1);  
CALL view_menu(2);   
SELECT * FROM employee_view;

CALL view_menu(3);   
SELECT * FROM employee_view;

CALL view_menu(4);   
CALL view_menu(5); 
CREATE DATABASE transport_company;

 CREATE TABLE vehicle_details
(
    vehicle_id SERIAL PRIMARY KEY,
    vehicle_name VARCHAR(50),
    vehicle_number VARCHAR(20),
    capacity INT
);

CREATE TABLE delivery_details
(
    delivery_id SERIAL PRIMARY KEY,
    product_name VARCHAR(50),
    shop_name VARCHAR(50),
    delivery_area VARCHAR(50),
    status VARCHAR(20)
);
CREATE VIEW completed_deliveries AS
SELECT *
FROM delivery_details
WHERE status = 'Completed';
SELECT * FROM completed_deliveries;
CREATE INDEX idx_delivery_area
ON delivery_details(delivery_area);
BEGIN;

INSERT INTO delivery_details(product_name, shop_name, delivery_area, status)
VALUES
('Rice Bag', 'ABC Store', 'North Zone', 'Completed'),
('Oil Tin', 'XYZ Mart', 'South Zone', 'Pending'),
('Sugar Pack', 'Fresh Shop', 'East Zone', 'Completed');
COMMIT;
SELECT * FROM delivery_details;
BEGIN;

DELETE FROM delivery_details
WHERE delivery_id = 2;
SELECT * FROM delivery_details;
ROLLBACK;
SELECT * FROM delivery_details;
CREATE USER delivery_user
WITH PASSWORD '12345';

GRANT SELECT
ON delivery_details
TO delivery_user;

