package fr.eni.film.filmo.bll;

public class ErreurMembre extends Exception{
    public ErreurMembre(){

    }

    public ErreurMembre(String message){
        super(message);
    }

}
