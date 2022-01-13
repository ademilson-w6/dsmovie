package com.example.dsmovie.repositories;

import com.example.dsmovie.entities.Score;
import com.example.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
