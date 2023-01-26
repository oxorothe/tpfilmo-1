package fr.eni.film.filmo.bll;

import fr.eni.film.filmo.bo.FilmBo;

public interface FilmService {

    public FilmBo film(int choix) throws ErreurFilm;
}
