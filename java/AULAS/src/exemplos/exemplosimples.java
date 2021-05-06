package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class exemplosimples {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor: ");
		valor = leia.nextInt();
		
		if((valor%2)==0) 
		{
			System.out.println("Valor é par");
		}
		
		else 
		{
			System.out.println("Valor é impar");
		}
		
	}
	
}
