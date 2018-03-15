[ TP MONGO ]

Ce TP consiste en la création d’une application simple qui utilise une base de données MongoDB utilisant Morphia pour les annotations.
Pour l’installer, on fait l’import du projet dans éclipse ou Intellij IDEA comme un projet Maven 

Question : Quelles sont les limites d’une base données orientées document 
Réponses : Les limites sont très nombreuses mais les principales sont :
- Les requêtes et le chargement de données sont moins flexibles.
- Les données sont des clés-valeurs mono-threadé. Il est impossible de requêter les valeurs comme sur une base de données relationnelles. Il faut faire les requêtes sur les clés.
Le but pour la deuxième partie est d'essayer un serveur redis avec des bouts de code donnés dans le sujet

Question : Quelles sont les types de données stockés dans Redis, que peut on faire comme types de requêtes ?
Réponses :
-  Chaînes de caractères, tableaux associatifs, listes, ensembles et ensembles ordonnés.
- Types de requêtes : clef-valeur comme dans une map
