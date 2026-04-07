
package studentrecord;

import java.util.Scanner;


public class StudentMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    dao.insertStudent(new Student(name, marks));
                    break;

                case 2:
                    dao.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter New Marks: ");
                    int newMarks = sc.nextInt();

                    dao.updateStudent(id, newMarks);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int delId = sc.nextInt();

                    dao.deleteStudent(delId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
