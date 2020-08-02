package com.kris.creational.prototype_pattern;

import java.util.List;

/**
 * Client to use prototype pattern
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        //Use the master(original) object clone method to create objects
        Employees newEmployees = (Employees) employees.clone();
        Employees newEmployees2 = (Employees) employees.clone();

        List<String> list = newEmployees.getEmployeeList();
        list.add("John");

        List<String> list2 = newEmployees2.getEmployeeList();
        list2.remove("David");

        System.out.println("Original employee list: " + employees.getEmployeeList());
        System.out.println("New employee list: " + list);
        System.out.println("New employee list2: " + list2);
    }
}
