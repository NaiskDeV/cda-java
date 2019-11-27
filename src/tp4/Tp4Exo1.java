/*Nom du répertoire : TP4
Nom du projet : Tp4Exo1
Nom de la classe : Tp4Exo1
Auteur : Laure */

package tp4;
import java.util.Scanner;

public class Tp4Exo1 {

	public static void main(String[] args) {
		int nbre_note;
		float note, somme, moyenne;
		
		somme=0;
		
		Scanner clavier = new Scanner(System.in);
		System.out.print("Combien de notes souhaitez-vous entrer?");
		nbre_note = clavier.nextInt();
		
		for (int i=0; i<nbre_note; i++) {
			System.out.print("Quelle est la note n°"+(i+1));
			note = clavier.nextInt();
			somme += note;
		}
		
		moyenne= somme / nbre_note;
		System.out.print("La moyenne des "+nbre_note+" notes est "+moyenne);
		
		clavier.close();

	}

}
