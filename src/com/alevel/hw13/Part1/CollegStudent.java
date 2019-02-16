package com.alevel.hw13.Part1;

public class CollegStudent extends Student {
    int year;
    String major;

    CollegStudent(String name, String gender, int age, String idName, double gpa, int year, String major) {
        super(name, gender, age, idName, gpa);
        this.year = year;
        this.major = major;
    }

    @Override
    public String toString() {
        return "\nPerson { Name: " + name + "\t"
                + " Gender: " + gender + "\t"
                + " Age: " + age + "}\t"
                + " ID: " + idName + "\t"
                + " GPA: " + gpa + "\t"
                + " Year: " + year + "\t"
                + " Major: " + major + " }";
    }
}
