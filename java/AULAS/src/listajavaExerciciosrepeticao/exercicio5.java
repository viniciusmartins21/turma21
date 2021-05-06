package listajavaExerciciosrepeticao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
		 *  Para tanto, a cada uma das pessoas era perguntado: 
		 *  idade, sexo (1-feminino / 2-masculino / 3-Outros), e as 
		 *  opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 *  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.
		 */
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);//construtor
		char continua='S';
		final int PESSOAS = 150;
		int contador=1;
		int idade=0;
		char sexo;  //(1-feminino / 2-masculino / 3-Outros)
		char opcao; //(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		int numeroPessoascalmas=0;
		int numeroMulheresnervosas=0;
		int numeroHomensagressivos=0;
		int outrosCalmos=0;
		int pessoasNervosasmais40=0;
		int pessoasCalmasmenor18=0;	
		
		
		while(continua=='S' && contador<=PESSOAS) {
			System.out.printf("Pessoa %d: \n",contador);
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.print("Informe n1-Feminino , n2-Masculino , n3-Outros: ");
			sexo = leia.next().charAt(0);
			System.out.print("Informe n1-pessoa calma , n2-pessoa nervosa , n3- pessoa agressiva: ");
			opcao = leia.next().charAt(0);
			
			if(opcao=='1')
			{
				numeroPessoascalmas++;
			}
			
			if(sexo=='1' && opcao=='2') 
			{
				numeroMulheresnervosas++;
			}
			
			if(sexo=='2' && opcao=='3')
			{
				numeroHomensagressivos++;
			}
			
			if(sexo=='3' && opcao=='1')
			{
				outrosCalmos++;
			}
			
			if(opcao=='2' && idade>=40)
			{
				pessoasNervosasmais40++;
			}
			
			if(opcao=='1' && idade<=18)
			{
				pessoasCalmasmenor18++;
			}
			
			//saida do loop
			System.out.println("Continua S/N? ");
			continua = leia.next().toUpperCase().charAt(0);
			contador++;
			
			System.out.println("Pessoas calmas: "+numeroPessoascalmas);
			System.out.println("Mulheres nervorsas : "+numeroMulheresnervosas);
			System.out.println("Homens agressivos : "+numeroHomensagressivos);
			System.out.println("Outros calmos : "+outrosCalmos);
			System.out.println("Pessoas nervorsas acma de 40 anos : "+pessoasNervosasmais40);
			System.out.println("Pessoas calmas menores de 18 anos : "+pessoasCalmasmenor18);
			System.out.println("FIM DO PROGRAMA!!");
		}
		
	}
	
	

}
