
BEGIN TRANSACTION;

CREATE table employee(

        emp_id integer NOT NULL,
        job_title varchar(50) NOT NULL,
        first_name varchar(50) NOT NULL,
        last_name varchar(50) NOT NULL,
        gender char(1) NOT NULL,
        DOB date NOT NULL,
        hire_date date NOT NULL,
        dpt_id integer NOT NULL,
        CONSTRAINT pk_employee_emp_id PRIMARY KEY (emp_id)
        );
CREATE table emp_project (
        emp_id integer NOT NULL,
        project_id integer NOT NULL,
        CONSTRAINT pk_emp_project_emp_id_project_id PRIMARY KEY (emp_id, project_id)
        );
CREATE table dept (
        dept_id integer NOT NULL,
        dept varchar(50) NOT NULL,
        CONSTRAINT pk_dept_id PRIMARY KEY (dept_id)
        );
CREATE table project (
        project_id integer NOT NULL,
        project_name varchar(50),
        start_date date NOT NULL,
        CONSTRAINT pk_project_id PRIMARY KEY (project_id)
        );
        
        
   
INSERT INTO  employee (emp_id, job_title, first_name, last_name, gender, DOB, hire_date, dpt_id) VALUES (2, 'PREP', 'JIM', 'JONES', 'M', '1958-08-09', '2000-02-05', 7);
INSERT INTO  employee (emp_id, job_title, first_name, last_name, gender, DOB, hire_date, dpt_id) VALUES (3, 'PREP', 'BETTY', 'DAVIS', 'F', '1908-04-05', '1998-11-21', 7);
INSERT INTO  employee (emp_id, job_title, first_name, last_name, gender, DOB, hire_date, dpt_id) VALUES (4, 'CLEANUP', 'CHARLES', 'MANSON', 'M', '1934-11-12', '1973-07-08', 3);
INSERT INTO  employee (emp_id, job_title, first_name, last_name, gender, DOB, hire_date, dpt_id) VALUES (5, 'CLEANUP', 'MARSHALL', 'APPLEWHITE', 'M', '1931-05-17', '1997-03-26', 3);
INSERT INTO  employee (emp_id, job_title, first_name, last_name, gender, DOB, hire_date, dpt_id) VALUES (6, 'FUNDING', 'AL', 'CAPONE', 'M', '1999-02-17', '2003-06-21', 2);
INSERT INTO  employee (emp_id, job_title, first_name, last_name, gender, DOB, hire_date, dpt_id) VALUES (7, 'FUNDING', 'JEFF', 'GOLDBLUM', 'M', '1987-09-21', '2001-1-2', 2);   
INSERT INTO  employee (emp_id, job_title, first_name, last_name, gender, DOB, hire_date, dpt_id) VALUES (8, 'SALES', 'INGO', 'BINGO', 'F', '1997-02-26', '2010-1-20', 1);
INSERT INTO  employee (emp_id, job_title, first_name, last_name, gender, DOB, hire_date, dpt_id) VALUES (1, 'SALES', 'BILL', 'RUDOLF', 'M', '1988-10-20', '2010-10-20', 1); 

INSERT INTO dept (dept_id, dept) VALUES(7, 'PREP');
INSERT INTO dept(dept_id, dept) VALUES(3, 'CLEANUP');
INSERT INTO dept(dept_id, dept) VALUES (2, 'FUNDING');
INSERT INTO dept(dept_id, dept) VALUES (1, 'SALES');


INSERT INTO project(project_id, project_name, start_date) VALUES (1, 'FLAV-OR-AID', '1977-07-06');
INSERT INTO project(project_id, project_name, start_date) VALUES (2, 'ALL ABOUT EVE', '1935-09-06');
INSERT INTO project(project_id, project_name, start_date) VALUES (3, 'HELTER SKELTER', '1968-08-11');
INSERT INTO project(project_id, project_name, start_date) VALUES (4, 'OPERATION NIKE', '1995-10-15');
                        
        
        
INSERT INTO emp_project(emp_id, project_id) VALUES ((SELECT emp_id FROM employee WHERE first_name = 'JIM' AND last_name = 'JONES'), (SELECT project_id FROM project WHERE project_name = 'FLAV-OR-AID'));
INSERT INTO emp_project(emp_id, project_id) VALUES ((SELECT emp_id FROM employee WHERE first_name = 'BETTY' AND last_name = 'DAVIS'), (SELECT project_id FROM project WHERE project_name = 'ALL ABOUT EVE'));
INSERT INTO emp_project(emp_id, project_id) VALUES ((SELECT emp_id FROM employee WHERE first_name = 'CHARLES' AND last_name = 'MANSON'), (SELECT project_id FROM project WHERE project_name = 'HELTER SKELTER'));
INSERT INTO emp_project(emp_id, project_id) VALUES ((SELECT emp_id FROM employee WHERE first_name = 'MARSHALL' AND last_name = 'APPLEWHITE'), (SELECT project_id FROM project WHERE project_name = 'OPERATION NIKE'));

COMMIT TRANSACTION;
      
        