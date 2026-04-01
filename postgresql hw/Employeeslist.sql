CREATE TABLE Employees
(
	Emp_id int Primary key,
	Emp_name VARCHAR(50) not null,
	age int check(age>18),
	salary numeric(10,2) check (salary>0),
	department_id int,
	manager_id int,
	Foreign key (department_id) REFERENCES Departments(department_id),
	Foreign key(manager_id)REFERENCES Employees(Emp_id)

);
Insert into Employees values(101,'Arun',30,40000,2,Null),
(102,'Bala',28,30000,2,101),(103,'Charan',35,50000,1,Null),
(104,'Dinesh',25,25000,3,103),(105,'Ezhil',27,28000,4,101);
Drop Table Employees;
SELECT *FROM Employees where salary>=30000;
UPDATE Employees Set salary=35000 where Emp_name='Bala';
Delete from Employees where Emp_name='Dinesh';
Select *From Employees;
