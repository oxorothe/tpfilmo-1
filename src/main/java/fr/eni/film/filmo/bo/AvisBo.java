package fr.eni.film.filmo.bo;

public class AvisBo {

    private Long id;
    private int note;

    private String commentaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "AvisBo{" +
                "note=" + note +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
