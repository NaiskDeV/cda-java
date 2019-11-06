/*Nom du répertoire : TP7
Nom du projet : Tp7Exo2
Nom de la classe : Tp7Exo2
Auteur : Laure */

package tp7;

import java.util.Scanner;

public class Tp7Exo2 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quelle est la première valeur?");
		int valeur1 = clavier.nextInt();
		System.out.println("Quelle est la seconde valeur?");
		int valeur2 = clavier.nextInt();
		System.out.println("Quelle est la troisième valeur?");
		int valeur3 = clavier.nextInt();
		
		int plus_grand=plusGrand(valeur1, valeur2, valeur3);
		
		System.out.println("Le plus grand est "+plus_grand);
		clavier.close();
	}
	
	public static int plusGrand (int val1, int val2, int val3){
		
		int plus_grand=val1;
		
		if (val1<val2) {
			plus_grand = val2;
			if (val2<val3) {
				plus_grand = val3;
			}
		}
		
		if (val3>val1 && val3>val2) {
			plus_grand = val3;
		}
		
		return plus_grand;
	}

}
