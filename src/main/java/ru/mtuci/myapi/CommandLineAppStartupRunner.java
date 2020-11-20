package ru.mtuci.myapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.myapi.dao.PictureRepository;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final PictureRepository pictureRepository;
    @Autowired
    public CommandLineAppStartupRunner(PictureRepository pictureRepository){
        this.pictureRepository = pictureRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(pictureRepository.findById(1L).get());
    }
}