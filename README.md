# B2-Java-Algo

Java – Collections et algorithmes

Question 1.2– Après compilation et exécution du programme, expliquer le résultat obtenu lors de l'évaluation de l'expression jr1 == jr2. 
On peut voir que les valeurs de jr1 et jr2 sont identiques et qu’après la compilation, il est retourné que les deux joueurs sont différents. Ainsi, il est donc possible d’avoir deux mêmes joueurs avec les mêmes valeurs dès lors qu’ils sont distincts par leur numéro de joueur.


Question 1.3– Après compilation et exécution du programme, expliquer le résultat obtenu lors de l'évaluation de l'expression jr1.equals( jr2 ). 
La méthode (boolean)« equals »  permet de comparer jr1 et jr2, ainsi, si jr1 et jr2 sont deux objets distincts (même si leurs valeurs sont identiques) alors les deux joueurs seront considérés comme différents.


Question 1.5– Implémenter la méthode equals(Joueur) de la classe Joueur. 
Voir B2GNSAlgo12 -> Joueur.java


Question 1.6– Après compilation et exécution du programme, expliquer le résultat obtenu lors de l'évaluation de l'expression jr1 == jr2. 
On peut voir que les valeurs de jr1 et jr2 sont identiques et qu’après la compilation, il est retourné que les deux joueurs sont différents. Ainsi, il est donc possible d’avoir deux mêmes joueurs avec les mêmes valeurs dès lors qu’ils sont distincts par leur numéro de joueur.


Question 1.7– Après compilation et exécution du programme, expliquer le résultat obtenu lors de l'évaluation de l'expression jr1.equals( jr2 ).
La méthode « equals » est surchargée, donc comme les valeurs sont identiques, elle renverra donc « Les deux joueurs sont identiques. ».


Question 1.8– Implémenter la méthode compareTo(Joueur) de la classe Joueur.
Voir B2GNSAlgo13 -> Joueur.java


Question 1.9– Compiler puis exécuter le programme. Vérifier les résultats obtenus.

Premier joueur : Joueur [numero=28, nom=Parker, pays=France, nbVictoires=30]
Second joueur  : Joueur [numero=28, nom=Watson, pays=France, nbVictoires=150]

Classement des deux joueurs :

[Joueur::compareTo(Joueur):int]
[Joueur::compareTo(Joueur):int]
	Watson est meilleur que Parker.

On peut donc voir que Watson(150) a plus de victoire que Parker(30).



Question 2.2– Compléter le code de la méthode main() dans le but de rechercher et d'afficher le joueur qui a remporté le moins de victoires. Compiler et exécuter le programme. Vérifier les résultats obtenus. 
Voir B2GNSAlgo21 -> AppTrierParNbVictoires.java

Celui qui a remporté le moins de victoires :

Joueur [numero=103, nom=FERT, pays=France, nbVictoires=18]


On peut donc voir que « FERT » a le moins de victoires.	



Question 2.3– Compléter le code de la méthode main() dans le but de trier dans l'ordre croissant (critère de tri : nombre de victoires) puis d'afficher (après la phase de tri) la liste des joueurs. Compiler et exécuter le programme. Vérifier les résultats obtenus.

Voir B2GNSAlgo21 -> AppTrierParNbVictoires.java

Liste triée des joueurs :

Joueur [numero=103, nom=FERT, pays=France, nbVictoires=18]
Joueur [numero=109, nom=MELLAJI, pays=France, nbVictoires=18]
Joueur [numero=101, nom=BRAAS, pays=France, nbVictoires=25]
Joueur [numero=111, nom=SIF, pays=France, nbVictoires=25]
Joueur [numero=107, nom=MEHDAOUI, pays=France, nbVictoires=27]
Joueur [numero=104, nom=GAMBO, pays=France, nbVictoires=28]
Joueur [numero=102, nom=DARBOE, pays=France, nbVictoires=30]
Joueur [numero=105, nom=LUCINA, pays=France, nbVictoires=33]
Joueur [numero=108, nom=VICENTE, pays=France, nbVictoires=37]

L’ordre croissant du nombre de victoires est respecté.



Question 2.5– Compléter le code source de la classe ComparateurNbVictoires, ainsi que celui de la classe principale AppTrierParNbVictoires. Enfin, compiler et exécuter le programme puis vérifier les résultats obtenus. 
Voir B2GNSAlgo22 -> ComparateurNbVictoires.java et AppTrierParNbVictoires.java

Liste triée des joueurs :

Joueur [numero=103, nom=FERT, pays=France, nbVictoires=18]
Joueur [numero=109, nom=MELLAJI, pays=France, nbVictoires=18]
Joueur [numero=101, nom=BRAAS, pays=France, nbVictoires=25]
Joueur [numero=111, nom=SIF, pays=France, nbVictoires=25]
Joueur [numero=107, nom=MEHDAOUI, pays=France, nbVictoires=27]
Joueur [numero=104, nom=GAMBO, pays=France, nbVictoires=28]
Joueur [numero=102, nom=DARBOE, pays=France, nbVictoires=30]
Joueur [numero=105, nom=LUCINA, pays=France, nbVictoires=33]
Joueur [numero=108, nom=VICENTE, pays=France, nbVictoires=37] 

L’ordre croissant du nombre de victoires est respecté.



Question 3.2– Compiler et exécuter le programme puis expliquer le résultat obtenu. 
Ce code permet d’ajouté un nouveau joueur dans une liste et d’ensuite affiché sa position.



Question 3.4– Après compilation et exécution du programme, expliquer le résultat obtenu lors de la recherche du joueur numéro 33.




Question 3.5– Modifier le code source de la classe Joueur dans le but de corriger le comportement du programme, puis compiler et exécuter le programme. Vérifier le résultat obtenu.
