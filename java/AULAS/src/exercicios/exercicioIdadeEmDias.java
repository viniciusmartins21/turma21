package exercicios;

import java.util.Scanner;

/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias 
 * e mostre-a expressa em anos, meses e dias.
 */
 

public class exercicioIdadeEmDias {
	
public static void main (String args[]) 
{
	Scanner leia = new Scanner(System.in);
	int ano=12,diasVividos,mes=30;
	System.out.println("Informe quantos diasde vida você tem? ");
	diasVividos = leia.nextInt();
	
	//calculo de conversão dias para anos de idade.
	diasVividos = (diasVividos/mes)/ano;
	
	
	System.out.println("Você tem " + diasVividos + " ano(s) de idade");
	
}

}
