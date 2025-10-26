package com.demo.test;

import java.util.Scanner;
import com.demo.service.*;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        int choice;
        do {
            System.out.println("\n===== Employee Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Employees in Sorted Order");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();
                    service.addEmployee(id, name, role);
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    int remId = sc.nextInt();
                    service.removeEmployee(remId);
                    break;

                case 3:
                    service.showAllEmployees();
                    break;

                case 4:
                    service.showSortedEmployees();
                    break;

                case 5:
                    System.out.print("Enter Name to find: ");
                    String searchName = sc.nextLine();
                    service.findEmployee(searchName);
                    break;

                case 6:
                    service.saveEmployees();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }
}
