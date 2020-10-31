package ru.mtuci.myapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.myapi.model.Picture;
import ru.mtuci.myapi.service.PictureService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = PictureController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class PictureController {


    public static final String REST_URL = "/api/v1/pictures";

    private final PictureService pictureService;

    @Autowired
    public PictureController(PictureService pictureService){
        this.pictureService = pictureService;
    }

    @GetMapping(value = "/{id}")
    public Picture get(@PathVariable("id") Long id){
        log.info("get " + id);
        return pictureService.get(id);
    }

    @GetMapping
    public List<Picture> getAll(){
        log.info("getAll");
        return pictureService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Picture save(@RequestBody Picture picture){
        log.info("save " + picture);
        return pictureService.save(picture);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id){
        log.info("delete " + id);
        pictureService.delete(id);
    }
}
