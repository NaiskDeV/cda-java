int nbre_note
float note, somme, moyenne

somme=0

nbre_note = saisir("Nombre de notes?")
POUR i allant de 1 à N:
  note = saisir("Note n°"+i)
  somme += note
 FIN POUR
 
 moyenne = somme / nbre_note
 
 afficher("La moyenne est de "+moyenne)
