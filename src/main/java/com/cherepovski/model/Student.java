package com.cherepovski.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Getter
@NoArgsConstructor
@Component
public class Student extends Person {
   private Map<String,Integer> marks;

   // private Map<String,Integer> marks;

    public Student(int id,String name){
        super(id,name);
    }
public void setMarks(Map<String,Integer> marks){
        this.marks = marks;
}
    public Student(int id, String name, Map<String,Integer> marks) {
        super(id, name);
        this.marks = marks;
    }
    public void initCreate(){
        System.out.println("Student has been created");
    }
public void destroyStudent(){
    System.out.println("Student has been created");
}

}
