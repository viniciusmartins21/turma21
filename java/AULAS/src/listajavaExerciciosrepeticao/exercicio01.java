package listajavaExerciciosrepeticao;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String args[]) {
	
		//Informar todos os n?meros de 1000 a 1999 
		//que quando divididos por 11 obtemos resto = 5. (FOR)
		
		Scanner leia = new Scanner (System.in);
		int i;
	
	
		for (i=1000; i <2000; i++){
			
			if (i%11==5) { //se o I tiver o resto de 11 igual a 5 escreva abaixo:
	       
				System.out.println(i);
	    } 
	}
}
}

