package ru.mtuci.myapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.myapi.dao.PictureRepository;
import ru.mtuci.myapi.model.Picture;

import java.util.List;
@Service
public class PictureServiceImpl implements PictureService {

    private final PictureRepository pictureRepository;

    @Autowired
    public PictureServiceImpl(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }


    @Override
    public Picture get(Long id) {
        return pictureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Picture> getAll() {
        return pictureRepository.findAll();
    }

    @Override
    public Picture save(Picture picture) {
        return pictureRepository.save(picture);
    }



    @Override
    public void delete(Long id) {
        pictureRepository.delete(id);

    }
}
