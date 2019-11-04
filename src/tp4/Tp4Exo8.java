/*Nom du répertoire : TP4
Nom du projet : Tp4Exo7
Nom de la classe : Tp4Exo7
Auteur : Laure */

package tp4;

public class Tp4Exo8 {

	public static void main(String[] args) {
		
		float p=1;
		float q=2;
		float r=q/p;
		
		while (!(r>1.6179 && r<1.6181)) {
			p+=q;
			//permutation de p et q
			p=q+p;
			q=p-q;
			p=p-q;
			
			r=q/p;
			System.out.println("p = "+p+", q = "+q+", r = "+r);
		}
	}

}
