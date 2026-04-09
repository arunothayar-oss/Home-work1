CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    cust_name VARCHAR(50),
    city VARCHAR(50),
    grade INT,
    salesman_id INT
);
CREATE TABLE orders (
    ord_no INT PRIMARY KEY,
    purch_amt DECIMAL,
    ord_date DATE,
    customer_id INT,
    salesman_id INT,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);
SELECT o.ord_no, o.purch_amt, c.cust_name, c.city
FROM orders o
JOIN customer c 
ON o.customer_id = c.customer_id
WHERE o.purch_amt BETWEEN 500 AND 2000;
SELECT * FROM customer;
SELECT * FROM orders;