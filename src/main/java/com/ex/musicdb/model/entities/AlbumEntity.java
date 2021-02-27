package com.ex.musicdb.model.entities;

import com.ex.musicdb.model.entities.enums.GenreEnum;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "albums")
public class AlbumEntity extends BaseEntity{
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

    public AlbumEntity() {
    }

    @Column(name = "name", nullable = false, unique = true)
    public String getName() {
        return name;
    }

    @Column(name = "image_url", nullable = false)
    public String getImageUrl() {
        return imageUrl;
    }

    @Column(name = "description", columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    @Column(name = "copies", nullable = false)
    public Integer getCopies() {
        return copies;
    }

    @Column(name = "price", nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "released_date", nullable = false)
    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    @Column(name = "producer")
    public String getProducer() {
        return producer;
    }

    @Enumerated(EnumType.STRING)
    public GenreEnum getGenreEnum() {
        return genreEnum;
    }

    @ManyToOne
    public ArtistEntity getArtist() {
        return artist;
    }

    @ManyToOne
    public UserEntity getUser() {
        return addedFrom;
    }


    public AlbumEntity setName(String name) {
        this.name = name;
        return this;
    }

    public AlbumEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public AlbumEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public AlbumEntity setCopies(Integer copies) {
        this.copies = copies;
        return this;
    }

    public AlbumEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public AlbumEntity setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
        return this;
    }

    public AlbumEntity setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public AlbumEntity setGenreEnum(GenreEnum genreEnum) {
        this.genreEnum = genreEnum;
        return this;
    }

    public AlbumEntity setArtist(ArtistEntity artist) {
        this.artist = artist;
        return this;
    }

    public AlbumEntity setUser(UserEntity user) {
        this.addedFrom = user;
        return this;
    }
}
