package com.company;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private double salary;

    private List<Employee> employees = new ArrayList<>();   // manager as composite, having employees

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetail() {
        System.out.println("----------");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("----------");

        for(Employee emp: employees){
           emp.showEmployeeDetail();
        }
    }

    // employee management done here

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public Employee getChild(int i){
        return employees.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
