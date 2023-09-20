---------------------------------------------
|      SchoolAPI - Academic Records Management      |
---------------------------------------------

The SchoolAPI is a powerful Academic Records Management API built using a combination of Java, Spring Boot, and SQLite technologies. This API serves the primary purpose of efficiently managing academic records within an educational institution. Below is a brief overview of its purpose and the technologies used:

Purpose:
The SchoolAPI is designed to streamline the management of academic records, providing a reliable and efficient solution for educational institutions. Its key functionalities include:

1. Student Record Management: The API allows educational institutions to store and manage student records, including personal information, enrollment details, and academic progress.

![Implemented CRUD](https://github.com/williamsilvaj/iCausasAPI/assets/119798187/fbf69f9f-1ec3-4e70-a978-707408c52e1f)

3. Course Management: It facilitates the management of courses offered by the institution, including course details, schedules, and prerequisites.

4. Enrollment and Grading: The API supports student enrollment in courses and allows faculty to assign grades, keeping track of academic performance.
 
5. Interactive Documentation: Swagger is integrated for interactive documentation, making it easier for developers to understand and utilize the API's endpoints.

![Swagger](https://github.com/williamsilvaj/iCausasAPI/assets/119798187/b680cb5e-be30-4408-b2d6-ad770c6aa8b5)

Technologies Used:
The SchoolAPI leverages several cutting-edge technologies to provide a robust academic records management solution:

1. Java: The API is developed using Java, a widely adopted and versatile programming language known for its platform independence and strong community support.

2. Spring Boot: Spring Boot is employed as the framework for building the API. It simplifies the development process by providing pre-configured settings and a comprehensive ecosystem for building web applications.

3. SQLite Database: SQLite serves as the database management system for storing academic records. SQLite is a lightweight, file-based relational database that is well-suited for small to medium-sized applications.

These technologies work in harmony to create a dependable and efficient Academic Records Management API, offering educational institutions a user-friendly and secure platform for managing their academic data.
---------------------------------------------

# File Name: *AcademicRecords*

This is a step-by-step guide to set up a Spring Boot API that uses Swagger for documentation and interactive testing.

### Prerequisites

Before you begin, make sure you have the following installed on your machine:

- Java JDK
- Maven

### Instructions

Follow these steps to configure and run the Spring Boot API:

1. Clone or download this repository.

2. Open the terminal and navigate to the project's root directory.

*AcademicRecords/src/main/java/com/example/AcademicRecords/configurations/DataSourceConfig.java*

2.1 In this location *AcademicRecords/src/main/java/com/example/AcademicRecords/configurations/DataSourceConfig.java*, you will find the field *dataSource.setUrl("jdbc:sqlite:place the database path here");*.

   The database is in the *AcademicRecords/DatabaseSQLite/AcademicRecordsDB* folder along with separate SQL code.

3. Make sure you have Maven installed. To check, run the following command:

*mvn -v*

   This should display information about the installed Maven version.

4. Compile the project using Maven:

*mvn clean install*

   This will compile the project and download all necessary dependencies.

5. After the compilation is complete, run the Spring Boot application:

*mvn spring-boot:run*

   The application will start on the default port 8080.

6. Open your web browser and access the Swagger documentation at:

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

You will see the Swagger interface, which allows you to explore and test the API endpoints.
