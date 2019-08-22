package com.piyush.models;


public class Employee implements Comparable<Employee> {
    String name;
    int rollNumber;

    public Employee(String name, Integer rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }


    public Integer getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "Name=" + name + ", Age=" + rollNumber + '}';
    }


    public int compareTo(Employee o) {
        return this.rollNumber-o.rollNumber;
    }
}
