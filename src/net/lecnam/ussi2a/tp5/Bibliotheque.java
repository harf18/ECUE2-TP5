package net.lecnam.ussi2a.tp5;

/**
 * Code écrit par l'ancien stagiaire.
 */
public class Bibliotheque {
    public static int CAPACITE_MAX = 100;
    private Livre[] livres = new Livre[CAPACITE_MAX];
    private int nbLivres = 0;

    public boolean ajouterLivre(Livre livre) {
        if (livre == null || estPleine() || rechercherLivre(livre.getIsbn()) != null){
            return false;
        }
        this.livres[nbLivres] = livre;
        this.nbLivres++;
        return true;
    }

    public void afficherLivres() {
        System.out.println("--- " + nbLivres + " livre(s) dans la bibliothèque ---");
        for (int i = 0; i < nbLivres; i++) {
            System.out.println(livres[i]);
        }
    }

    public int getNbLivres(){
        return this.nbLivres;
    }

    public boolean estPleine(){
        return this.nbLivres >= 99;
    }

    public Livre rechercherLivre(String isbn) {
        for (int i = 0; i < nbLivres; i++){
            if (isbn.equals(this.livres[i].getIsbn())){
                return this.livres[i];
            }
        }
        return null;
    }

    public boolean emprunter(String isbn){
        for (int i = 0; i < nbLivres; i++){
            if (isbn.equals(this.livres[i].getIsbn())){
                this.livres[i].emprunter();
                return true;
            }
        }
        return false;
    }

    public boolean rendre(String isbn){
        for (int i = 0; i < nbLivres; i++){
            if (isbn.equals(this.livres[i].getIsbn())){
                this.livres[i].rendre();
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "Bibliothèque : "+ this.nbLivres + "/100 livres";
    }

}
