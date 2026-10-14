# TP5 : Réponses

Nom / Prénom : Nouchet Zackarie

## Partie 1 : Enquête

| Étape | Ce qui est anormal                            | Ligne responsable | Classe qui aurait dû l'empêcher                              |
|-------|-----------------------------------------------|-------------------|--------------------------------------------------------------|
| 1     | Verne à tous les noms                         |public static String nom| Ne pas mettre static                                         |
| 2     | -2/1 livres disponibles                       |this.nbDisponibles = nbExemplaires| Mettre nbDisponibles dans les arguments de la fonction Livre |
| 3     | Jean Dupont a -87 ans                         |Auteur inconnu = new Auteur("Dupont", "Jean", LocalDate.of(2090, 1, 1))| Rentrer une ddn valide                                       |
| 4     | Jules Dupont                                  |public static String nom| Static lors de l'initialisation de la variable               |
| 5     | 1 seul livre dans la bibliothèque             |bib.nbLivres = 1| Enlever cette ligne                                          |
| 6     | Le stagiaire crée 100 livres avec le même nom|bib.nbLivres = 100| Mettre plus de livres dans la BDD|

**1.1** :
Tous les auteurs s'appelent Verne dans l'étape 1 car nom est une classe static donc elle ne garde que le dernier nom enregistré. Dupont est le nom enregistré à l'étape 3 donc il est gardé pour l'étape 4. <br> <br>
**1.2** :
Il faut mieux coder ses classes
## Partie 2

**2.1** :
Je n'ai pas ajouté de setters car les setters servent à modifier des getters déjà crées, Or dans l'exercice il était demandé de créer des accesseurs, donc des getters. <br> br>
**2.2** :

## Partie 3

**3.1** :
Il n'y a pas de setter setNbDisponibles car le nombre de livre disponible doit être calculé et non indiqué. Si l'on fait ça, ça reviendrait à perdre toute l'automatisation.
**3.2** :
Le plus simple serait de créer une fonction qui contient la vérification du titre, puis l'appeler dans setTitre().
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

