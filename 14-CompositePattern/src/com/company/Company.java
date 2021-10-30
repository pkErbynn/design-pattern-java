package com.company;

// requirement:
// An organizational application where a company has its employee organization hierarchy
// Under employees hierarchy  - general managers >> engineering managers >> then devs
// also, composite node and leaf performs common operation like displaying its details - name, position, id

public class Company {

    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "dev1", "Developer");
        Employee dev2 = new Developer(101, "dev2", "Dev/Ops");

        // engineering manager managing developers
        Manager engineeringManager = new Manager("engineering manager", 5000.00);
        engineeringManager.addEmployee(dev1);
        engineeringManager.addEmployee(dev2);

        // general manager managing a developer and a engineering manager
        Employee dev3 = new Developer(103, "dev3", "Dev/Ops");

        Manager generalManager = new Manager("general manager", 8000.00);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engineeringManager);     // adding composite
        generalManager.showEmployeeDetail();
    }
}
