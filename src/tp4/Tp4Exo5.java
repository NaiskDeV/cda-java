/*Nom du répertoire : TP4
Nom du projet : Tp4Exo5
Nom de la classe : Tp4Exo5
Auteur : Laure */

package tp4;
import java.util.Scanner;

public class Tp4Exo5 {

	public static void main(String[] args) {
		
		int code = 1234;
		int tentative = 0;
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Bonjour! Quel est le code d'accès?");
		int n = clavier.nextInt();
		tentative++;
		while (tentative<5) {
			if (n==code) {
				System.out.print("Bienvenue!");
				break;
			}
			else {
				System.out.println("Code erroné! Il vous reste "+(5-tentative)+" tentative(s)");
				System.out.println("Quel est le code d'accès?");
				n = clavier.nextInt();
			}
			tentative++;
		}
		if (tentative==5) {
			System.out.println("Essais incorrects trop nombreux, veuillez contacter le service client pour réinitialiser le code d'accès :)");
		}
		clavier.close();
	}

}
