package com.demo.beans;

public class Employee {
    private int empID;
    private String empName;
    private String empRole;

    // No-arg constructor
    public Employee() {
        empID = 0;
        empName = "Null";
        empRole = "Null";
    }

    // Constructor with ID and Name
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Employee";
    }

    // Constructor with all fields
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // Getters and Setters
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    @Override
    public String toString() {
        return "ID: " + empID + ", Name: " + empName + ", Role: " + empRole;
    }
}
