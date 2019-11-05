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
		String texte = clavier.next();

		int compteur = 0;
		int index = texte.indexOf("e");
		
		while (index>=0) {
			index = texte.indexOf("e", index+1);
			compteur++;
		}
		
		System.out.println(compteur);
		clavier.close();
	}	
}
