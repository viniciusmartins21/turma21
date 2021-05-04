package exemplos;

import java.util.Scanner;

public class OiMundo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		String nome;
		int numero1 = 10;
		int numero2 = 20;
		double salario = 1999.95;
		char op = 'S';
		
		System.out.println("Digite um numero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite um numero: ");
		numero2 = leia.nextInt();
		System.out.println();
		nome = leia.next();
		
		System.out.println("nome: "+nome);
	}
	
	
}
