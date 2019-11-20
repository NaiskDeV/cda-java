/*Nom du répertoire : TP5
Nom du projet : Tp5Exo4
Nom de la classe : Tp5Exo4
Auteur : Laure */

package tp5;

import java.util.Scanner;

public class Tp5Exo4 {

	public static void main(String[] args) {
		int nbre_note;
		float note, somme, moyenne;
		
		somme=0;
		
		Scanner clavier = new Scanner(System.in);
		System.out.print("Combien de notes souhaitez-vous entrer?");
		nbre_note = clavier.nextInt();
		float Tab[] = new float [nbre_note];
		
		for (int i=0; i<nbre_note; i++) {
			System.out.print("Quelle est la note n°"+(i+1));
			note = clavier.nextInt();
			somme += note;
			Tab[i]=note;
		}
		
		moyenne= somme / nbre_note;
		System.out.print("La moyenne des "+nbre_note+" notes est "+moyenne);
		
		int compteur=0;
		for (int i =0; i<nbre_note; i++) {
			if (Tab[i]>moyenne) {
				compteur++;
			}
		}
		System.out.print("Nombre de notes supérieures à la moyenne : "+compteur);
		
		clavier.close();

	}

}
