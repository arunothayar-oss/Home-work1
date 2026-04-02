CREATE TABLE Departments1
(
	dept_id int primary key,
	dept_name varchar(50) not null

);
CREATE TABLE Employees1
(
	emp_id int primary key,
	emp_name varchar(50) not null,
	dept_id int,
	salary decimal(10,2),
	foreign key(dept_id)References Departments1(dept_id)
);
insert into Departments1 values(1,'HR'),(2,'IT'),(3,'Finance');
insert into Employees1 values(101,'Arun',1,40000),(102,'Priya',2,35000),
(103,'Rahul',1,25000),(104,'Sneha',1,50000);
SELECT e.emp_name, d.dept_name, e.salary From Employees1 e, Departments1 d 
where e.dept_id=d.dept_id and e.salary>30000 and d.dept_name='HR'


/*Question 2: Join with Conditions (WHERE)
Tables:

employees (emp_id, emp_name, dept_id, salary)departments (dept_id, dept_name)
Task:
Write a query to display:

Employee NameDepartment NameSalary
Conditions:

Use WHERE clause to join the tablesShow only employees with salary greater than 30000Department name should be 'HR'*/