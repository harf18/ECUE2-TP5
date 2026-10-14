# TP5 : Réponses

Nom / Prénom : Dujour Valentin

## Partie 1 : Enquête

| Étape | Ce qui est anormal | Ligne responsable | Classe qui aurait dû l'empêcher |
|-------|--------------------|-------------------|---------------------------------|
| 1     |Le nom reste toujours le même|ligne 11|Class Auteur|
| 2     |le nombre de livre disponible est négatif|ligne 11|Class Livre|
| 3     |un age négatif|ligne 37|Class Main|
| 4     |oublie de private afin d'éviter la modif|ligne 8 et 9|Class Livre|
| 5     |nbLivres pas private|ligne 8|Class Bibliotheque|
| 6     |100 trop élevé, max 99 car on part de 0|ligne 52|Class Main|

**1.1** : Quand on rajoute "static" devant un attribut, cela signifie que l'attribut est unique et sera le même pour tout le monde. Dès qu'on rajoute un nouvel auteur, tous les auteurs prennent le dernier nom.

**1.2** : Je réponderais qu'il ne sait pas ce qu'il fait et que c'est de sa faute.

## Partie 2

**2.1** : Non pas de setter, car dans la règle métier il est dit que les valeurs ne peuvent pas changer.

**2.2** : Pour être sur que la personne qui exécute respecte les règles, n'importe qui pourrait supprimer la règle au moment de la création de l'objet. Alors que là, on est obligé de respecter les règles.

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

