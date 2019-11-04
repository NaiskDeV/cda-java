/*Nom du répertoire : TP3
Nom du projet : Tp3Exo1
Nom de la classe : Tp3Exo1
Auteur : Laure */

package tp3;
import java.util.Scanner ;

public class Tp3Exo1{
    public static void main(String[] args) {
    Scanner lecture_clavier = new Scanner(System.in);
    boolean valeur_boolen;
    byte valeur_byte;
    char valeur_char;
    short valeur_short;
    int valeur_int;
    long valeur_long;
    float valeur_float;
    double valeur_double;
    String valeur_string;

    System.out.print("Saisir un booleen : ");
    valeur_boolen = lecture_clavier.nextBoolean();
    System.out.println("booleen  = " + (valeur_boolen));
    
    System.out.print("Saisir un byte : ");
    valeur_byte = lecture_clavier.nextByte();
    System.out.println("byte  = " + (valeur_byte));
    
    System.out.print("Saisir un char : ");
    valeur_char = lecture_clavier.next().charAt(0);
    System.out.println("char  = " + (valeur_char));
    
    System.out.print("Saisir un short : ");
    valeur_short = lecture_clavier.nextShort();
    System.out.println("short  = " + (valeur_short));
    
    System.out.print("Saisir un int : ");
    valeur_int = lecture_clavier.nextInt();
    System.out.println("int  = " + (valeur_int));
    
    System.out.print("Saisir un long : ");
    valeur_long = lecture_clavier.nextLong();
    System.out.println("long  = " + (valeur_long));
    
    System.out.print("Saisir un float : ");
    valeur_float = lecture_clavier.nextFloat();
    System.out.println("float  = " + (valeur_float));
    
    System.out.print("Saisir un double : ");
    valeur_double = lecture_clavier.nextDouble();
    System.out.println("double  = " + (valeur_double));
    
    System.out.print("Saisir un string : ");
    valeur_string = lecture_clavier.next();
    System.out.println("string  = " + (valeur_string));
    
    
    lecture_clavier.close();
 }
}
