package exercicioLa�ocRepeti�ao;


import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); //construtor
		
		int idade=0,pessoasCalmas=0,mulheresNervosas=0,homensAgressivos=0,outrosCalmos=0,
				mais40Nervosos=0,menor18Calmas=0,sexo=0,opcoes=0,x=0;
		//tudo que n�o envolve calculo � legal usar char
		System.out.println("Bem vindo a pesquisa!");
		
		while(x<2) {
			System.out.printf("Pessoa n� %d\n",x+1);
			System.out.print("Digite a sua idade : ");
			idade = leia.nextInt();
			System.out.print("Digite a op��o de sexo que voc� se identifica : (1-F/2-M/3-O) ");
			sexo = leia.nextInt();
			System.out.println("Digite a op��o que voc� se identifica como pessoa :"
					+ " \n 1- Calma \n 2- Nervosa \n 3- Agressiva");
			opcoes = leia.nextInt();
			if(idade<0 || sexo<1 || sexo>3||opcoes<1||opcoes>3) {
				System.out.println("Informa��o n�o � valida, refa�a o seu cadastro.");
			} else {
				if(opcoes==1) {
					pessoasCalmas++;
				}
				if(sexo==1 && opcoes==2) {
					mulheresNervosas++;
				}
				if(sexo==2 && opcoes == 3) {
					homensAgressivos++;
				}
				if(sexo == 3 && opcoes == 1) {
					outrosCalmos++;
				}
				if(idade>40 && opcoes == 2) {
					mais40Nervosos++;
				}
				if(idade<18 && opcoes==1) {
					menor18Calmas++;
				}
				x++;
				
			}
			
			
			
		}
		System.out.printf("Foram cadastrados %d pessoas, sendo elas : \n %d Pessoas calmas; \n %d Mulheres nervosas; \n "
				+ "%d Homens agressivos; \n %d Outros calmos; \n %d Pessoas nervosas com mais de 40 anos"
				+ "\n %d Pessoas calmas com menos de 18 anos",(x),pessoasCalmas,mulheresNervosas,homensAgressivos,outrosCalmos,mais40Nervosos,menor18Calmas);
	}
}
