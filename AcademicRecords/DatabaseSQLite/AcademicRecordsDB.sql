BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "department" (
	"id"	INTEGER,
	"name"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "HTE_department" (
	"department_id"	integer,
	"rn_"	integer NOT NULL,
	"hib_sess_id"	char(36) NOT NULL,
	"name"	varchar(255),
	PRIMARY KEY("rn_","hib_sess_id")
);
CREATE TABLE IF NOT EXISTS "discipline" (
	"id"	INTEGER,
	"code"	TEXT,
	"name"	TEXT,
	"workload"	INTEGER,
	PRIMARY KEY("id" AUTOINCREMENT),
	UNIQUE("code")
);
CREATE TABLE IF NOT EXISTS "professor" (
	"id"	INTEGER,
	"name"	TEXT,
	PRIMARY KEY("id")
);
CREATE TABLE IF NOT EXISTS "student" (
	"id"	INTEGER,
	"name"	TEXT,
	"birthday"	TEXT,
	"birth_place"	TEXT,
	"nationality"	TEXT,
	"cpf"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "sisu_score" (
	"id"	INTEGER,
	"student_id"	TEXT,
	"score_average"	INTEGER,
	"quota_type"	TEXT,
	"classification"	INTEGER,
	"created_at"	TEXT,
	FOREIGN KEY("student_id") REFERENCES "student"("id"),
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "course" (
	"id"	INTEGER,
	"name"	TEXT,
	"department_id"	INTEGER,
	"type"	TEXT,
	"level"	TEXT,
	FOREIGN KEY("department_id") REFERENCES "department"("id"),
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "curriculum" (
	"id"	INTEGER,
	"status"	TEXT,
	"initial_period"	TEXT,
	"current_period_number"	INTEGER,
	"iech"	INTEGER,
	"iepl"	INTEGER,
	"mc"	INTEGER,
	"iea"	INTEGER,
	"register"	TEXT,
	"student_id"	INTEGER,
	"course_id"	INTEGER,
	"ingress_form"	TEXT,
	"certification"	TEXT,
	"conclusion_deadline_period"	TEXT,
	"locks_number"	INTEGER,
	"extensions_number"	INTEGER,
	"leaving_date"	TEXT,
	"leaving_reason"	TEXT,
	"graduation_date"	TEXT,
	"required_component_workload"	INTEGER,
	"fulfilled_component_workload"	INTEGER,
	"required_activity_workload"	INTEGER,
	"fulfilled_activity_workload"	INTEGER,
	FOREIGN KEY("course_id") REFERENCES "course"("id"),
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("student_id") REFERENCES "student"("id")
);
CREATE TABLE IF NOT EXISTS "required_pending_discipline" (
	"id"	INTEGER,
	"curriculum_id"	INTEGER,
	"discipline_id"	INTEGER,
	"level"	INTEGER,
	FOREIGN KEY("curriculum_id") REFERENCES "curriculum"("id"),
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("discipline_id") REFERENCES "discipline"("id")
);
CREATE TABLE IF NOT EXISTS "curricular_component" (
	"id"	INTEGER,
	"period"	TEXT,
	"class_number"	INTEGER,
	"frequency"	INTEGER,
	"situation"	TEXT,
	"grade"	INTEGER,
	"type"	TEXT,
	"curriculum_id"	INTEGER,
	"discipline_id"	INTEGER,
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("curriculum_id") REFERENCES "curriculum"("id"),
	FOREIGN KEY("discipline_id") REFERENCES "discipline"("id")
);
CREATE TABLE IF NOT EXISTS "professor_workload" (
	"id"	INTEGER,
	"curricular_component_id"	INTEGER,
	"professor_id"	INTEGER,
	"workload"	INTEGER,
	FOREIGN KEY("curricular_component_id") REFERENCES "curricular_component"("id"),
	PRIMARY KEY("id" AUTOINCREMENT)
);
INSERT INTO "department" ("id","name") VALUES (0,'Computing');
INSERT INTO "department" ("id","name") VALUES (6,'Computer Science');
INSERT INTO "department" ("id","name") VALUES (7,'Mathematics');
INSERT INTO "department" ("id","name") VALUES (8,'Physics');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (2,'Introduction to Programming',6,'Core','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (3,'Data Structures and Algorithms',6,'Core','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (4,'Database Management',6,'Elective','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (5,'Linear Algebra',7,'Core','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (6,'Calculus I',7,'Core','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (7,'Quantum Mechanics',8,'Core','Graduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (8,'Electromagnetism',8,'Core','Graduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (9,'Design and Analysis of Algorithms',NULL,'Core','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (10,'Computer Architecture',NULL,'Core','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (11,'Network Security',NULL,'Core','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (12,'Network Security',6,'Core','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (13,'Network Security',6,'Core','Undergraduate');
INSERT INTO "course" ("id","name","department_id","type","level") VALUES (14,'Machine Learning',6,'Core','Undergraduate');
COMMIT;
