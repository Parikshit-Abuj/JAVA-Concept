package com.app;

import com.app.external.Employee;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("999-99", "Amit", 30, "India");

        emp.accessProtected();
        emp.showDetails(); // inherited public method
    }
}
