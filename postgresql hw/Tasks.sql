CREATE TABLE TASKS
(
	task_id serial primary key,
	task_name varchar(50) not null,
	priority varchar(20) check(priority in('low','medium','high')),
	due_days int,
	project_id int,
	Emp_id int,
	Foreign key (project_id) References Projects(project_id),
	Foreign key (Emp_id) References Employees(Emp_id)

);
Insert into TASKS(task_id,task_name,priority,due_days,project_id,Emp_id)
values(301, 'Design', 'high', 5, 201, 101),(302, 'Coding', 'medium', 10, 202, 102),
(303, 'Testing', 'low', 7, 203, 104),(304, 'Deployment', 'high', 3, 204, 103);
Select*from Tasks where due_days>=5;
Update Tasks set priority='high' where task_name='Coding';
Delete from Tasks where task_name='Testing';
Select*from Tasks;