package ficha2;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Tri�ngulo: " + areaTriang (5, 3) );
		System.out.println("Rect�ngulo: " + areaRect(5, 3) );
		System.out.println("Cal: " + areaCal(5, 3, 0) );
		System.out.println("Factorial: " + factor(5) );
		System.out.println("Factorial rec: " + factorRecursivo(5) );
		Scanner pergunta = new Scanner (System.in);
		System.out.println("Introduza a frase:");
		String frase = pergunta.nextLine();
		System.out.println("O n�mero total de vogais na frase \"" + frase + "\" �: " + 
				numTotalVogais(frase) );
		numVogais (frase);
		System.out.println("Introduza o n.� de segundos:");
		convertSeconds(pergunta.nextInt());
		pergunta.close();
	}
	
	public static double areaTriang (double aAltura, double aBase)
	{
		// fun��o chamada areaTriang que recebe dois argumentos (altura e base) e retorna a �rea do triangulo.
		double area = aAltura * aBase /2;
		return area;
		
	}
	
	public static double areaRect (double aAltura, double aComp)
	{
		// fun��o chamada areaRetang que recebe dois argumentos (altura e comprimento) e retorna a �rea do ret�ngulo
		double area = aAltura * aComp;
		return area;
		
	}
	
	public static double areaCal (double aX, double aY, int aZ)
	{
		// fun��o chamada areaCal que recebe tr�s argumentos (x, y, z) e retorna a �rea do triangulo caso z = 1 e retorna a �rea do ret�ngulo caso contr�rio.

		if (aZ == 1) {
			return areaTriang(aX, aY);
		}
		else {
			return areaRect(aX, aY);
		}
		
	}
	
	public static int factor (int aN)
	{
		// fun��o chamada factor que recebe um argumento (n) e calcula o seu fatorial usando um ciclo (for ou while).
			
		int fact = 1;
		for( int i=1; i<=aN;i++){    
		      fact=fact*i;    
		 }
		return fact;
		
	}
	
	public static int factorRecursivo (int aN)
	{
		// fun��o chamada factorRecursivo que recebe um argumento (n) e calcula o seu fatorial (recursivamente).
			
		if (aN == 0)    {
			    return 1;
		}
		else {    
			return(aN * factorRecursivo(aN-1));    
		}    
		
	}
	
	public static int numTotalVogais (String aFrase)
	{
		// 	fun��o chamada numTotalVogais que recebe uma String (frase) e retorna o n�mero total de vogais na mesma
		
		int count = 0;

		for (int i=0 ; i<aFrase.length(); i++){
	         char ch = aFrase.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
	      }
		return count;
		
	}
	
	public static void numVogais (String aFrase)
	{
		// 	fun��o chamada na fun��o chamada numVogais que recebe uma String (frase) e imprime a quantidade de cada vogal na mesma.
		
		int nA = 0, nE = 0, nI = 0, nO = 0, nU = 0;
	
		for (int i=0 ; i<aFrase.length(); i++){
	         char ch = aFrase.charAt(i);
	         switch (ch) {
	         case 'a':
	        	 nA++;
	        	 break;
	         case 'e':
	        	 nE++;
	        	 break;
	         case 'i':
	        	 nI++;
	        	 break;
	         case 'o':
	        	 nO++;
	        	 break;
	         case 'u':
	        	 nU++;
	        	 break;
	         default:
	        	 break;
	         }
	      }
		System.out.println("a " + nA);
		System.out.println("e " + nE);
		System.out.println("i " + nI);
		System.out.println("o " + nO);
		System.out.println("u " + nU);
	}
	
	
	public static void numVogais2 (String aFrase)
	{
		// 	fun��o chamada na fun��o chamada numVogais que recebe uma String (frase) e imprime a quantidade de cada vogal na mesma.
		
		int nA = 0, nE = 0, nI = 0, nO = 0, nU = 0;
	
		Dictionary vogais = new Hashtable();
		vogais.put("a", 0);
		vogais.put("e", 0);
		vogais.put("i", 0);
		vogais.put("o", 0);
		vogais.put("u", 0);
		
		for (int i=0 ; i<aFrase.length(); i++){
			char ch = aFrase.charAt(i);
			/*
			 * vogais.put(aFrase, vogais) switch (ch) { case 'a': nA++; break; case 'e':
			 * nE++; break; case 'i': nI++; break; case 'o': nO++; break; case 'u': nU++;
			 * break; default: break; }
			 */
	      }
		System.out.println("a " + nA);
		System.out.println("e " + nE);
		System.out.println("i " + nI);
		System.out.println("o " + nO);
		System.out.println("u " + nU);
	}
	
	public static void convertSeconds (int aSegundos)
	{
		// 	Escreva uma fun��o chamada convertSeconds que recebe um n�mero (segundos) e imprime o n�mero de minutos, horas, dias e meses (considere que um m�s tem 30 dias).
		
		System.out.println("Segundos:" + aSegundos);
		System.out.println("Minutos :" + aSegundos /60);
		System.out.println("Horas   :" + aSegundos /60 /60);
		System.out.println("Dias    :" + aSegundos /60 /60/ 24);
		System.out.println("Meses:  :" + aSegundos /60 /60/ 24/ 30);
	}

	
}
