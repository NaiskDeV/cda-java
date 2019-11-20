/*Nom du répertoire : TP5
Nom du projet : Tp5Exo6
Nom de la classe : Tp5Exo6
Auteur : Laure */

package tp5;

import java.util.Hashtable;
import java.util.Scanner;

public class Tp5Exo6 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel nombre souhaitez-vous convertir?");
		int nombre = clavier.nextInt();
		
		String binaire="";
		while (nombre>=1) {
			int a= nombre%2;
			nombre=nombre/2;
			binaire= a + binaire;
						
		}

		//ajout de "0" pour avoir un affichage binaire conforme
		if (binaire.length()%4!=0) {
			for (int i=0; i<binaire.length()%4; i++) {
				binaire=0+binaire;
			}
		}
		
		System.out.println("En binaire : "+binaire);
		String hexa="";
		String sousChaine="";
		
		//dictionnaire de conversion binaire=>hexa
		Hashtable<String, String> dico= new Hashtable<String, String>(16);
		dico.put("0000","0");
		dico.put("0001","1");
		dico.put("0010","2");
		dico.put("0011","3");
		dico.put("0100","4");
		dico.put("0101","5");
		dico.put("0110","6");
		dico.put("0111","7");
		dico.put("1000","8");
		dico.put("1001","9");
		dico.put("1010","A");
		dico.put("1011","B");
		dico.put("1100","C");
		dico.put("1101","D");
		dico.put("1110","E");
		dico.put("1111","F");
		
		//découpage en sous chaine et conversion
		for (int i=0; i<binaire.length()/4; i++) {
			sousChaine= binaire.substring(i*4,(i+1)*4);
			hexa+= dico.get(sousChaine);
		}
		
		System.out.println("En hexadecimal : "+hexa);
		clavier.close();
	}

}
