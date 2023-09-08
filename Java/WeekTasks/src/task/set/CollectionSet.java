package task.set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class CollectionSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Employee> employeeSet = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Employee " + i + ":");

            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Date of Birth (dob): ");
            String dob = scanner.nextLine();

            System.out.print("Date of Joining (doj): ");
            String doj = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            Employee employee = new Employee(empId, name, phone, address, dob, doj, email, gender, salary);
            employeeSet.add(employee);

            System.out.println("Employee details added successfully!\n");
        }

        // Displaying the employee details
        System.out.println("Employee Details:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}