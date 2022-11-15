package com.whitePages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Adress {
    @Value("Minsk")
    private String city;
    @Value("Serova")
    private String street;
    @Value("15")
    private String home;
    @Value("1")
    private String room;

    public Adress(String city, String street, String home, String room) {

        this.city = city;

        this.street = street;

        this.home = home;

        this.room = room;
    }

    public Adress() {
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", home='" + home + '\'' +
                ", room='" + room + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHome() {
        return home;
    }

    public String getRoom() {
        return room;
    }
}
