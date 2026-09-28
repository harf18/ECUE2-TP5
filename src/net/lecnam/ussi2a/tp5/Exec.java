package net.lecnam.ussi2a.tp5;

import java.time.LocalDate;

public class Exec {

    public static void main(String[] args) {
        // Partie 6 : c'est à vous d'écrire le programme ici.
        // Aucun code n'est fourni : suivez le scénario décrit dans le README.

        //1
        System.out.println();
        System.out.println("Etape 1");
        System.out.println(Bibliotheque.CAPACITE_MAX);

        //2
        System.out.println();
        System.out.println("Etape 2");
        Auteur descraques = new Auteur("Descraques", "François", LocalDate.of(1985, 2, 10));
        Auteur danielewski = new Auteur("Danielewski", "Mark", LocalDate.of(1966, 3, 5));
        Auteur magikarp = new Auteur("Magikarp", "Ozi", LocalDate.of(1996, 2, 27));

        //3
        System.out.println();
        System.out.println("Etape 3");
        Livre visiteur = new Livre(descraques, "Le Visiteur du Futur", "9782070409228", 2);
        Livre droite = new Livre(descraques, "3ème Droite", "9782253004226", 4);
        Livre trempette = new Livre(magikarp, "Le temps des trempettes", "9782253012696", 1);
        Livre poissonnier = new Livre(magikarp, "Journal d'un poissonnier", "8792253012696", 1);
        Livre maison = new Livre(danielewski, "La maison des feuilles", "9782253019626", 3);

        //4
        System.out.println();
        System.out.println("Etape 4");
        Bibliotheque bib = new Bibliotheque();
        bib.ajouterLivre(visiteur);
        bib.ajouterLivre(droite);
        bib.ajouterLivre(trempette);
        bib.ajouterLivre(poissonnier);
        bib.ajouterLivre(maison);

        //5
        System.out.println();
        System.out.println("Etape 5");
        bib.afficherLivres();

        //6
        System.out.println();
        System.out.println("Etape 6");
        Auteur erreur = new Auteur("", "François", LocalDate.of(1985, 2, 10));
        Livre error = new Livre(danielewski, "La maison des feuilles", "9782253019625", 3);

        //7
        System.out.println();
        System.out.println("Etape 7");
        System.out.println(poissonnier.emprunter());
        System.out.println(poissonnier.emprunter());
        System.out.println(poissonnier.rendre());
        System.out.println(poissonnier.rendre());

        //8
        System.out.println();
        System.out.println("Etape 8");
        System.out.println(bib.emprunter("123"));

        //9
        System.out.println();
        System.out.println("Etape 9");
        System.out.println(bib.rechercherLivre("9782070409228"));

        //10
        System.out.println();
        System.out.println("Etape 10");
        System.out.println(Livre.getNbLivresCrees());

    }

}
