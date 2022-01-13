package com.example.dsmovie.entities;


import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "tb_score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ScorePK id = new ScorePK();
    private Double value;

    public Score() {

    }

    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setMovie(Movie movie) {
       id.setMovie(movie);
    }

    public void setUser(User user) {
       id.setUser(user);
    }
}
