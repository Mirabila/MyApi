package ru.mtuci.myapi.service;

import ru.mtuci.myapi.model.Picture;

import java.util.List;

public interface PictureService {

    Picture get(Long id);
    List<Picture> getAll();
    Picture save(Picture picture);
    void delete(Long id);


}
