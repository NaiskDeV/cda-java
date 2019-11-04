/*Nom du répertoire : TP4
Nom du projet : Tp4Exo4
Nom de la classe : Tp4Exo4
Auteur : Laure */

package tp4;
import java.util.Scanner;

public class Tp4Exo4 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Quel nombre doit être testé?");
		int n = clavier.nextInt();
		boolean flag= true;
		
		for (int i=2; i<n/2; i++) {
			if (n%i==0) {
				flag=false;
			}
		}
		
		if (flag) {
			System.out.print(n+" est premier");
		}
		else {
			System.out.print(n+" n'est pas premier");
		}
		clavier.close();
	}

}

