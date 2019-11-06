fonction plusGrand(valeur1, valeur2, valeur3)
  int max=valeur1
 
  SI valeur1<valeur2 ALORS
    max = valeur2
    SI valeur2<valeur3 ALORS
      max = valeur3
    FIN SI
  FIN SI
   
  SI valeur3>valeur1 ET valeur3>valeur2 ALORS
    max=valeur3
  FIN SI
    
