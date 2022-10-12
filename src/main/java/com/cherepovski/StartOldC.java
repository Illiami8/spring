package com.cherepovski;

import com.cherepovski.model.Group;
import com.cherepovski.model.Student;
import com.cherepovski.model.Teacher;

import java.util.List;

public class StartOldC {
    public static void main(String[] args) {
        Student jong = new Student(1,"Jong", List.of(8,9,10));
        Student bob = new Student(2,"Bob",List.of(6,6,9));

        Teacher alex = new Teacher(1,"Alex",1000);

        Group java = new Group(1,"Java",alex,List.of(jong,bob));

        java.print();
    }
}
