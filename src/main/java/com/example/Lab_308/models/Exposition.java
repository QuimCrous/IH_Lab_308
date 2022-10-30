package com.example.Lab_308.models;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Exposition extends Event{

    public Exposition() {
    }

    public Exposition(String date, Integer duration, String location, String title, List<Guest> list) {
        super(date, duration, location, title, list);
    }
}
