package com.ex.musicdb.service;

import com.ex.musicdb.model.entities.ArtistEntity;

public interface ArtistService {
    void initArtist();
    ArtistEntity findArtistByName(String name);

}
