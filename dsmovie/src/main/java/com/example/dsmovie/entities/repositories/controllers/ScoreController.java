package com.example.dsmovie.entities.repositories.controllers;

import com.example.dsmovie.entities.dto.MovieDTO;
import com.example.dsmovie.entities.dto.ScoreDTO;
import com.example.dsmovie.entities.services.MovieService;
import com.example.dsmovie.entities.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {


    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }


}
