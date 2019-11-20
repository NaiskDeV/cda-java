/*Nom du répertoire : TP6
Nom du projet : Tp6Exo2
Nom de la classe : Tp6Exo2
Auteur : Laure */

package tp6;

import java.util.Scanner;

public class Tp6Exo2 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel est votre texte?");
		String texte = clavier.nextLine();
		texte= texte.replace("e", "");
		
		System.out.println(texte);
		clavier.close();
	}	
}
