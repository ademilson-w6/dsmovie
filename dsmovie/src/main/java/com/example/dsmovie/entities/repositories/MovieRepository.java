package com.example.dsmovie.entities.repositories;


import com.example.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Long> {



}
