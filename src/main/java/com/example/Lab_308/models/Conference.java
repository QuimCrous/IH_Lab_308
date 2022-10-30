package com.example.Lab_308.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Conference extends Event {
    @ManyToMany(mappedBy = "conferenceList")
    private List<Speaker> speakers;

    public Conference() {
    }

    public Conference(String date, Integer duration, String location, String title, List<Guest> list, List<Speaker> speakers) {
        super(date, duration, location, title, list);
        this.speakers = speakers;
    }

    public Conference(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
