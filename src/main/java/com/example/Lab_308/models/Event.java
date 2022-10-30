package com.example.Lab_308.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private Integer duration;
    private String location;
    private String title;
    @OneToMany(mappedBy = "event")
    private List<Guest> list;

    public Event(String date, Integer duration, String location, String title, List<Guest> list) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.list = list;
    }

    public Event() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Guest> getList() {
        return list;
    }

    public void setList(List<Guest> list) {
        this.list = list;
    }
}
