package com.cherepovski.model;

import lombok.*;

import java.util.List;
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {

    private List<Integer> marks;


    public Student(int id, String name, List<Integer> marks) {
        super(id, name);
        this.marks = marks;
    }
}
