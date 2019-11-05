/*Nom du répertoire : TP5
Nom du projet : Tp5Exo1
Nom de la classe : Tp5Exo1
Auteur : Laure */

package tp5;
import java.util.Scanner ;
public class Tp5Exo1 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Combien de valeurs contient le tableau?");
		int n = clavier.nextInt();
		while (n<1) {
			System.out.println("Il ne peut pas y avoir moins d'une valeur");
			System.out.println("Combien de valeurs contient le tableau?");
			n = clavier.nextInt();
		}
		int TAB[]= new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Entrez la valeur n°"+(i+1));
			TAB[i] = clavier.nextInt();	
		}
		
		int max=TAB[0];
		int compteur=0;
		for (int i=0; i<n; i++) {
			if (max<TAB[i]) {
				max=TAB[i];
			}
			if (TAB[i]==0) {
				compteur++;
			}
		}
		
		System.out.print("La valeur max est : "+max+" et il y a "+compteur+" zéro(s).");
		clavier.close();
	}

}
