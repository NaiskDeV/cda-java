/*Nom du répertoire : TP4
Nom du projet : Tp4Exo7
Nom de la classe : Tp4Exo7
Auteur : Laure */

package tp4;
import java.util.Scanner;

public class Tp4Exo7 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donnez une valeur comprise entre -2147483648 et +2147483647");
		int n = clavier.nextInt();
		System.out.println("Donnez un numéro de bit (compris entre 0 et 31)");
		int num_bit = clavier.nextInt();
		
		int mask= 1 << num_bit;
		
		if ((n&mask)==0) {
			System.out.println("Dans l'écriture binaire du nombre "+n+", le bit numéro "+num_bit+" est à 0");
		}
		else {
			System.out.println("Dans l'écriture binaire du nombre "+n+", le bit numéro "+num_bit+" est à 1");
		}
		
		clavier.close();
	}

}
