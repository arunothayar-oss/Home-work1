CREATE TABLE DEPARTMENTS
(
	department_id SERIAL primary key,
	department_name VARCHAR(50) not null,
	location VARCHAR(50) not null

);
Insert into DEPARTMENTS values(1, 'HR', 'Chennai'),(2, 'Development', 'Bangalore'),
(3, 'Testing', 'Chennai'),(4, 'Support', 'Hyderabad');
SELECT * FROM DEPARTMENTS;
SELECT *FROM DEPARTMENTS where location='Chennai';