package tp2;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Tp2Exo2 {

	public static void main(String[] args) {
		
		Scanner lecture_clavier = new Scanner(System.in);
		
		int somme, produit;
		
		String val1 = JOptionPane.showInputDialog(null, "Taper un premier entier :");
		int valeur1 = Integer.parseInt(val1);
		
		String val2 = JOptionPane.showInputDialog(null, "Taper un second entier :");
		int valeur2 = Integer.parseInt(val2);
				
		somme=valeur1+valeur2;
		produit= valeur1*valeur2;		
				
		String texteSomme = "La somme de "+valeur1+ " et "+valeur2+" est : "+somme;
		String texteProduit = "Le produit de "+valeur1+ " et "+valeur2+" est : "+produit;
		JOptionPane.showMessageDialog(null, texteSomme);
		JOptionPane.showMessageDialog(null, texteProduit);

	}

}
