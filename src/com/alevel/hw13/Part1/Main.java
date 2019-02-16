package com.alevel.hw13.Part1;

import com.alevel.hw13.enums.genderType;
import com.alevel.hw13.enums.majorType;
import com.alevel.hw13.enums.subjectType;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Person[] persons = {new Person("Gari", genderType.M.name(), random.nextInt(15) + 15),
                new Student("Julia", genderType.F.name(), random.nextInt(15) + 10, "UA3434CV", 4.5),
                new Teacher("Suzen", genderType.F.name(), random.nextInt(25) + 10, 1000, subjectType.CHEMISTRY.name()),
                new CollegStudent("Jime", genderType.M.name(), random.nextInt(10) + 5, "UA5645FD", 3.9, 3, majorType.ELECTRICAL.name())
        };
        System.out.println(Arrays.toString(persons));
    }

}
