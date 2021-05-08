package lista04;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		//2- Faça um programa que receba 6 números inteiros e mostre: 
		//• Os números pares digitados;  
		//• A soma dos números pares digitados; 
		//• Os números ímpares digitados; 
		//• A quantidade de números ímpares digitados.
		
				Scanner leia = new Scanner(System.in);
				int numero[] = new int [6];
				int contadorPar=0;
				int contadorImpar=0;				
				
				
				for (int x=0; x<numero.length; x++)
				{	
					System.out.printf("\n DIGITE UM NUMERO : " );
					numero[x] = leia.nextInt();
								

					if (numero[x]%2==0) 
					{
						
						contadorPar = contadorPar+1;
									
					}
				
					else if ((numero[x]%2)==1) 
					{
						contadorImpar = contadorImpar+1;
						
					}
					
				}
				
				System.out.printf("\nO total de numeros pares é: %d" , contadorPar);
				
				
				
				System.out.printf("\nO total de numeros impares é: %d" , contadorImpar );
					
			}
				
			}

