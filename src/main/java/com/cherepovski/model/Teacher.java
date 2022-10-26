package com.cherepovski.model;

import com.cherepovski.model.qualifier.TeacherQualifaer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@TeacherQualifaer
@Component
public class Teacher extends Person implements Employee{
    @Value("1000")
    private int salary;

private List<String> certificates;

    public Teacher(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }
    public void init(){
        System.out.println(Thread.currentThread().getName()+"Teacher hav been created");
    }
    public void destroy(){
        System.out.println(Thread.currentThread().getName()+"Student has been created");
    }
}
