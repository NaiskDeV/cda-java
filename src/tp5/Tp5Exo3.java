/*Nom du répertoire : TP5
Nom du projet : Tp5Exo3
Nom de la classe : Tp5Exo3
Auteur : Laure */

package tp5;
import java.util.Scanner ;

public class Tp5Exo3 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Combien de valeurs souhaitez-vous trier?");
		int n = clavier.nextInt();
		int Tab[]= new int [n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Entrez la valeur n°"+(i+1));
			Tab[i] = clavier.nextInt();	
		}
		
		boolean flag=false;
		while(flag==false) {
			flag=true;
			for(int i=1; i<n; i++) {
				if (Tab[i-1]>Tab[i]) {
					int temp = Tab[i];
					Tab[i]=Tab[i-1];
					Tab[i-1]=temp;
					flag=false;
				}
			}
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(Tab[i]);
		}
		
		clavier.close();

	}
}
