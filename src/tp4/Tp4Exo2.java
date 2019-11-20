/*Nom du répertoire : TP4
Nom du projet : Tp4Exo2
Nom de la classe : Tp4Exo2
Auteur : Laure */

package tp4;
import java.util.Scanner;

public class Tp4Exo2 {

	public static void main(String[] args) {
		float note, somme, moyenne;
		int nbre_note;
		
		nbre_note=0;
		somme = 0;
		note=0;
		
		Scanner clavier = new Scanner(System.in);
		
		while(note>=0) {
			System.out.print("Quelle est la note n°"+(nbre_note+1));
			note = clavier.nextInt();
			if (note>=0) {
				somme+=note;
				nbre_note++;
			}
		}
		
		moyenne= somme / nbre_note;
		System.out.print("La moyenne des "+nbre_note+" notes est "+moyenne);
		
		clavier.close();
		
	}

}
