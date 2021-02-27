package com.ex.musicdb.view;

import com.ex.musicdb.model.entities.ArtistEntity;
import com.ex.musicdb.model.entities.enums.GenreEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumViewModel {
    private Long id;
    private String imageUrl;
    private String name;
    private ArtistEntity artistEntity;
    private GenreEnum genreEnum;
    private BigDecimal price;
    private LocalDate releasedDate;
    private Integer copies;

    public AlbumViewModel() {
    }

    public Long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public ArtistEntity getArtistEntity() {
        return artistEntity;
    }

    public GenreEnum getGenreEnum() {
        return genreEnum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    public Integer getCopies() {
        return copies;
    }

    public AlbumViewModel setId(Long id) {
        this.id = id;
        return this;
    }

    public AlbumViewModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public AlbumViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public AlbumViewModel setArtistEntity(ArtistEntity artistEntity) {
        this.artistEntity = artistEntity;
        return this;
    }

    public AlbumViewModel setGenreEnum(GenreEnum genreEnum) {
        this.genreEnum = genreEnum;
        return this;
    }

    public AlbumViewModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public AlbumViewModel setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
        return this;
    }

    public AlbumViewModel setCopies(Integer copies) {
        this.copies = copies;
        return this;
    }
}
