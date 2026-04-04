CREATE TABLE Department
(
	dept_id int primary key,
	dept_name varchar(50) not null,
	location varchar(20)
);
CREATE TABLE Employee
(
	emp_id int primary key,
	emp_name varchar(50),
	age int,
	salary int,
	dept_id int,
	job_role varchar(50),
	Foreign key(dept_id) References department(dept_id)
);
INSERT INTO Department VALUES
(10, 'HR', 'Chennai'),
(20, 'IT', 'Madurai'),
(30, 'Finance', 'Trichy'),
(40, 'Sales', 'Coimbatore');
INSERT INTO employee VALUES
(101, 'Arun', 23, 25000, 20, 'Developer'),
(102, 'Bala', 30, 40000, 10, 'Recruiter'),
(103, 'Charan', 27, 35000, 20, 'Tester'),
(104, 'Divya', 35, 50000, 30, 'Accountant'),
(105, 'Eswar', 29, 28000, 40, 'Sales Executive'),
(106, 'Farhana', 26, 32000, 20, 'Developer'),
(107, 'Gokul', 31, 45000, 30, 'Analyst'),
(108, 'Hari', 24, 22000, 10, 'Assistant');
SELECT e.emp_name,d.dept_name FROM Employee e join 
Department d ON e.dept_id=d.dept_id;
SELECT e.emp_name, e.salary,d.location From Employee e join
Department d on e.dept_id=d.dept_id;
Select e.emp_name From Employee e join Department d On
e.dept_id=d.dept_id Where d.dept_name='IT';
Select e.emp_name From Employee e join Department d On
e.dept_id=d.dept_id Where d.location='Chennai';
Select e.emp_name From Employee e join Department d On
e.dept_id=d.dept_id Where e.salary>30000;
Select d.dept_name ,count(*)From Department d 
Join Employee e on d.dept_id= e.dept_id Group By d.dept_name;
Select d.dept_name ,count(*)From Department d 
Join Employee e on d.dept_id= e.dept_id Group By d.dept_name
Having count(*)>1;
