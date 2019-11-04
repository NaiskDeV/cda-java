float note, somme, moyenne
int nbre_note

nbre_note=0
somme=0
note=0

TANT QUE note>=0: 
  note = saisir("Note n°"+(nbre_note+1))
  SI note>=0 ALORS:
    nbre_note++
    somme +=note
  FIN SI
FIN TANT QUE

moyenne = somme / nbre_note

afficher("La moyenne est de "+moyenne)
