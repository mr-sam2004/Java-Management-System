// StudentManagementSystem.java
import java.util.*;

public class StudentManagementSystem {

    // Abstraction: only methods to manage students are visible
    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println(" Student added!");
    }

    // View All Students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            s.display();  // Polymorphism in action
        }
    }

    // Search by ID
    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }
        System.out.println(" Student not found!");
    }

    // Delete by ID
    public void deleteStudent(int id) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getId() == id) {
                it.remove();
                System.out.println(" Student deleted!");
                return;
            }
        }
        System.out.println(" Student not found!");
    }

    // Main 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();

                Student s = new Student(id, name, age, dept);
                sms.addStudent(s);

            } else if (choice == 2) {
                sms.viewStudents();

            } else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sms.searchStudent(id);

            } else if (choice == 4) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sms.deleteStudent(id);

            } else if (choice == 5) {
                System.out.println("Thank you! Exiting...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
