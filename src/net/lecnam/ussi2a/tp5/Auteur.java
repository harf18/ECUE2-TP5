package net.lecnam.ussi2a.tp5;

import java.time.LocalDate;
import java.time.Period;

/**
 * Code écrit par l'ancien stagiaire.
 * Il "marche"... à peu près.
 */
public class Auteur {
    private final String nom;
    private final String prenom;
    private final LocalDate dateNaissance;

    /*Constructeur avec vérification*/
    public Auteur(String nom, String prenom, LocalDate dateNaissance) {
        if (nom == null || nom.isBlank() || prenom == null || prenom.isBlank()) {
            throw new IllegalArgumentException("Nom et prenom obligatoires !");

        } else {
            this.nom = nom;
            this.prenom = prenom;
        }

        if (dateNaissance.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("La date de naissance ne peut pas être dans le futur !");

        } else {
            this.dateNaissance = dateNaissance;
        }
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public LocalDate getDateNaissance() {
        return this.dateNaissance;
    }

    public int getAge() {
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }

    public String toString() {
        return prenom + " " + nom + " (" + getAge() + " ans)";
    }
}
