/*Nom du répertoire : TP5
Nom du projet : Tp5Exo5
Nom de la classe : Tp5Exo5
Auteur : Laure */

package tp5;

import java.util.Scanner;

public class Tp5Exo5 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel mot souhaitez-vous tester?");
		String mot = clavier.next();
		String[] motTab= mot.split("");
		
		String motInverse="";
		for (int i=0; i<motTab.length; i++) {
			motInverse+= motTab[motTab.length-1-i];
		}
		if (mot.equals(motInverse)) {
			System.out.println(mot+" est un palindrome");
			
		}
		else {
			System.out.println(mot+" n'est pas un palindrome");
		}
		clavier.close();
	}

}
