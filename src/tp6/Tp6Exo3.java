/*Nom du répertoire : TP6
Nom du projet : Tp6Exo3
Nom de la classe : Tp6Exo3
Auteur : Laure */

package tp6;

import java.util.Scanner;

public class Tp6Exo3 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel mot souhaitez-vous inverser?");
		String mot = clavier.next();
		String[] motTab= mot.split("");
		
		String motInverse="";
		for (int i=0; i<motTab.length; i++) {
			motInverse+= motTab[motTab.length-1-i];
		}
		System.out.println(motInverse);
		clavier.close();
	}

}
