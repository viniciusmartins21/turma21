package exercicioLa�ocRepeti�ao;


import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double num=0.0, soma3 =0.0;
		int multiplos=0;
		
		do {
			System.out.print("Digite um numero :");
			num = leia.nextDouble();
			
			if((num)%3==0 && num !=0) {
				soma3+=num;
				multiplos++;
			}
		}while(num!=0);
		
		System.out.printf("A m�dia dos multiplos de 3 � : %.2f \n",(soma3/multiplos));
		leia.close();
	}
}