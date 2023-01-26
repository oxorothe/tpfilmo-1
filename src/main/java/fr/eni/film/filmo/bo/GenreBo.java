package fr.eni.film.filmo.bo;

public class GenreBo {

    private Long id;

    private String libelle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }



    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "GenreBo{" +
                "libelle='" + libelle + '\'' +
                '}';
    }
}
