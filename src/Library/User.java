package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    public static ArrayList<Student> students = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    // Register Student
    public void registerStudent() {

        System.out.println("\n====== REGISTER STUDENT ======");

        System.out.print("Student ID: ");
        String id = input.nextLine();

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Course: ");
        String course = input.nextLine();

        System.out.print("Phone: ");
        String phone = input.nextLine();

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        Student student = new Student(id, name, course, phone,
                username, password);

        students.add(student);

        System.out.println("\nStudent Registered Successfully!");
    }

    // Update Student
    public void updateStudent() {

        System.out.print("\nEnter Student ID: ");
        String id = input.nextLine();

        for (Student s : students) {

            if (s.getStudentId().equals(id)) {

                System.out.print("New Name: ");
                s.setName(input.nextLine());

                System.out.print("New Course: ");
                s.setCourse(input.nextLine());

                System.out.print("New Phone: ");
                s.setPhone(input.nextLine());

                System.out.print("New Password: ");
                s.setPassword(input.nextLine());

                System.out.println("Student Updated Successfully!");

                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // View Student
    public void viewStudent() {

        System.out.print("\nEnter Student ID: ");
        String id = input.nextLine();

        for (Student s : students) {

            if (s.getStudentId().equals(id)) {

                s.displayProfile();
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

}