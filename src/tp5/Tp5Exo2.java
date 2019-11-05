/*Nom du répertoire : TP5
Nom du projet : Tp5Exo2
Nom de la classe : Tp5Exo2
Auteur : Laure */

package tp5;

import java.util.Scanner;

public class Tp5Exo2 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		//Création des matrices		
		int m1[][]={{1,2,3},{1,2,3},{1,2,3}};    
		int m2[][]={{4,5,6},{4,5,6},{4,5,6}};      
		int resultat[][]=new int[m1.length][m1.length]; 
		    
		//Multiplication    
		for(int i=0;i<m1.length;i++){    
			for(int j=0;j<m1.length;j++){    
				resultat[i][j]=0;      
				for(int k=0;k<m1.length;k++){      
					resultat[i][j]+=m1[i][k]*m2[k][j];      
				} 
				System.out.print(resultat[i][j]+" ");    
			}
			System.out.println();   
		}  
		
		clavier.close();
		}
    }


