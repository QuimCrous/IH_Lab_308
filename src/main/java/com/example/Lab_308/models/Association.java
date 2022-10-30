package com.example.Lab_308.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Chapter> chapterList;

    public Association() {
    }

    public Association(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(Chapter chapter) {
        this.chapterList.add(chapter);
    }
}
