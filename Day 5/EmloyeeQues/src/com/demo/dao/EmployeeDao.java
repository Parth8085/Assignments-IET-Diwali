package com.demo.dao;

import java.io.FileWriter;
import java.util.*;
import com.demo.beans.*;

public class EmployeeDao {
    private ArrayList<Employee> empList = new ArrayList<>();

    public void addEmployee(Employee e) {
        empList.add(e);
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee(int empID) {
        boolean found = false;
        for (Employee e : empList) {
            if (e.getEmpID() == empID) {
                empList.remove(e);
                System.out.println("Employee removed!");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Employee not found!");
    }

    public ArrayList<Employee> getAllEmployees() {
        return empList;
    }

    public ArrayList<Employee> getSortedEmployees() {
        ArrayList<Employee> sorted = new ArrayList<>(empList);
        Collections.sort(sorted, new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                return a.getEmpID() - b.getEmpID();
            }
        });
        return sorted;
    }

    public void findByName(String name) {
        boolean found = false;
        for (Employee e : empList) {
            if (e.getEmpName().equalsIgnoreCase(name)) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found)
            System.out.println("Employee not found!");
    }

    public void saveToFile() {
        try {
            FileWriter fw = new FileWriter("employees.txt");
            for (Employee e : empList) {
                fw.write(e.toString() + "\n");
            }
            fw.close();
            System.out.println("All employees saved to file successfully!");
        } catch (Exception ex) {
            System.out.println("Error saving file: " + ex);
        }
    }
}
