package com.alevel.hw13.Part1;

import com.alevel.hw13.Part1.Person;

public class Teacher extends Person {
    double salary;
    String subject;

    Teacher(String name, String gender, int age, double salary, String subject) {
        super(name, gender, age);
        this.salary = salary;
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }
    public String toString() {
        return "\nPerson { Name: " + name + "\t"
                + " Gender: " + gender + "\t"
                + " Age: " + age + "\t"
                + " Salary: " + salary + "\t"
                + " Subject: " + subject + " }";
    }
}
