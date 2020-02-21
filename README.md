# ISP-Customer-Management-System (JAVA, ORACLE PL/SQL)
Server -side code for automated bill generation, different triggers for bill payment, customer deletion etc.

Server side codes: 



Creating 5 views
1. Customer+Package view: 
CREATE OR REPLACE VIEW customer_package AS
SELECT customer.cid, customer.cname, customer.cphone, package.pname, package.monthlybill, package.speed
FROM customer, package where customer.package= package.pid; 
2. Complaint+Customer view: 
CREATE OR REPLACE VIEW complaint_customer AS
select topic, details, cname, cphone from customer, complain where customer.cid= complain.cid;
3. UnpaidBills view: 
CREATE OR REPLACE VIEW bills_unpaid AS
select * from billing where bstatus='unpaid'
4. Customer+Bill view: 
CREATE OR REPLACE VIEW customer_bills AS
select customer.cid, customer.cname,customer.cphone, billing.bid, billing.amount, billing.billingmonth, billing.bstatus from billing,customer where billing.cid=customer.cid;
5. Total Bill per Month view: 
CREATE OR REPLACE VIEW bills_by_month AS
select billingmonth,sum(amount) as total_bill from billing group by billingmonth



Creating 6 Functions and Procedures
Function+Procedure for Bill Payment (Using package and Exception Handing):
create or replace package payment is
   function cut_balance(id customer.cid%type, am billing.amount%type) 
      return boolean;
   PROCEDURE paybill(id billing.bid%Type);
end;
create or replace package body payment is
   function cut_balance(cust_id customer.cid%type, am billing.amount%type) 
      return boolean
   IS
   b number(10);
    newbal number(10);
Begin
    
    select balance into b from customer where cid= cust_id;
newbal:=b-am;
if (newbal<0) then
return false;
else
UPDATE customer 
SET balance=newbal where cid=cust_id;
return true;
End if;

End cut_balance;
PROCEDURE paybill(id billing.bid%Type)
   is
    cust_id billing.cid%TYPE;
    am billing.amount%type;
BEGIN
select cid,amount into cust_id,am from billing where bid= id and bstatus='unpaid';
if (cut_balance(cust_id,am)) then
UPDATE billing 
SET bstatus='paid' where bid=id;
END IF;
Exception
When no_data_found then
dbms_output.put_line('Bill Already Paid');
END paybill;
end;

Automatic Billing Function and Procedure (Using Cursor for Loop):
create or replace function exist_check(id billing.cid%type, cur_month billing.billingmonth%type) 
      return boolean
   IS
      c number(5);
Begin
    
    select count(*) into c from billing where cid= id and billingmonth=cur_month;
if (c>0) then
return true;
else
return false;
End if;

create or replace PROCEDURE genbill
   is
    cur_month billing.billingmonth%type;
    bill package.monthlybill%type;
    CURSOR C is select * from customer where billingdate=TO_CHAR(SYSDATE,'DD');
BEGIN
SELECT TO_CHAR(SYSDATE,'MONTH') into cur_month FROM dual;
FOR i in C LOOP
if not(exist_check(i.cid,cur_month)) then
select monthlybill into bill from customer_package where cid=i.cid; 
insert into billing values(billing_id.nextval, i.cid, bill, 'December', 'unpaid');
END IF;
END LOOP;
END genbill;


End exist_check;


Helping Function for customer deletion trigger:
Create or replace Function check_unpaid_bills(id customer.cid%type)
Return boolean IS
    c number(5);
Begin
    
    select count(*) into c from bills_unpaid where cid= id;
if (c>0) then
return true;
else
return false;
End if;
End;



Add Balance Procedure:
Create or replace PROCEDURE addBal(cm customer.cemail%Type, amount number) IS
bal number(10);
BEGIN
select balance into bal from customer where cemail=cm;
bal:=bal+amount;
UPDATE customer
SET
BALANCE=bal where cemail=cm;
END;









Creating 4 Triggers
1. Minimum Balance:
CREATE OR REPLACE TRIGGER balance__monitoring
BEFORE INSERT on customer
FOR each row
BEGIN
IF (:new.balance<= 500) then raise_application_error(-20111, 'Error! Minimum balance amount is 500'); 
END IF; 
END;
2. Checking for valid billing date:
CREATE OR REPLACE TRIGGER billingdate_checking
BEFORE INSERT on customer
FOR each row
BEGIN
IF ((:new.billingdate < 1) or (:new.billingdate>28)) then raise_application_error(-20111, 'Error! Invalid Billing Date'); 
END IF; 
END;




3. Checking for due bills before delete:
CREATE OR REPLACE TRIGGER due_bills_checking
BEFORE DELETE on customer
FOR each row
BEGIN
IF (check_unpaid_bills(:old.cid)) then raise_application_error(-20111, 'Error! Customer has due bills'); 
END IF; 
END;
4. Creating Log after balance change:
CREATE OR REPLACE TRIGGER balance_change_log
AFTER UPDATE of balance on customer
FOR each row
BEGIN
insert into customer_bal_log values(:old.cid,:old.balance,:new.balance,SYSDATE);
END;
