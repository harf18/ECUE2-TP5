package net.lecnam.ussi2a.tp5;

/**
 * Code écrit par l'ancien stagiaire.
 */
public class Livre {
    private final Auteur auteur;
    private String titre;
    private final String isbn;
    private final int nbExemplaires;
    private int nbDisponibles;

    public Livre(Auteur auteur, String titre, String isbn, int nbExemplaires) {
        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Le titre est obligatoire");

        } else if (auteur == null){
            throw new IllegalArgumentException("Veuillez rentrer un auteur valide");

        } else if (nbExemplaires < 1){
            throw new IllegalArgumentException("Le nombre d'exemplaire doit être supérieur ou égal à 1");

        } else if (isbn == null || isbn.isBlank()){
            throw new IllegalArgumentException("Veuillez renseigner l'isbn du livre");

        } else {
            this.titre = titre;
            this.nbExemplaires = nbExemplaires;
            this.auteur = auteur;
            this.isbn = isbn;
            this.nbDisponibles = nbExemplaires;
        }
    }

    // Méthode pour dire si le livre est disponible
    private boolean estDisponible() { return nbDisponibles > 0; }

    /*Méthode pour emprunter un livre*/
    public boolean emprunter() {
        if (estDisponible()) {
            nbDisponibles--;
            return true;
        } else {
            return false;
        }
    }

    /*Méthode pour rendre le livre*/
    public boolean rendre() {
        if (nbDisponibles < nbExemplaires ) {
            nbDisponibles++;
            return true;

        } else {
            return false;
        }
    }

    /*Méthode pour tester si deux livres ont le même isbn (normalement pas possible)*/
    public boolean aLeMemeIsbnQue(Livre autre) {
        if (this.isbn.equals(autre.getIsbn())) {
            return true;

        } else {
            return false;
        }
    }

    // --- GETTERS (pour tout le monde) ---
    public Auteur getAuteur() { return auteur; }
    public String getTitre() { return titre; }
    public String getIsbn() { return isbn; }
    public int getNbExemplaires() { return nbExemplaires; }
    public int getNbDisponibles() { return nbDisponibles; }

    // --- SETTER AUTORISÉ (uniquement pour le titre, avec règle de validation) ---
    public void setTitre(String nouveauTitre) {
        if (nouveauTitre == null || nouveauTitre.isBlank()) {
            throw new IllegalArgumentException("Le titre ne peut pas être vide");
        }
        this.titre = nouveauTitre;
    }

    public String toString() {
        return "[" + isbn + "] " + titre + " - " + auteur
                + " - " + nbDisponibles + "/" + nbExemplaires + " disponible(s)";
    }
}
