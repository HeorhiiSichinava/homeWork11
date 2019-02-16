package com.alevel.hw13.Part1;

public class Student extends Person {
    String idName;
    double gpa;

    Student(String name, String gender, int age, String idName, double gpa) {
        super(name, gender, age);
        this.idName = idName;
        this.gpa = gpa;
    }

    @Override
    public String setName(String name) {
        return super.setName(name);
    }

    @Override
    public String toString() {
        return "\nPerson { Name: " + name + "\t"
                + " Gender: " + gender + "\t"
                + " Age: " + age + "\t"
                + " ID: " + idName + "\t"
                + " GPA: " + gpa + " }";
    }
}