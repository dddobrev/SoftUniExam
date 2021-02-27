package com.ex.musicdb.repository;

import com.ex.musicdb.model.entities.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<ArtistEntity, Long> {
    ArtistEntity findByName(String name);
}
