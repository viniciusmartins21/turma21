package lista2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4lista2 {

	public static void main(String[] args) {
	/*
	 * Fa�a um programa em que permita a entrada de um n�mero qualquer e 
	 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
	 * se for �mpar exiba o n�mero elevado ao quadrado.
	 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double num, raiz, pot;
		
		
		System.out.println("Informe um numero: ");
		num = teclado.nextDouble();
		
		if(num>0){
			if((num%2)==0) {
				raiz = Math.sqrt(num);
				System.out.printf("O n�mero � %.2f e sua raiz quadrada � de %.2f\n", num, raiz);
			}else {
				pot = Math.pow(num,2);
				System.out.printf("O n�mero � %.2f e sua potencia ao quadrado � de %.2f\n", num, pot);
			}
		}else {
			System.out.printf("O numero � negativo.");
		}
		teclado.close();
	}

}
