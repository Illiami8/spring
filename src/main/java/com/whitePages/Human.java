package com.whitePages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Human {
    @Value("1")
    private int id;
    @Value("Alex")
    private String name;



    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addres=" + addres +
                '}';
    }
    @Autowired
    private Adress addres;

    public Human(int id, String name, Adress addres) {
        this.id = id;
        this.name = name;
        this.addres = addres;
    }

    public Human() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddres(Adress addres) {
        this.addres = addres;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Adress getAddres() {
        return addres;
    }
}
