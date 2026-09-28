# TP5 : Réponses

Nom / Prénom : Andreoli Andrea

## Partie 1 : Enquête

| Étape | Ce qui est anormal | Ligne responsable | Classe qui aurait dû l'empêcher |
|-------|--------------------|-------------------|---------------------------------|
| 1     |Les Misérables et Germinal ont pour auteur Victor Verne et Émile Verne au lieu de Victor Hugo et Émile Zola.                    |Auteur.java — private static String nom; (l'attribut nom est déclaré static                   |Auteur. L'attribut étant partagé par toutes les instances de la classe, le dernier nom instancié (Verne) écrase le nom de tous les auteurs créés précédemment.                                 |
| 2     |Le nombre de exemplaires disponibles passe à -2/1 disponible(s)                    |Livre.java — Méthode emprunter() qui décrémente le stock sans vérifier si des exemplaires sont encore disponibles (nbDisponibles--).                   |Livre. La classe aurait dû contrôler ses invariants d'état et refuser/empêcher un emprunt si nbDisponibles <= 0.                                 |
| 3     |L'auteur Jean Dupont a un âge de -63 ans.                    |Auteur.java — Constructeur ou setter d'année de naissance sans validation par rapport à l'année courante ou sans contrôle sur la cohérence de la valeur reçue.                   |Auteur. La classe doit valider ses données à l'instanciation/modification (une année de naissance dans le futur ou un âge négatif doit lever une exception/être refusé).                                 |
| 4     |Tous les auteurs prennent le nom Dupont (alors que seuls l'objet ou le nom de l'étape 3/4 était censé être modifié).Le livre contient des données invalides : ISBN de 3 chiffres [123] et un titre à null.                    |Auteur.java — nom statique (répercussion de la modification sur tous les auteurs). Livre.java — Absences de validation sur l'ISBN (format 13 chiffres non vérifié) et sur le titre non null / non vide dans les constructeurs/setters.                   |Auteur (pour l'effet de bord du nom statique) et Livre (pour l'absence d'encapsulation et de validation des données).                                 |
| 5     |Suppression ou réorganisation directe du tableau interne modifiant le compteur ou causant des pertes/incohérences lors de l'affichage du nombre de livres.                    |Bibliotheque.java — Manipulation directe du tableau interne ou absence d'encapsulation sur la collection de livres (compteur nbLivres non synchronisé avec le tableau lors des suppressions).                   |Bibliotheque. Elle doit gérer proprement ses structures de données internes sans exposer son tableau ni autoriser des manipulations incohérentes.                                 |
| 6     |Le programme plante violemment avec une exception : java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 100                    |Bibliotheque.java:11 dans ajouterLivre().                   |Bibliotheque. La méthode ajouterLivre insère dans un tableau de taille fixe 100 sans vérifier si la limite max est atteinte avant d'accéder à l'indice 100.                                 |

**1.1** : L'attribut nom de la classe Auteur a été déclaré avec le mot-clé static.

Un attribut statique est une variable de classe, partagée par toutes les instances de cette classe. Il n'existe qu'un seul emplacement mémoire pour nom. Ainsi :

À l'étape 1, lorsque Jules Verne est instancié en dernier, la valeur "Verne" vient écraser la valeur de nom pour toutes les instances d'auteurs déjà créées (Victor Hugo et Émile Zola).

À l'étape 4, dès que le nom d'un auteur est remplacé par "Dupont", l'ensemble des objets Auteur existants voient immédiatement leur nom changer en "Dupont".

**1.2** : Le stagiaire a tort. C'est une violation fondamentale du principe d'encapsulation en Programmation Orientée Objet (POO).

Une classe bien conçue doit être défensive et garantir la cohérence de son propre état interne, peu importe ce que tente de faire le code client (main) :

Validation des invariants : C'est à la classe Livre de refuser un emprunt si nbDisponibles == 0, et à Auteur de rejeter une année de naissance incohérente.

Gestion des limites : C'est à Bibliotheque d'empêcher le débordement de son tableau (en levant une exception métier ou en agrandissant le tableau dynamiquement).

Portée des variables : L'utilisation de static sur un attribut d'instance est une erreur de conception majeure.

## Partie 2

**2.1** :

**2.2** :

## Partie 3

**3.1** :

**3.2** :

## Partie 4

**4.1** :

**4.2** :

## Partie 5

**5.1** :

**5.2** :

**5.3** :

**5.4** :

**5.5** :

## Partie 6

Nombre de livres créés affiché à l'étape 10, et explication :

## Bonus B2 : code dupliqué

