CREATE TABLE Projects
(
	project_id serial primary key,
	project_name VARCHAR(50) not null,
	budget decimal(10,2) check(budget>0),
	status VARCHAR(20) check(status IN ('pending','started','completed')),
	Emp_id int,
	Foreign key(Emp_id)References Employees(Emp_id)

);
Insert into Projects (project_id,project_name,budget,status,Emp_id)
values(201,'ProjectA',100000,'pending',101),(202,'ProjectB',150000,'started',102),
(203,'ProjectC',200000,'pending',103),(204,'ProjectD',120000,'completed',104);
SELECT *FROM Projects where status='pending';
Update Projects set status='completed' where project_name='ProjectB';
Delete From Projects where project_name='ProjectD';
Select*From projects;
Insert into Projects values(204,'ProjectD',120000,'completed',104);
