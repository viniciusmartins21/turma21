package listajavaExerciciosrepeticao;


import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner (System.in);
		
		int numero=0;
		int contadorPar=0;
		int contadorImpar=0;
		
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		for(int x=1; x<=4; x++)
		{
			System.out.println("\n Digite um numero: ");
			numero = entrance.nextInt();
			
			if((x%2)==0)
			{
				contadorPar=contadorPar+1;
			}
			
			if((x%2)==1)
			{
				contadorImpar=contadorImpar+1;
			}
		}
			
		System.out.printf("A quantidade de numeros pares �:%d : e a quantida de numeros impares � %d",contadorPar,contadorImpar);
		
		//System.out.printf("A quantidade de numeros impares �: %d "  contadorImpar);
	}

}