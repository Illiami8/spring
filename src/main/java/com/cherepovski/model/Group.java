package com.cherepovski.model;

import com.cherepovski.model.qualifier.AlexQualifier;
import com.cherepovski.model.qualifier.AntonQualifier;
import com.cherepovski.model.qualifier.MentorQualifaer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("java")
public class Group implements Printing {
    @Value("555")
    private int id;
    @Value("JavaEE")
    private String name;

@Value("#{teacher}")
    private Employee  employee;
    private List<Student> students;

    public Group(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Group(int id, String name,List<Student> students){
        this.id = id;
        this.name = name;
        this.students = students;
    }

   // @Autowired
  //  @MentorQualifaer
   // @AntonQualifier
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
//public Group(int id, String name,Teacher teacher){
    //    this.id = id;
   //     this.name = name;
     //   this.teacher = teacher;
   // }
}
