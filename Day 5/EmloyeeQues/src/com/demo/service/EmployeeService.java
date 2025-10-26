package com.demo.service;

import com.demo.dao.*;
import com.demo.beans.*;
import java.util.ArrayList;

public class EmployeeService {
    private EmployeeDao dao = new EmployeeDao();

    public void addEmployee(int id, String name, String role) {
        Employee e = new Employee(id, name, role);
        dao.addEmployee(e);
    }

    public void removeEmployee(int id) {
        dao.removeEmployee(id);
    }

    public void showAllEmployees() {
        ArrayList<Employee> list = dao.getAllEmployees();
        if (list.isEmpty()) {
            System.out.println("No employees found!");
        } else {
            for (Employee e : list) {
                System.out.println(e);
            }
        }
    }

    public void showSortedEmployees() {
        ArrayList<Employee> sorted = dao.getSortedEmployees();
        for (Employee e : sorted) {
            System.out.println(e);
        }
    }

    public void findEmployee(String name) {
        dao.findByName(name);
    }

    public void saveEmployees() {
        dao.saveToFile();
    }
}
