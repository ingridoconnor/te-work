
BEGIN TRANSACTION;


CREATE table employee(

        emp_id serial NOT NULL,
        job_title varchar(50) NOT NULL,
        first_name varchar(50) NOT NULL,
        last_name varchar(50) NOT NULL,
        gender char(1) NOT NULL,
        DOB date NOT NULL,
        hire_date date NOT NULL,
        dept_id integer NOT NULL,
        CONSTRAINT pk_employee_emp_id PRIMARY KEY (emp_id)
        );
CREATE table emp_project (
        emp_id integer NOT NULL,
        project_id integer NOT NULL,
        CONSTRAINT pk_emp_project_emp_id_project_id PRIMARY KEY (emp_id, project_id)
        );
CREATE table dept (
        dept_id serial NOT NULL,
        dept varchar(50) NOT NULL,
        CONSTRAINT pk_dept_id PRIMARY KEY (dept_id)
        );
CREATE table project (
        project_id serial NOT NULL,
        project_name varchar(50),
        start_date date NOT NULL,
        CONSTRAINT pk_project_id PRIMARY KEY (project_id)
        );
  
  
ALTER TABLE employee
ADD FOREIGN KEY (dept_id) 
REFERENCES dept(dept_id);

ALTER TABLE emp_project
ADD FOREIGN KEY (project_id) 
REFERENCES project(project_id);

ALTER TABLE emp_project
ADD FOREIGN KEY (emp_id) 
REFERENCES employee(emp_id);     
  
        
      
INSERT INTO dept (dept) VALUES('PREP');
INSERT INTO dept( dept) VALUES('CLEANUP');
INSERT INTO dept(dept) VALUES ('FUNDING');
INSERT INTO dept( dept) VALUES ('SALES');  
   
INSERT INTO  employee (job_title, first_name, last_name, gender, DOB, hire_date, dept_id) VALUES ('PREP', 'JIM', 'JONES', 'M', '1958-08-09', '2000-02-05', (SELECT dept_id FROM dept WHERE dept= 'PREP' ));
INSERT INTO  employee (job_title, first_name, last_name, gender, DOB, hire_date, dept_id) VALUES ( 'PREP', 'BETTY', 'DAVIS', 'F', '1908-04-05', '1998-11-21', (SELECT dept_id FROM dept WHERE dept= 'PREP'));
INSERT INTO  employee ( job_title, first_name, last_name, gender, DOB, hire_date, dept_id) VALUES ( 'CLEANUP', 'CHARLES', 'MANSON', 'M', '1934-11-12', '1973-07-08', (SELECT dept_id FROM dept WHERE dept = 'CLEANUP'));
INSERT INTO  employee ( job_title, first_name, last_name, gender, DOB, hire_date, dept_id) VALUES ('CLEANUP', 'MARSHALL', 'APPLEWHITE', 'M', '1931-05-17', '1997-03-26', (SELECT dept_id FROM dept WHERE dept= 'CLEANUP'));
INSERT INTO  employee (job_title, first_name, last_name, gender, DOB, hire_date, dept_id) VALUES ('FUNDING', 'AL', 'CAPONE', 'M', '1999-02-17', '2003-06-21', (SELECT dept_id FROM dept WHERE dept = 'FUNDING'));
INSERT INTO  employee (job_title, first_name, last_name, gender, DOB, hire_date, dept_id) VALUES ('FUNDING', 'JEFF', 'GOLDBLUM', 'M', '1987-09-21', '2001-1-2', (SELECT dept_id FROM dept WHERE dept = 'FUNDING'));   
INSERT INTO  employee (job_title, first_name, last_name, gender, DOB, hire_date, dept_id) VALUES ('SALES', 'INGO', 'BINGO', 'F', '1997-02-26', '2010-1-20', (SELECT dept_id FROM dept WHERE dept = 'SALES'));
INSERT INTO  employee (job_title, first_name, last_name, gender, DOB, hire_date, dept_id) VALUES ('SALES', 'BILL', 'RUDOLF', 'M', '1988-10-20', '2010-10-20', (SELECT dept_id FROM dept WHERE dept = 'SALES')); 



INSERT INTO project(project_name, start_date) VALUES ('FLAV-OR-AID', '1977-07-06');
INSERT INTO project(project_name, start_date) VALUES ('ALL ABOUT EVE', '1935-09-06');
INSERT INTO project(project_name, start_date) VALUES ('HELTER SKELTER', '1968-08-11');
INSERT INTO project(project_name, start_date) VALUES ('OPERATION NIKE', '1995-10-15');
                        
        
        
INSERT INTO emp_project(emp_id, project_id) VALUES ((SELECT emp_id FROM employee WHERE first_name = 'JIM' AND last_name = 'JONES'), (SELECT project_id FROM project WHERE project_name = 'FLAV-OR-AID'));
INSERT INTO emp_project(emp_id, project_id) VALUES ((SELECT emp_id FROM employee WHERE first_name = 'BETTY' AND last_name = 'DAVIS'), (SELECT project_id FROM project WHERE project_name = 'ALL ABOUT EVE'));
INSERT INTO emp_project(emp_id, project_id) VALUES ((SELECT emp_id FROM employee WHERE first_name = 'CHARLES' AND last_name = 'MANSON'), (SELECT project_id FROM project WHERE project_name = 'HELTER SKELTER'));
INSERT INTO emp_project(emp_id, project_id) VALUES ((SELECT emp_id FROM employee WHERE first_name = 'MARSHALL' AND last_name = 'APPLEWHITE'), (SELECT project_id FROM project WHERE project_name = 'OPERATION NIKE'));

COMMIT TRANSACTION;
      
        