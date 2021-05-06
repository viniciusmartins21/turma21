package pacoteJava;

import java.util.Scanner;

public class entradaEsaida {
	public static void main (String args[])
	{
		Scanner leia = new Scanner(System.in);
		int a,b,soma;
		System.out.println("Insira um numero para A: ");
		a = leia.nextInt();
		System.out.println("Insira um numero para B: ");
		b = leia.nextInt();
		soma = a+b;
		System.out.println(soma);
	}
}
