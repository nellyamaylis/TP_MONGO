[ TP MONGO ]

Ce TP consiste en la cr�ation d�une application simple qui utilise une base de donn�es MongoDB utilisant Morphia pour les annotations.
Pour l�installer, on fait l�import du projet dans �clipse ou Intellij IDEA comme un projet Maven 

Question : Quelles sont les limites d�une base donn�es orient�es document 
R�ponses : Les limites sont tr�s nombreuses mais les principales sont :
- Les requ�tes et le chargement de donn�es sont moins flexibles.
- Les donn�es sont des cl�s-valeurs mono-thread�. Il est impossible de requ�ter les valeurs comme sur une base de donn�es relationnelles. Il faut faire les requ�tes sur les cl�s.
Le but pour la deuxi�me partie est d'essayer un serveur redis avec des bouts de code donn�s dans le sujet

Question : Quelles sont les types de donn�es stock�s dans Redis, que peut on faire comme types de requ�tes ?
R�ponses :
-  Cha�nes de caract�res, tableaux associatifs, listes, ensembles et ensembles ordonn�s.
- Types de requ�tes : clef-valeur comme dans une map
