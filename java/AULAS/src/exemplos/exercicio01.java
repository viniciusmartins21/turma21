package lista2;

import java.util.Scanner;

public class exercicio01 {
	public static void main (String args[])
	{
	Scanner leia = new Scanner(System.in);
	int N;
	
	//é para ler a variavel N.(inicio)
	System.out.println("Digite um numero: ");
	N = leia.nextInt();
	
	//fim daleitura da variavel N.(fim)
	
	if(N > 100)
	{
		System.out.println("o numero é " + N);
	}
	if(N < 100)
	{
		System.out.println("o numero equivale a " + (N=0));
	}
	}
	
	
	
}
