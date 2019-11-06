package tp7;

import java.util.Scanner;

public class Tp7Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rayon;
		double surface;
		double perimetre;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Quel est le rayon? (doit être un entier)");
		rayon = clavier.nextInt();
		
		surface=surface(rayon);
		perimetre=perimetre(rayon);
		
		System.out.println("La surface est : "+surface);
		System.out.println("Le périmètre est : "+perimetre);
		
		clavier.close();
	}
		
		
	public static double surface (int rayon){
		
		double surface = Math.pow(rayon, 2)*Math.PI;
		return surface;
	}
	
	public static double perimetre (int rayon){
		
		double perimetre = 2*Math.PI*rayon;
		return perimetre;
	}

}
