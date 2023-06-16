
/* Drop Triggers */

DROP TRIGGER TRI_customer_custid;
DROP TRIGGER TRI_orders_orderid;



/* Drop Tables */

DROP TABLE orders CASCADE CONSTRAINTS;
DROP TABLE customer CASCADE CONSTRAINTS;



/* Drop Sequences */

--DROP SEQUENCE SEQ_customer_custid;
--DROP SEQUENCE SEQ_orders_orderid;




/* Create Sequences */

CREATE SEQUENCE SEQ_customer_custid INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_orders_orderid INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE customer2
(
	custid number NOT NULL,
	name varchar2(50),
	address varchar2(50 char),
	phone varchar2(50),
	PRIMARY KEY (custid)
);


CREATE TABLE orders100
(
	orderid number NOT NULL,
	custid number,
	bookid number,
	saleprice number,
	orderdate date,
	custid number NOT NULL,
	PRIMARY KEY (orderid)
);



/* Create Foreign Keys */

ALTER TABLE orders
	ADD FOREIGN KEY (custid)
	REFERENCES customer (custid)
;

select * from CUSTOMER;

/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_customer_custid BEFORE INSERT ON customer
FOR EACH ROW
BEGIN
	SELECT SEQ_customer_custid.nextval
	INTO :new.custid
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_orders_orderid BEFORE INSERT ON orders
FOR EACH ROW
BEGIN
	SELECT SEQ_orders_orderid.nextval
	INTO :new.orderid
	FROM dual;
END;

/




