package exercicioLa�ocRepeti�ao;

import java.util.Locale;

public class exercicio01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.println("Os n�meros que sobram 5 da divis�o por 11 e que est�o entre 1000 e 1999 s�o");
		for(int x=1000;x<=1999;x++) {
			if(x%11==5) {
				System.out.println(x);
			}
		}
	}
}
