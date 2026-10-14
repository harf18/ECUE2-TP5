package net.lecnam.ussi2a.tp5;

/**
 * Code écrit par l'ancien stagiaire.
 */
public class Livre {

    private Auteur auteur;
    private String titre;
    private String isbn;
    private int nbExemplaires;
    private int nbDisponibles;

    public Livre(Auteur auteur, String titre, String isbn, int nbExemplaires) {

        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Le titre est obligatoire");
        }

        if (auteur == null) {
            throw new IllegalArgumentException("L'auteur est obligatoire");
        }

        if (nbExemplaires < 1) {
            throw new IllegalArgumentException(
                    "Le nombre d'exemplaires doit être supérieur ou égal à 1");
        }

        if (nbDisponibles < 0 || nbDisponibles > nbExemplaires) {
            throw new IllegalArgumentException("Le nombre d'exemplaires disponibles est invalide");
        }

        this.auteur = auteur;
        this.titre = titre;
        this.isbn = isbn;
        this.nbExemplaires = nbExemplaires;
        this.nbDisponibles = nbExemplaires;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }

    public int getNbDisponibles() {
        return nbDisponibles;
    }

    public void setTitre(String titre) {
        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Le titre ne peut pas être vide");
        }

        this.titre = titre;
    }

    public boolean estDisponible() {
        return nbDisponibles > 0;
    }

    public boolean emprunter() {
        if (nbDisponibles <= 0) {
            return false;
        }

        nbDisponibles--;
        return true;
    }

    public boolean rendre() {
        if (nbDisponibles == nbExemplaires) {
            return false;
        }

        nbExemplaires++;
        return true;
    }

    public boolean aLeMemeIsbnQue(Livre autre) {
        return isbn.equals(autre.isbn);
    }

    @Override
    public String toString() {
        return "[" + isbn + "] " + titre + " - " + auteur
                + " - " + nbDisponibles + "/" + nbExemplaires + " disponible(s)";
    }
}