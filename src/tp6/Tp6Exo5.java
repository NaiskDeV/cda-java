/*Nom du répertoire : TP6
Nom du projet : Tp6Exo5
Nom de la classe : Tp6Exo5
Auteur : Laure */


package tp6;
import javax.swing.*;
public class Tp6Exo5 {

	public static void main(String[] args) {
		char valeur_car;
		int valeur_dec;
		String valeur_hexa;
		char valeur_car2;
		int valeur_dec2;
		String valeur_hexa2;
		char valeur_car3;
		int valeur_dec3;
		String valeur_hexa3;
		
				
		String grille = "<html> <table border = '1'>";
		grille = grille + "<tr><th>Dec</th><th>Hex</th><th>Car</th><th>   </th><th>Dec</th><th>Hex</th><th>Car</th><th>   </th><th>Dec</th><th>Hex</th><th>Car</th></tr>" ;
		
		for(int i=32; i<=64;i++) {
			valeur_dec= i;
			valeur_car = (char) valeur_dec;
			valeur_hexa = Integer.toHexString(valeur_dec);
			valeur_dec2= i+32;
			valeur_car2 = (char) valeur_dec2;
			valeur_hexa2 = Integer.toHexString(valeur_dec2);
			valeur_dec3= i+64;
			valeur_car3 = (char) valeur_dec3;
			valeur_hexa3 = Integer.toHexString(valeur_dec3);
			
			grille = grille + "<tr><td>"+valeur_dec+"</td><td>"+valeur_hexa+"</td><td>"+valeur_car+"</td><td>   </td><td>"+valeur_dec2+"</td><td>"+valeur_hexa2+"</td><td>"+valeur_car2+"</td><td>   </td><td>"+valeur_dec3+"</td><td>"+valeur_hexa3+"</td><td>"+valeur_car3+"</tr></td>";
		}
		
		grille= grille + "</table></html>";
		JOptionPane.showMessageDialog(null, grille,"Unicode", JOptionPane.PLAIN_MESSAGE);
	}

}
