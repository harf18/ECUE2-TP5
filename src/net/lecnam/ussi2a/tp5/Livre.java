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
    private static int nbLivresProd = 0;
    private String code;

    public Livre(Auteur auteur, String titre, String isbn, int nbExemplaires) {
        try {
            if (auteur == null || titre == null || titre.isBlank()) {
                throw new IllegalArgumentException("Le nom de l'auteur et du livre sont obligatoires");
            }
            if (isbn == null || isbn.isBlank() || !Isbn.estValide(isbn)) {
                throw new IllegalArgumentException("L'ISBN est obligatoire et doit respecter les normes");
            }
            if (nbExemplaires < 0) {
                throw new IllegalArgumentException("Le nombre d'exemplaires doit être supérieur à 0");
            }
            this.auteur = auteur;
            this.titre = titre;
            this.isbn = isbn;
            this.nbExemplaires = nbExemplaires;
            this.nbDisponibles = nbExemplaires;
            nbLivresProd++;
            this.code = String.format("LIV-%04d", nbLivresProd);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        return "[" + isbn + "] " + titre + " - " + auteur
                + " - " + nbDisponibles + "/" + nbExemplaires + " disponible(s)"
                + " - code : " + this.code;
    }

    public Auteur getAuteur() {
        return this.auteur;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public int getDispo() {
        return this.nbDisponibles;
    }

    public void setTitre(String titre) {
        try {
                if (titre == null || titre.isBlank()) {
                    throw new IllegalArgumentException("Le nom de l'auteur et du livre sont obligatoires");
                }
            this.titre = titre;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean estDisponible(){
        if (this.nbDisponibles > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean emprunter(){
        if (estDisponible()){
            this.nbDisponibles--;
            return true;
        } else {
            return false;
        }
    }

    public boolean rendre(){
        if (this.nbDisponibles < this.nbExemplaires){
            this.nbDisponibles++;
            return true;
        } else {
            return false;
        }
    }

    public boolean aLeMemeIsbnQue(Livre autre){
        return this.isbn.equals(autre.isbn);
    }

    public static int getNbLivresCrees(){
        return nbLivresProd;
    }

}
