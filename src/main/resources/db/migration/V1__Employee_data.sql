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
  created_tstamp timestamp without time zone,
  last_updated_tstamp timestamp without time zone,
  bio character varying(255) NOT NULL,
  department character varying(255) NOT NULL,
  email_id character varying(255) NOT NULL,
  first_name character varying(255) NOT NULL,
  join_date character varying(255) NOT NULL,
  last_name character varying(255) NOT NULL,
  location character varying(255) NOT NULL,
  middle_name character varying(255),
  phone_no character varying(255) NOT NULL,
  picture character varying(255) NOT NULL,
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

INSERT INTO employee VALUES (10, '2018-02-08 13:40:45.82', '2018-02-08 13:40:45.82', 'A professional engineer is competent by virtue of his/her fundamental education and training to apply the scientific method and outlook to the analysis and solution of engineering problems. ', 'Engineering', 'manvendra@gmail.com', 'Manvendra', '2018-02-01T18:30:00.000Z', 'Narwar', 'Hyderabad', 'Singh', '8011021765', 'a49122ec-30ad-4055-b329-a55212150da9', 'Tag Cloud', NULL, 'Engineer', 'Java,Ember,Python');
INSERT INTO employee VALUES (11, '2018-02-08 13:42:18.729', '2018-02-08 13:42:18.729', 'A professional engineer is competent by virtue of his/her fundamental education and training to apply the scientific method and outlook to the analysis and solution of engineering problems. ', 'Development', 'ady@gmail.com', 'Aditya', '2018-02-02T18:30:00.000Z', 'Kaushal', 'Bangalore', NULL, '78468284247', 'e2b560cb-0594-44dd-a828-8a27c1c6dba0', 'ZeDedup', NULL, 'Developer', 'PHP,C++');
INSERT INTO employee VALUES (12, '2018-02-08 13:43:22.79', '2018-02-08 13:43:22.79', 'A professional engineer is competent by virtue of his/her fundamental education and training to apply the scientific method and outlook to the analysis and solution of engineering problems. ', 'Testing', 'ankit@gmail.com', 'Ankit', '2018-02-04T18:30:00.000Z', 'Kumar', 'Delhi', NULL, '34582840242', 'e6e4f4ea-7300-4f3b-95b3-47ec596bcb83', 'Tag Cloud', NULL, 'Tester', 'Qualitative Analysis,Testing');
INSERT INTO employee VALUES (13, '2018-02-08 13:46:21.554', '2018-02-08 13:46:21.554', 'A professional engineer is competent by virtue of his/her fundamental education and training to apply the scientific method and outlook to the analysis and solution of engineering problems. ', 'Engineering', 'prasoon@gmail.com', 'Prasoon', '2018-02-01T18:30:00.000Z', 'Kirar', 'Hyderabad', NULL, '678532425225', '6c564c64-2ee3-4ce8-8eec-8d0c82f9cd5c', 'Haystack', NULL, 'Manager', 'Management');
INSERT INTO employee VALUES (14, '2018-02-08 13:47:26.741', '2018-02-08 13:47:26.741', 'A professional engineer is competent by virtue of his/her fundamental education and training to apply the scientific method and outlook to the analysis and solution of engineering problems. ', 'Engineering', 'jay@gmail.com', 'Jay', '2018-01-31T18:30:00.000Z', 'Kumar', 'Hyderabad', NULL, '902707412740', '6e0604ff-047a-40a7-92b6-e07ee639ca6f', 'Voice Enabled App', NULL, 'Senior Engineer', 'Java,Ruby,PHP,Python,C++,Ember,Management');
INSERT INTO employee VALUES (15, '2018-02-08 13:48:25.21', '2018-02-08 13:48:25.21', 'A professional engineer is competent by virtue of his/her fundamental education and training to apply the scientific method and outlook to the analysis and solution of engineering problems. ', 'Engineering', 'abhiraj@gmail.com', 'Abhiraj', '2018-02-06T18:30:00.000Z', 'Singh', 'Hyderabad', NULL, '08077867464', 'b4bcfc1d-a745-4e99-8b7c-b18ae3ef4067', 'Haystack', NULL, 'Manger', 'Management');
INSERT INTO employee VALUES (16, '2018-02-08 13:49:32.077', '2018-02-08 13:49:32.077', 'A professional engineer is competent by virtue of his/her fundamental education and training to apply the scientific method and outlook to the analysis and solution of engineering problems. ', 'Human Resources', 'adasd@gmad.com', 'Apoorva', '2018-02-01T18:30:00.000Z', 'Singhal', 'Texas', NULL, '9897242344', 'a3e556b5-ccbb-4ded-9491-011df063beaf', 'Tag Cloud', NULL, 'HR', 'Management');
INSERT INTO employee VALUES (17, '2018-02-08 13:50:38.438', '2018-02-08 13:50:38.438', 'A professional engineer is competent by virtue of his/her fundamental education and training to apply the scientific method and outlook to the analysis and solution of engineering problems. ', 'Development', 'aditi@gmail.com', 'Aditi', '2018-02-08T18:30:00.000Z', 'Singh', 'Bangalore', NULL, '972957238562', '5742e2c3-422e-417e-b4b5-78b9569f090a', 'ToothStars', NULL, 'Developer', 'Ember,Python,PHP');


-- Table: public.department

-- DROP TABLE public.department;

CREATE TABLE public.department
(
  id bigint NOT NULL,
  created_tstamp timestamp without time zone,
  last_updated_tstamp timestamp without time zone,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT department_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE public.department
  OWNER TO postgres;

INSERT INTO department VALUES (1, NULL, NULL, 'Engineering Description', 'Engineering');
INSERT INTO department VALUES (2, NULL, NULL, 'Development Description', 'Development');
INSERT INTO department VALUES (3, NULL, NULL, 'HR Description', 'Human Resources');
INSERT INTO department VALUES (4, NULL, NULL, 'Maintenance Description', 'Maintenance');
INSERT INTO department VALUES (5, NULL, NULL, 'Testing Description', 'Testing');

-- Table: public.location

-- DROP TABLE public.location;

CREATE TABLE public.location
(
  id bigint NOT NULL,
  created_tstamp timestamp without time zone,
  last_updated_tstamp timestamp without time zone,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT location_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE public.location
  OWNER TO postgres;

INSERT INTO location VALUES (1, NULL, NULL, 'AP', 'Hyderabad');
INSERT INTO location VALUES (2, NULL, NULL, 'Karnataka', 'Bangalore');
INSERT INTO location VALUES (3, NULL, NULL, 'India', 'Delhi');
INSERT INTO location VALUES (4, NULL, NULL, 'US', 'Texas');
INSERT INTO location VALUES (5, NULL, NULL, 'US', 'New York');

-- Table: public.project

-- DROP TABLE public.project;

CREATE TABLE public.project
(
  id bigint NOT NULL,
  created_tstamp timestamp without time zone,
  last_updated_tstamp timestamp without time zone,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT project_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE public.project
  OWNER TO postgres;

INSERT INTO project VALUES (1, NULL, NULL, 'Tag cloud Description', 'Tag Cloud');
INSERT INTO project VALUES (2, NULL, NULL, 'ZeDedup Description', 'ZeDedup');
INSERT INTO project VALUES (3, NULL, NULL, 'ToothStars Description', 'ToothStars');
INSERT INTO project VALUES (4, NULL, NULL, 'Haystack Description', 'Haystack');
INSERT INTO project VALUES (5, NULL, NULL, 'Voice Enabled App Description', 'Voice Enabled App');

-- Table: public.role

-- DROP TABLE public.role;

CREATE TABLE public.role
(
  id bigint NOT NULL,
  created_tstamp timestamp without time zone,
  last_updated_tstamp timestamp without time zone,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT role_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE public.role
  OWNER TO postgres;

INSERT INTO role VALUES (1, NULL, NULL, 'Engineer Decription', 'Engineer');
INSERT INTO role VALUES (2, NULL, NULL, 'Developer Description', 'Developer');
INSERT INTO role VALUES (3, NULL, NULL, 'Tester Description', 'Tester');
INSERT INTO role VALUES (4, NULL, NULL, 'Manager Descption', 'Manager');
INSERT INTO role VALUES (5, NULL, NULL, 'Senior Engineer Description', 'Senior Engineer');
INSERT INTO role VALUES (6, NULL, NULL, 'HR Decription', 'HR');

-- Table: public.skill

-- DROP TABLE public.skill;

CREATE TABLE public.skill
(
  id bigint NOT NULL,
  created_tstamp timestamp without time zone,
  last_updated_tstamp timestamp without time zone,
  description character varying(255),
  name character varying(255) NOT NULL,
  CONSTRAINT skill_pkey PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE public.skill
  OWNER TO postgres;

INSERT INTO skill VALUES (1, NULL, NULL, 'Java', 'Java');
INSERT INTO skill VALUES (2, NULL, NULL, 'Ruby', 'Ruby');
INSERT INTO skill VALUES (3, NULL, NULL, 'PHP', 'PHP');
INSERT INTO skill VALUES (4, NULL, NULL, 'Python', 'Python');
INSERT INTO skill VALUES (5, NULL, NULL, 'C++', 'C++');
INSERT INTO skill VALUES (6, NULL, NULL, 'Ember', 'Ember');
INSERT INTO skill VALUES (7, NULL, NULL, 'Management', 'Management');
INSERT INTO skill VALUES (8, NULL, NULL, 'Qualitative Analysis', 'Qualitative Analysis');
INSERT INTO skill VALUES (9, NULL, NULL, 'Testing', 'Testing');