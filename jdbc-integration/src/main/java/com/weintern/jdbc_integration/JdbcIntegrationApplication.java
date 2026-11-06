package com.weintern.jdbc_integration;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JdbcIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcIntegrationApplication.class, args);
    }

    @Bean
    CommandLineRunner run() {
        return args -> {
            StudentDAO dao = new StudentDAO();
            Scanner sc = new Scanner(System.in);

            // Create database table
            dao.createTable();

            while (true) {
                System.out.println("\n===== STUDENT MANAGEMENT =====");
                System.out.println("1. Insert Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                String choice = sc.nextLine().trim();

                try {
                    switch (choice) {
                        case "1": {
                            System.out.print("Enter ID: ");
                            int id = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Age: ");
                            int age = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter Course: ");
                            String course = sc.nextLine();

                            dao.insertRecord(
                                    new Student(id, name, age, course));
                            break;
                        }

                        case "2": {
                            List<Student> students = dao.getAllRecords();

                            if (students.isEmpty()) {
                                System.out.println("No student records found.");
                            } else {
                                for (Student s : students) {
                                    System.out.println(
                                            "ID: " + s.getId()
                                            + ", Name: " + s.getName()
                                            + ", Age: " + s.getAge()
                                            + ", Course: " + s.getCourse());
                                }
                            }
                            break;
                        }

                        case "3": {
                            System.out.print("Enter student ID to update: ");
                            int id = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter new Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter new Age: ");
                            int age = Integer.parseInt(sc.nextLine());

                            System.out.print("Enter new Course: ");
                            String course = sc.nextLine();

                            dao.updateRecord(
                                    new Student(id, name, age, course));
                            break;
                        }

                        case "4": {
                            System.out.print("Enter student ID to delete: ");
                            int id = Integer.parseInt(sc.nextLine());

                            dao.deleteRecord(id);
                            break;
                        }

                        case "5":
                            System.out.println("Application closed.");
                            return;

                        default:
                            System.out.println("Invalid choice. Try again.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }
            }
        };
    }
}
