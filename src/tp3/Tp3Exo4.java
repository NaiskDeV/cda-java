/*Nom du répertoire : TP3
Nom du projet : Tp3Exo4
Nom de la classe : Tp3Exo4
Auteur : Laure */

package tp3;
import java.util.Scanner;

public class Tp3Exo4 {

	public static void main(String[] args) {
		Scanner lecture_clavier = new Scanner(System.in);
		
		System.out.print("Saisir un temps au format hh-mm-ss ");
		String temps = lecture_clavier.nextLine();
		String[] tempsTab=temps.split("-");
				
		int heures= Integer.parseInt(tempsTab[0]);
		int minutes = Integer.parseInt(tempsTab[1]);
		int secondes = Integer.parseInt(tempsTab[2]);
		
		int total;
		total = 3600*heures + 60*minutes + secondes;
		
		System.out.print("Cela donne "+total+" secondes");
		
		
		lecture_clavier.close();
		

	}

}
