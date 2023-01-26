package fr.eni.film.filmo.bll;

public class ErreurFilm extends Exception{

    public ErreurFilm(){

    }

    public ErreurFilm(String message){
        super(message);
    }
}
