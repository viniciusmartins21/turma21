package lista2;

import java.util.Scanner;

public class celsiusfahren {
	public static void main(String args[]) 
	{
	Scanner leia = new Scanner(System.in);
	
	String nome;
	double celsius = 0.00;
	double farenheit = 0.00;
	double conversao = 0.00;
	
	System.out.println("Digite seu nome: ");
	nome = leia.next();
	
	System.out.println("Insira a temperatura em Celsius ");
	celsius = leia.nextDouble();
	
	farenheit = (celsius* 1.8) + 32;
	
	System.out.println(nome + " A temperatura em farenheit é: " + farenheit+" Fº");
	
	
	}

}
