# JDBC Integration – Java Spring Boot & MySQL

## Project Description
JDBC Integration is a Java-based application developed using Spring Boot and MySQL. It demonstrates how to connect a Java application to a relational database using JDBC and perform CRUD (Create, Read, Update, Delete) operations on student records.

## Features
- Connect Java application to MySQL database
- Insert student records
- Retrieve student details
- Update existing student records
- Delete student records
- Manage database operations using JDBC
- Automatic database table creation using SQL schema

## Technologies Used
- Java
- Spring Boot
- JDBC (Java Database Connectivity)
- MySQL
- Maven
- SQL
- Eclipse IDE

## Project Structure
```text
jdbc-integration/
├── src/main/java/
│   └── com/weintern/jdbc_integration/
│       ├── DatabaseConnection.java
│       ├── Student.java
│       ├── StudentDAO.java
│       └── JdbcIntegrationApplication.java
├── src/main/resources/
│   ├── application.properties
│   └── schema.sql
├── pom.xml
└── README.md
```

## Database Configuration
Configure your MySQL database in `application.properties`.

Update the database URL, username, and password according to your local MySQL setup.

## How to Run
1. Clone or download this repository.
2. Open the project in Eclipse IDE.
3. Configure MySQL database credentials.
4. Create or select the required database.
5. Update Maven dependencies.
6. Run `JdbcIntegrationApplication.java`.
7. Test the CRUD operations.

## CRUD Operations
- **Create:** Add new student records.
- **Read:** Retrieve student information.
- **Update:** Modify existing student details.
- **Delete:** Remove student records.

## Learning Outcomes
- Understanding JDBC connectivity.
- Working with MySQL databases.
- Performing CRUD operations.
- Understanding DAO (Data Access Object) concepts.
- Integrating Java applications with databases using Spring Boot.

## Author
Soumya Edharapu

## Internship
WeIntern Pvt. Ltd. – Java Development Internship
