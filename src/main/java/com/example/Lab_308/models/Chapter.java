package com.example.Lab_308.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String chapterName;
    private String district;
    @OneToOne
    private Member president;
    @OneToMany
    private List<Member> memberList;
}
