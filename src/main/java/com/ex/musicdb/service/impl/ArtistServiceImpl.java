package com.ex.musicdb.service.impl;


import com.ex.musicdb.model.entities.ArtistEntity;
import com.ex.musicdb.model.entities.enums.BandsEnum;
import com.ex.musicdb.repository.AlbumRepository;
import com.ex.musicdb.repository.ArtistRepository;
import com.ex.musicdb.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;
    private final AlbumRepository albumRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository, AlbumRepository albumRepository) {
        this.artistRepository = artistRepository;
        this.albumRepository = albumRepository;
    }

    @Override
    public void initArtist() {
        if (artistRepository.count()==0){
            Arrays.stream(BandsEnum.values())
                    .forEach(bandsEnum -> {
                        ArtistEntity artist = new ArtistEntity();
                        artist.setName(bandsEnum.name());
                        artistRepository.save(artist);
                    });
        }
    }

    @Override
    public ArtistEntity findArtistByName(String name) {
        return artistRepository.findByName(name);
    }
}
