package exercicios;

import java.util.Scanner;

/*
 * Faça um sistema que leia a idade de uma pessoa
expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
 */

public class exerciciodeIdade {
	public static void main (String args[]) 
	{
	Scanner leia = new Scanner(System.in);
	int idade,meses=12,dias=30,idadeDias;
	final int anoAtual=2021;
	System.out.println("Informe sua idade meu consagrado: ");
	idade = leia.nextInt();
	
	idadeDias = idade*meses*dias;
	
	System.out.println("você ja viveu " + idadeDias + " dias da sua vida!!");
		
		
	}	
}
