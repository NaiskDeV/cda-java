/*Nom du répertoire : TP4
Nom du projet : Tp4Exo6
Nom de la classe : Tp4Exo6
Auteur : Laure */

package tp4;
import java.util.Scanner;

public class Tp4Exo6 {

	public static void main(String[] args) {
		
		int somme=0;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Donnez une valeur comprise entre 1 et 100 inclus");
		int n = clavier.nextInt();
		
		while (n<1 || n>100) {
			System.out.println("Il semble que nous ne nous soyons pas bien compris. Donnez une valeur comprise entre 1 et 100 inclus SVP");
			n = clavier.nextInt();
		}
		
		while (n>0) {
			somme+=2*n-1;
			n--;
		}
		
		System.out.println(somme);
		
		clavier.close();
	}

}
