package com.company; // java packages

import java.util.ArrayList; // java API

// encapsulation ama abstraction
abstract class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // Abstract Method
    abstract void work();
}

// inheritance
class Programmer extends Employee {

    public Programmer(String name, int salary) {
        super(name, salary); // super keyword
    }

    // polymorphism
    @Override
    void work() {
        System.out.println("Programmer is coding...");
    }

    // inner class
    class Laptop {
        void laptopInfo() {
            System.out.println("Programmer uses a laptop");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Programmer p1 = new Programmer("Andi", 8000);

        employees.add(p1);

        for (Employee e : employees) {
            System.out.println("Name: " + e.getName());
            System.out.println("Salary: " + e.getSalary());
            e.work();
        }

        // Inner Class
        Programmer.Laptop laptop = p1.new Laptop();
        laptop.laptopInfo();
    }
}
