/*Nom du répertoire : TP3
Nom du projet : Tp3Exo2
Nom de la classe : Tp3Exo2
Auteur : Laure */

package tp3;

public class Tp3Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10, p = 4;
		long q = 2111000222 ;
		float x = 1.75f;
		
		// a) n + q long 2111000232
		Object a = n+q;
		System.out.println(a instanceof Long);
		System.out.println(a);
		
		//b)  n + x long 11.75
		Object b = n+x;
		System.out.println(b instanceof Float);
		System.out.println(b);
		
		//c) n % p * q long 4222000444
		Object c = n % p * q;
		System.out.println(c instanceof Long);
		System.out.println(c);
		
		//d) n % -p * n int 20
		Object d = n % -p * n;
		System.out.println(d instanceof Integer);
		System.out.println(d);
		
		//e)  -n % p * n int -20
		Object e = -n % p * n;
		System.out.println(e instanceof Integer);
		System.out.println(e);
	}

}
