import dals.EmployeeDal;
import models.Employee;

import java.util.Scanner;

public class EmployeeManagement {
    public void showMenu() {
        System.out.println("Employee Management System");
        System.out.println("----------------------------");
        System.out.println("Please select");
        System.out.println("1. Add employee");
        System.out.println("2. Show All employee");
        System.out.println("3. Find employee");
        System.out.println("4. Update employee");
        System.out.println("5. Delete employee");
        System.out.println("6. Exit");
    }
    public void createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter salary: ");
        float salary = scanner.nextFloat();
        EmployeeDal employeeDal = new EmployeeDal();
        employeeDal.addEmployee(id, name, age, salary);
    }

    public void showAllEmployee() {
        EmployeeDal employeeDal = new EmployeeDal();
        for (Employee employee : employeeDal.getEmployees()) {
            System.out.println(employee.getId() + " - " + employee.getName() + " - " + employee.getAge() + " - " + employee.getSalary());
        }
    }

    public void updateEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter salary: ");
        float salary = scanner.nextFloat();
        EmployeeDal employeeDal = new EmployeeDal();
        employeeDal.updateEmployee(id, name, age, salary);
        System.out.println("Update success!");
    }

    public void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        EmployeeDal employeeDal = new EmployeeDal();
        employeeDal.deleteEmployee(id);
        System.out.println("Delete success!");
    }

    public void searchEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        EmployeeDal employeeDal = new EmployeeDal();
        Employee employee = employeeDal.getEmployeeById(id);
        if (employee != null) {
            System.out.println(employee.getId() + " - " + employee.getName() + " - " + employee.getAge() + " - " + employee.getSalary());
        } else {
            System.out.println("Not found!");
        }
    }
}
