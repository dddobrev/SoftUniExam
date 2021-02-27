package com.ex.musicdb.model.entities;


import javax.persistence.*;

@Entity
@Table(name = "artist")
public class ArtistEntity extends BaseEntity {

    private String name;
    private String career;


    public ArtistEntity() {
    }

    @Column(name = "name_singer_or_band")
    public String getName() {
        return name;
    }

    @Column(name = "career_information", columnDefinition = "TEXT")
    public String getCareer() {
        return career;
    }

    public ArtistEntity setName(String name) {
        this.name = name;
        return this;
    }

    public ArtistEntity setCareer(String career) {
        this.career = career;
        return this;
    }
}
