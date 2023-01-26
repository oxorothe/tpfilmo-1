package fr.eni.film.filmo.controller;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.FilmBo;
import org.springframework.beans.factory.annotation.Autowired;

public class FilmController {

    private FilmBo film() {return new FilmBo();}

    @Autowired
    private FilmService service;

    public FilmController(FilmService service){this.service = service;}

    
}
