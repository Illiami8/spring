package com.cherepovski.model;

import com.cherepovski.model.qualifier.MentorQualifaer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
@NoArgsConstructor
@Component
@MentorQualifaer
public class Mentor extends Person implements Employee{
    private int salary;

private List<String> certificates;

    public Mentor(int id, String name, int salary) {
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
