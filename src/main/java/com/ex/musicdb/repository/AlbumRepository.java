package com.ex.musicdb.repository;

import com.ex.musicdb.model.entities.AlbumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AlbumRepository extends JpaRepository<AlbumEntity, Long> {

    @Query("SELECT SUM (c.copies)  FROM AlbumEntity c" )
    Integer findAllByCopies();

    @Query(value = "SELECT a FROM AlbumEntity a ORDER BY a.copies DESC")
    List<AlbumEntity> findAll();

    void deleteById(Long id);
}
