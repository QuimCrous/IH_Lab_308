package com.example.Lab_308.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long speakerId;
    private String speakerName;
    private Integer presentationDuration;

    @ManyToMany
    private List<Conference> conferenceList;

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public Integer getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Integer presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public List<Conference> getConferenceList() {
        return conferenceList;
    }

    public void setConferenceList(List<Conference> conferenceList) {
        this.conferenceList = conferenceList;
    }

    public Speaker() {
    }

    public Speaker(String speakerName, Integer presentationDuration, List<Conference> conferenceList) {
        this.speakerName = speakerName;
        this.presentationDuration = presentationDuration;
        this.conferenceList = conferenceList;
    }
}
