package com.example.Lab_308.models;

import com.example.Lab_308.enums.GuestStatus;

import javax.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestId;
    private String name;
    private GuestStatus guestStatus;

    @ManyToOne
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Guest(String name, GuestStatus guestStatus, Event event) {
        this.name = name;
        this.guestStatus = guestStatus;
        this.event = event;
    }


    public Guest() {
    }


    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getGuestStatus() {
        return guestStatus;
    }

    public void setGuestStatus(GuestStatus guestStatus) {
        this.guestStatus = guestStatus;
    }
}
