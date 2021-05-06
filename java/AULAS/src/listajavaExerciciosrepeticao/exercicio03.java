package listajavaExerciciosrepeticao;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		//Solicitar a idade de várias pessoas e imprimir: 
		//Total de pessoas com menos de 21 anos. 
		//Total de pessoas com mais de 50 anos.
		//O programa termina quando idade for = -99. (WHILE)
		
		Scanner entrance = new Scanner(System.in);
		
		int idade;
		int contadorPessoasMenores21=0;
		int contadorPessoasMaior50=0;
		
		
		do 
		{
			System.out.println("\nDigite sua idade: ");
			idade = entrance.nextInt();
			
			if(idade <= 21) 
			{
				contadorPessoasMenores21=contadorPessoasMenores21+1;
				
			}
			
			if(idade >= 51 ) 
			{
				contadorPessoasMaior50=contadorPessoasMaior50+1;
				
			}
			
		}
		while(idade <=99);
		 
		System.out.printf("\nQuantidade de menores de 21 é: %d",contadorPessoasMenores21);
		
		System.out.printf("\nQuantidade de maiores que 51 é: %d",contadorPessoasMaior50);

}
}
