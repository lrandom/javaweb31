package dals;

import models.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmployeeDal {
    public static final String DB_PATH = "db_employee.dat";
    ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeDal() {
        //đọc data
        _readDataFromDB();
    }

    public void addEmployee(int id, String name, Integer age, Float salary) {
        Employee employee = new Employee(id, name, age, salary);
        employees.add(employee);
        _saveDataToDB();
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void updateEmployee(int id, String name, Integer age, Float salary) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employee.setName(name);
            employee.setAge(age);
            employee.setSalary(salary);
        }
        _saveDataToDB();
    }


    public void deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employees.remove(employee);
        }
        _saveDataToDB();

    }

    private void _saveDataToDB() {
        try {
            FileOutputStream fos = new FileOutputStream(DB_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(employees);
            fos.close();
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("Cannot write data");
        }
    }

    private void _readDataFromDB() {
        try {
            FileInputStream fis = new FileInputStream(DB_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            this.employees = (ArrayList<Employee>) objectInputStream.readObject();
            fis.close();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("Cannot read data");
        }
    }
}
