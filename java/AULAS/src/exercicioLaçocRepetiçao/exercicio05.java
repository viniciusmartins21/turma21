package exercicioLa�ocRepeti�ao;


import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0 ;
		do {
			System.out.println("Digite um n�mero inteiro : ");
			num= leia.nextInt();
			soma+=num;
		}while(num!=0);
		leia.close();
		System.out.printf("A soma dos valores adicionados � : %d",soma);
	}
}
