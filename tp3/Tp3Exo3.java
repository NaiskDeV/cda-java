package tp3;

public class Tp3Exo3
{
public static void main(String[] args)
{
int n=7,p=4;
int negatif = -32000;

//0111 & 0100 donne 0100 soit 4
//0111 | 0100 donne 0111 soit 7
//0111 ^ 0100 donne 0011 soit 3
System.out.println("n&p,n|p,n^p = " + (n&p) +" "+ (n|p) + " " + (n^p));

//0111 >> 2 donne 0001 soit 1
//0111 >> 4 donne 0000 soit 0
//0111 << 2 donne 0001 1100 soit 28
System.out.println("n>>2,n>>4,n<<2 = " + (n>>2) +" "+ (n>>4) + " " + (n<<2));

//décalage à droit signé (rempli de 1)
System.out.println("negatif>>2, negatif>>4 = " + (negatif>>2) +" "+(negatif>>4));

//décalage à droite non signé (rempli de 0)
System.out.println("negatif>>>2, negatif>>>4 = " + (negatif>>>2) +" "+ (negatif>>>4));
}
}
