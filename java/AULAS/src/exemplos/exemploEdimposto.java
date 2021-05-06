package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class exemploEdimposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		char tipo;
		double salario;
		boolean emergencial;
		char aux;
		double imposto;
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("M-Masculino F-Feminino O-Outros:");
		tipo = leia.next().toUpperCase().charAt(0);
		System.out.println("Salario mensal: ");
		salario = leia.nextDouble();
		System.out.println("Vc pegou o emergencial? ");
		aux = leia.next().toUpperCase().charAt(0);
		if(aux=='S') {
			emergencial=false;
		}
		else {
			emergencial=false;
		}
		
		if((salario*12) > 60000) {
			if(emergencial) {
				if(salario >= 5000 && salario < 6000)
				imposto = (salario*12)*0.15+3000;
			} else {
				
			}
		}
		
		

	}

}
