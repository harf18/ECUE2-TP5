package net.lecnam.ussi2a.tp5;

import java.time.LocalDate;
import java.time.Period;

/**
 * Code écrit par l'ancien stagiaire.
 * Il "marche"... à peu près.
 */
public class Auteur {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    // final car inchangeable dans les classes et normalement ça devrait rester pareil tout du long

    public Auteur(String nom, String prenom, LocalDate dateNaissance) {
        try {
            if (nom == null || nom.isBlank()) {
                throw new IllegalArgumentException("Le nom est obligatoire");
            }

            if (prenom == null || prenom.isBlank()) {
                throw new IllegalArgumentException("Le prénom est obligatoire");
            }
            if (dateNaissance == null || Period.between(dateNaissance, LocalDate.now()).getYears() < 0) {
                throw new IllegalArgumentException("La date de naissance doit être antérieure");
            }
            this.nom = nom;
            this.prenom = prenom;
            this.dateNaissance = dateNaissance;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public String toString() {
        return prenom + " " + nom + " (" + this.getAge() + " ans)";
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getAge() {
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }

}
