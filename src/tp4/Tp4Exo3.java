/*Nom du répertoire : TP4
Nom du projet : Tp4Exo3
Nom de la classe : Tp4Exo3
Auteur : Laure */

package tp4;
import java.util.Scanner;

public class Tp4Exo3 {

	public static void main(String[] args) {
		int n=5;
		String etoile="*";
		String concat="*";
		
		for (int i=0; i<n; i++) {
			System.out.println(concat);
			concat+=etoile;
		}

	}

}
