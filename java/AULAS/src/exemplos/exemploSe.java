package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class exemploSe {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		int numero;
		
		System.out.print("Digite um numero: ");
		numero=leia.nextInt();
		
		if(numero==0)
		{
			System.out.println("Numero � neutro.");
		}
		
		else if((numero%2)==0)
		{
			System.out.println("O numero � par.");
		}
		
		else
		{
			System.out.println("O numero � impar. ");
		}
		
		

	}

}
