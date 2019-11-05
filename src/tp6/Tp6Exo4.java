/*Nom du répertoire : TP6
Nom du projet : Tp6Exo4
Nom de la classe : Tp6Exo4
Auteur : Laure */


package tp6;

import java.util.Scanner;

public class Tp6Exo4 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez une chaîne de caractère à trier");
		String chaine = clavier.next();
		int n=chaine.length();
		char Tab[]=chaine.toCharArray();
		
		boolean flag=false;
		while(flag==false) {
			flag=true;
			for(int i=1; i<n; i++) {
				if (Tab[i-1]>Tab[i]) {
					char temp = Tab[i];
					Tab[i]=Tab[i-1];
					Tab[i-1]=temp;
					flag=false;
				}
			}
		}
		
		String resultat = new String(Tab);
		
		System.out.println(resultat);
		clavier.close();
	}
}
