package fr.eni.film.filmo.bll;

import fr.eni.film.filmo.bo.MembreBo;

public interface MembreService {
    public MembreBo membre(int connexion) throws ErreurMembre;

}
