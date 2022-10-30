package com.example.Lab_308.models;

import com.example.Lab_308.enums.MemberStatus;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private MemberStatus memberStatus;
    private String renewalDate;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberStatus getStatus() {
        return memberStatus;
    }

    public void setStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    public String getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(String renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Member() {
    }

    public Member(String name, MemberStatus memberStatus, String renewalDate) {
        this.name = name;
        this.memberStatus = memberStatus;
        this.renewalDate = renewalDate;
    }
}
