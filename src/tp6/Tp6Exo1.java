/*Nom du répertoire : TP5
Nom du projet : Tp6Exo1
Nom de la classe : Tp6Exo1
Auteur : Laure */

package tp6;

import java.util.Scanner;

public class Tp6Exo1 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel est votre texte?");
		String texte = clavier.nextLine();

		int compteur = 0;
		
		for(int i=0; i<texte.length(); i++) {
			if (texte.charAt(i) == 'e') {
				compteur++;
			}
		}
		
		System.out.println(compteur);
		clavier.close();
	}	
}
