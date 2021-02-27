package com.ex.musicdb.service;

import com.ex.musicdb.model.entities.AlbumEntity;
import com.ex.musicdb.model.service.AlbumServiceModel;
import com.ex.musicdb.view.AlbumViewModel;

import java.util.List;

public interface AlbumService {
    void add(AlbumServiceModel albumServiceModel);
    Integer getTotalCopies();
    List<AlbumViewModel> findAllAlbums();
    void deleteById(Long id);
}
