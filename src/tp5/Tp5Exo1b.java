/*Nom du répertoire : TP5
Nom du projet : Tp5Exo1b
Nom de la classe : Tp5Exo1b
Auteur : Laure */

package tp5;
import java.util.Scanner ;
public class Tp5Exo1b {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Combien de lignes contient le tableau?");
		int ligne = clavier.nextInt();
		System.out.println("Combien de colonnes contient le tableau?");
		int colonne = clavier.nextInt();
		while (ligne<1 ||colonne<1) {
			System.out.println("Il ne peut pas y avoir moins d'une ligne et une colonne");
			System.out.println("Combien de lignes contient le tableau?");
			ligne = clavier.nextInt();
			System.out.println("Combien de colonnes contient le tableau?");
			colonne = clavier.nextInt();
		}
		int TAB[][]= new int [ligne][colonne];
		
		//Remplissage 
		for(int i=0; i<ligne; i++) {
			for (int j=0; j<colonne; j++) {
				System.out.print("Entrez la valeur de la ligne "+(i+1)+", colonne "+(j+1));
				TAB[i][j] = clavier.nextInt();	
			}
		}
		
		int max=TAB[0][0];
		int compteur=0;
		for(int i=0; i<ligne; i++) {
			for (int j=0; j<colonne; j++) {
				if (max<TAB[i][j]) {
					max=TAB[i][j];
				}
				if (TAB[i][j]==0) {
					compteur++;
				}
			}
		}
		
		System.out.print("La valeur max est : "+max+" et il y a "+compteur+" zéro(s).");
		clavier.close();
	}
}
