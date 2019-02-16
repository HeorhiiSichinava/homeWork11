package com.alevel.hw13.Part1;

public class Person {
    public String name;
    public int age;
    public String gender;


    public Person(String name, String gender, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        // this.organs = organs;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    @Override
    public String toString() {
        return "\nPerson { Name: " + name + "\t"
                + " Gender: " + gender + "\t"
                + " Age: " + age + " }";
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String setGender(String gender) {
        return this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
