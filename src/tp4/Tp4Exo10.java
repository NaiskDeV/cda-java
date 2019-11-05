/*Nom du répertoire : TP4
Nom du projet : Tp4Exo10
Nom de la classe : Tp4Exo10
Auteur : Laure */

package tp4;

public class Tp4Exo10 {

	public static void main(String[] args) {
		long entier_long;
		
		for(int i=0; i<64; i++) {
			entier_long= (long) Math.pow(2, i);
			System.out.println("Case : "+(i+1)+", nombre de pions : "+entier_long);
		}

	}

}
