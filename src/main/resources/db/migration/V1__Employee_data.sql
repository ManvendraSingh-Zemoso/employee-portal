-- Sequence: public.hibernate_sequence

-- DROP SEQUENCE public.hibernate_sequence;

CREATE SEQUENCE public.hibernate_sequence
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1
CACHE 1;
ALTER TABLE public.hibernate_sequence
  OWNER TO postgres;


-- Table: public.employee

-- DROP TABLE public.employee;

CREATE TABLE public.employee
(
  id bigint NOT NULL,
  bio character varying(255),
  department_id bigint,
  email_id character varying(255) NOT NULL,
  employee_id bigint,
  first_name character varying(255) NOT NULL,
  join_date character varying(255),
  last_name character varying(255) NOT NULL,
  location_id bigint,
  middle_name character varying(255),
  phone_no character varying(255) NOT NULL,
  picture character varying(255),
  project_id bigint,
  role_id bigint NOT NULL,
  skill_id bigint,
  department character varying(255) NOT NULL,
  location character varying(255) NOT NULL,
  project character varying(255) NOT NULL,
  report_employee character varying(255),
  role character varying(255) NOT NULL,
  skills character varying(255),
  CONSTRAINT employee_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE public.employee
  OWNER TO postgres;



-- Table: public.employee_department

-- DROP TABLE public.employee_department;

CREATE TABLE public.employee_department
(
  id bigint NOT NULL,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT employee_department_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.employee_department
  OWNER TO postgres;

INSERT INTO employee_department VALUES (1, NULL, 'Development');
INSERT INTO employee_department VALUES (2, NULL, 'HR');
INSERT INTO employee_department VALUES (3, NULL, 'Testing');
INSERT INTO employee_department VALUES (4, NULL, 'Maintenance');

-- Table: public.employee_location

-- DROP TABLE public.employee_location;

CREATE TABLE public.employee_location
(
  id bigint NOT NULL,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT employee_location_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.employee_location
  OWNER TO postgres;

INSERT INTO employee_location VALUES (5, NULL, 'Hyderabad');
INSERT INTO employee_location VALUES (6, NULL, 'Bangalore');
INSERT INTO employee_location VALUES (7, NULL, 'Texas');

-- Table: public.employee_project

-- DROP TABLE public.employee_project;

CREATE TABLE public.employee_project
(
  id bigint NOT NULL,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT employee_project_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.employee_project
  OWNER TO postgres;

INSERT INTO employee_project VALUES (8, NULL, 'MindHive');
INSERT INTO employee_project VALUES (9, NULL, 'UAV');
INSERT INTO employee_project VALUES (10, NULL, 'TagCloud');
INSERT INTO employee_project VALUES (11, NULL, 'Zededup');
INSERT INTO employee_project VALUES (12, NULL, 'ToothStars');

-- Table: public.employee_role

-- DROP TABLE public.employee_role;

CREATE TABLE public.employee_role
(
  id bigint NOT NULL,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT employee_role_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.employee_role
  OWNER TO postgres;

INSERT INTO employee_role VALUES (13, NULL, 'Software Engineer');
INSERT INTO employee_role VALUES (14, NULL, 'Senior Software Engineer');
INSERT INTO employee_role VALUES (15, NULL, 'Principal Software Engineer');
INSERT INTO employee_role VALUES (16, NULL, 'Project Manager');
INSERT INTO employee_role VALUES (17, NULL, 'Product Architect');
INSERT INTO employee_role VALUES (18, NULL, 'Director');
INSERT INTO employee_role VALUES (19, NULL, 'QA Engineer');
INSERT INTO employee_role VALUES (20, NULL, 'Senior QA Engineer');
INSERT INTO employee_role VALUES (21, NULL, 'HR  Personnel');
INSERT INTO employee_role VALUES (22, NULL, 'HR Manager');
INSERT INTO employee_role VALUES (23, NULL, 'Security Guard');
INSERT INTO employee_role VALUES (24, NULL, 'Jenitor');
INSERT INTO employee_role VALUES (25, NULL, 'Maintenance Manager');
INSERT INTO employee_role VALUES (26, NULL, 'Project Manager');

-- Table: public.employee_skill

-- DROP TABLE public.employee_skill;

CREATE TABLE public.employee_skill
(
  id bigint NOT NULL,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT employee_skill_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.employee_skill
  OWNER TO postgres;

INSERT INTO employee_skill VALUES (27, NULL, 'JavaScript');
INSERT INTO employee_skill VALUES (28, NULL, 'Swift');
INSERT INTO employee_skill VALUES (29, NULL, 'Project Management');
INSERT INTO employee_skill VALUES (30, NULL, 'Objective C');
INSERT INTO employee_skill VALUES (31, NULL, 'QA');
INSERT INTO employee_skill VALUES (32, NULL, 'Skill 1');
INSERT INTO employee_skill VALUES (33, NULL, 'Skill 2');
INSERT INTO employee_skill VALUES (34, NULL, 'Java');
