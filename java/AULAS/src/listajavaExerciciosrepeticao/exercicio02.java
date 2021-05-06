package listajavaExerciciosrepeticao;


import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner entrance = new Scanner (System.in);
		
		int numero=0;
		int contadorPar=0;
		int contadorImpar=0;
		
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
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
			
		System.out.printf("A quantidade de numeros pares é:%d : e a quantida de numeros impares é %d",contadorPar,contadorImpar);
		
		//System.out.printf("A quantidade de numeros impares é: %d "  contadorImpar);
	}

}