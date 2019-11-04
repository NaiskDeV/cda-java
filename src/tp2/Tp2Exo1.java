
package tp2;

import java.util.Scanner;

public class Tp2Exo1 {

	public static void main(String[] args) {
		Scanner lecture_clavier = new Scanner(System.in);
		
		int valeur1, valeur2, somme, produit;
		System.out.print("Saisir un premier entier : ");
		valeur1 = lecture_clavier.nextInt();
		System.out.print("Saisir un second entier : ");
		valeur2 = lecture_clavier.nextInt();
		somme=valeur1+valeur2;
		produit= valeur1*valeur2;
		System.out.println("La somme de "+valeur1+ " et "+valeur2+" est : "+somme);
		System.out.print("Le produit de "+valeur1+ " et "+valeur2+" est : "+produit);
		lecture_clavier.close();

	}
