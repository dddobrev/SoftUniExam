package com.ex.musicdb.service.impl;

import com.ex.musicdb.model.entities.AlbumEntity;
import com.ex.musicdb.model.entities.ArtistEntity;
import com.ex.musicdb.model.entities.UserEntity;
import com.ex.musicdb.model.service.AlbumServiceModel;
import com.ex.musicdb.repository.AlbumRepository;
import com.ex.musicdb.repository.ArtistRepository;
import com.ex.musicdb.repository.UserRepository;
import com.ex.musicdb.service.AlbumService;
import com.ex.musicdb.view.AlbumViewModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AlbumServiceImpl implements AlbumService {

    private final ModelMapper modelMapper;
    private final HttpSession httpSession;
    private final AlbumRepository albumRepository;
    private final UserRepository userRepository;
    private final ArtistRepository artistRepository;

    public AlbumServiceImpl(ModelMapper modelMapper,
                            HttpSession httpSession,
                            AlbumRepository albumRepository,
                            UserRepository userRepository,
                            ArtistRepository artistRepository) {
        this.modelMapper = modelMapper;
        this.httpSession = httpSession;
        this.albumRepository = albumRepository;
        this.userRepository = userRepository;
        this.artistRepository = artistRepository;
    }


    @Override
    public void add(AlbumServiceModel albumServiceModel) {
        AlbumEntity album =this.modelMapper.map(albumServiceModel, AlbumEntity.class);
        String id = httpSession.getAttribute("id").toString();
        Optional<UserEntity> userEntity = userRepository.findById(Long.parseLong(id));
        album.setUser(userEntity.orElse(null));

        ArtistEntity artist;
        artist = artistRepository
                .findByName(albumServiceModel.getArtist().getName());
        album.setArtist(artist);
        System.out.println();

        albumRepository.save(album);

    }

    @Override
    public Integer getTotalCopies() {
        return albumRepository.findAllByCopies();
    }

    @Override
    public List<AlbumViewModel> findAllAlbums() {
        return albumRepository.findAll()
                .stream()
                .map(album-> modelMapper.map(album, AlbumViewModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        albumRepository.deleteById(id);
    }

}
