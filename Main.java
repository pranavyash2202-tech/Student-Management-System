import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        manager.getStudents().addAll(
            FileHandler.loadStudents()
        );

        while (true) {

            System.out.println("\n================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort by Marks");
            System.out.println("7. Save Data");
            System.out.println("8. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1:

                    try {
                        System.out.print("Enter Student ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        double marks = Double.parseDouble(sc.nextLine());

                        if (marks < 0 || marks > 100) {
                            System.out.println("Marks must be between 0 and 100.");
                            break;
                        }

                        Student student =
                            new Student(id, name, age, course, marks);

                        manager.addStudent(student);

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input!");
                    }

                    break;

                case 2:

                    manager.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");

                    try {
                        int id = Integer.parseInt(sc.nextLine());

                        manager.searchStudent(id);

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                    }

                    break;

                case 4:

                    try {

                        System.out.print("Enter Student ID to update: ");
                        int id = Integer.parseInt(sc.nextLine());

                        Student existing = manager.findStudent(id);

                        if (existing == null) {
                            System.out.println("Student not found.");
                            break;
                        }

                        System.out.print("Enter New Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter New Age: ");
                        int age = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter New Course: ");
                        String course = sc.nextLine();

                        System.out.print("Enter New Marks: ");
                        double marks = Double.parseDouble(sc.nextLine());

                        manager.updateStudent(
                            id, name, age, course, marks
                        );

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }

                    break;

                case 5:

                    try {

                        System.out.print("Enter Student ID to delete: ");
                        int id = Integer.parseInt(sc.nextLine());

                        manager.deleteStudent(id);

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                    }

                    break;

                case 6:

                    manager.sortByMarks();
                    manager.viewStudents();

                    break;

                case 7:

                    FileHandler.saveStudents(
                        manager.getStudents()
                    );

                    break;

                case 8:

                    FileHandler.saveStudents(
                        manager.getStudents()
                    );

                    System.out.println("Thank you for using the system!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
