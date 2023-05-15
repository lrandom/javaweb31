import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();

        while (true) {
            employeeManagement.showMenu();
            int choose = 0;
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    employeeManagement.createEmployee();
                    break;

                case 2:
                    employeeManagement.showAllEmployee();
                    break;

                case 3:
                    employeeManagement.searchEmployee();
                    break;

                case 4:
                    employeeManagement.updateEmployee();
                    break;

                case 5:
                    employeeManagement.deleteEmployee();
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    return;
            }
        }
    }
}
