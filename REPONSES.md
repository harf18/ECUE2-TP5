# TP5 : Réponses

Nom / Prénom :

## Partie 1 : Enquête

| Étape | Ce qui est anormal                                                    | Ligne responsable | Classe qui aurait dû l'empêcher |
|-------|-----------------------------------------------------------------------|-------------------|---------------------------------|
| 1     |  Même nom pour tous                                                   | Ligne 11          |           Auteur                |
| 2     |  Nombre négatif d'emprunts                                            | Ligne 11          |           Livre                 |
| 3     |  L'auteur est né après aujourd'hui                                    | Ligne 18          |           Auteur                |
| 4     |  Disparition du titre                                                 | Ligne 8           |           Livre                 |
| 5     |  Blocage sur les livres affichés                                      | Ligne 17          |           Bibliothèque          |
| 6     |  Plantage du programme car surplus de livres                          | Ligne 8           |           Bibliothèque          |

**1.1** : Parce que l'attribut nom est static donc commun à tous les objets Auteur et il encapsule la dernière valeur qui lui a été affecté, donc ils s'appellent tous Verne à l'étape 1 car le dernier auteur est Jules Verne puis Dupont car l'auteur Dupont est créé

**1.2** : En général, le problème vient d'entre la chaise et le clavier, et là, le stagiaire n'a pas du tout été sérieux en rendant static "nom"

## Partie 2

**2.1** : Non car j'ai choisi de mettre toutes mes variables en final afin que l'utilisateur ne puisse pas faire des bêtises avec et car ça allourdirait le code

**2.2** : Car c'est une question de sécurité, si la classe est donnée à une autre personne, elle n'aura pas besoin de devoir vérifier ses variables au préalable

## Partie 3

**3.1** : On ne le met pas car on perdrait du sens et on pourrait créer des erreurs si jamais l'utilisateur met plus de disponibles que d'exemplaires par exemple. Il faudrait en plus mettre un setter et donc, allourdir le code

**3.2** : En créant une méthode estTitre(String titre) avec dedans la condition vérificatrice que tout fonctionne correctement pour le titre

## Partie 4

**4.1** : Toutes les étapes consistants à modifier directement les attributs des objets ne sont plus disponibles permettant une bonne sécurité lors de l'utilisation de ces derniers

**4.2** :
bib.getLivres()[99] = miserables;
bib.afficherLivres();

Avec ces instructions, le livre n'est pas affiché dans la bibliothèque en plus de créer un problème car il n'y a pas le bon nombre de livres

## Partie 5

**5.1** : On utilise static car on veut que toutes les bibliothèques aient le même nombre de livre au maximum, pas de final car l'utilisateur doit pouvoir s'en servir, et ça peut être public car on adapte le code suivant les envies choisies sur la capacité max (il faut juste vérifier qu'il ne s'agisse pas d'un nombre négatif ou nul) (il faudra adapter le code selon cette nouvelle variable comme le fait de voir si la bibliothèque est pleine)

**5.2** : Alors le nombre de livres produits resteraient constant car attaché à la variable objet plutôt qu'à l'ensemble d'objet Livre

**5.3** : "non-static method getTitre() cannot be referenced from a static context" car on fait appel à "this" dans getTitre() ce qui n'est pas compatible avec les static

**5.4** : Un attribut static est utile lorsqu'on veut quelque chose de plus global sur tous les mêmes objets (leur nombre par exemple) mais devient un bug si on essaie de l'implémenter à un attribut supposer unique comme le nom

**5.5** : On a mis estValide() en static car on a pas besoin du this contrairement à getAge() et parce que la class Isbn est là que pour ça. En autre méthode static dans le jdk, on a square de la classe Math.

## Partie 6

Nombre de livres créés affiché à l'étape 10, et explication : J'ai obtenu 5 livres car au lieu d'en créer 4, j'en ai fait 5, et car mon programme ne prend pas en compte les livres qui ont un problème sur l'auteur ou sur l'isbn par exemple

## Bonus B2 : code dupliqué

