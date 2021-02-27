package com.ex.musicdb.model.service;

import com.ex.musicdb.model.entities.ArtistEntity;
import com.ex.musicdb.model.entities.UserEntity;
import com.ex.musicdb.model.entities.enums.GenreEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumServiceModel {
    private String id;
    private String name;
    private String imageUrl;
    private String description;
    private Integer copies;
    private BigDecimal price;
    private LocalDate releasedDate;
    private String producer;
    private GenreEnum genreEnum;
    private ArtistEntity artist;
    private UserEntity addedFrom;

    public AlbumServiceModel() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCopies() {
        return copies;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    public String getProducer() {
        return producer;
    }

    public GenreEnum getGenreEnum() {
        return genreEnum;
    }

    public ArtistEntity getArtist() {
        return artist;
    }

    public UserEntity getAddedFrom() {
        return addedFrom;
    }

    public AlbumServiceModel setId(String id) {
        this.id = id;
        return this;
    }

    public AlbumServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public AlbumServiceModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public AlbumServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public AlbumServiceModel setCopies(Integer copies) {
        this.copies = copies;
        return this;
    }

    public AlbumServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public AlbumServiceModel setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
        return this;
    }

    public AlbumServiceModel setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public AlbumServiceModel setGenreEnum(GenreEnum genreEnum) {
        this.genreEnum = genreEnum;
        return this;
    }

    public AlbumServiceModel setArtist(ArtistEntity artist) {
        this.artist = artist;
        return this;
    }

    public AlbumServiceModel setAddedFrom(UserEntity addedFrom) {
        this.addedFrom = addedFrom;
        return this;
    }
}
