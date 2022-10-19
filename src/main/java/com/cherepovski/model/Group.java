package com.cherepovski.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group implements Printing {
    private int id;
    private String name;

    private Teacher teacher;
    private List<Student> students;

    public Group(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Autowired
    @Qualifier("alex")
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
//public Group(int id, String name,Teacher teacher){
    //    this.id = id;
   //     this.name = name;
     //   this.teacher = teacher;
   // }
}
