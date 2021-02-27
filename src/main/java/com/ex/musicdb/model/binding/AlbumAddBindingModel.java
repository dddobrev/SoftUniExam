package com.ex.musicdb.model.binding;

import com.ex.musicdb.model.entities.ArtistEntity;
import com.ex.musicdb.model.entities.enums.GenreEnum;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumAddBindingModel {

    private String name;
    private String imageUrl;
    private String description;
    private Integer copies;
    private BigDecimal price;
    private LocalDate releasedDate;
    private String producer;
    private GenreEnum genreEnum;
    private ArtistEntity artist;

    public AlbumAddBindingModel() {
    }

    @NotBlank(message = "Cannot be empty")
    @Size(min=3, max = 20, message = "Name must be between 3 and 20 characters")
    public String getName() {
        return name;
    }

    @NotBlank(message = "Cannot be empty")
    @Size(min=5, message = "Url must be more then 5 characters")
    public String getImageUrl() {
        return imageUrl;
    }

    @NotBlank(message = "Cannot be empty")
    @Size(min=5, message = "Description must be more then 5 characters")
    public String getDescription() {
        return description;
    }

    @NotNull(message = "Copies cannot be empty")
    @Min(value = 10, message = "Copies must be more then 10 copies")
    public Integer getCopies() {
        return copies;
    }

    @NotNull(message = "Price cannot be empty")
    @DecimalMin(value = "0", message = "Price must be positive")
    public BigDecimal getPrice() {
        return price;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "The date cannot be in the future")
    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    public String getProducer() {
        return producer;
    }

    @NotNull(message = "You must select the genre")
    public GenreEnum getGenreEnum() {
        return genreEnum;
    }

    @NotNull(message = "You must select the artist")
    public ArtistEntity getArtist() {
        return artist;
    }


    public AlbumAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public AlbumAddBindingModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public AlbumAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public AlbumAddBindingModel setCopies(Integer copies) {
        this.copies = copies;
        return this;
    }

    public AlbumAddBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public AlbumAddBindingModel setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
        return this;
    }

    public AlbumAddBindingModel setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public AlbumAddBindingModel setGenreEnum(GenreEnum genreEnum) {
        this.genreEnum = genreEnum;
        return this;
    }

    public AlbumAddBindingModel setArtist(ArtistEntity artist) {
        this.artist = artist;
        return this;
    }

}
