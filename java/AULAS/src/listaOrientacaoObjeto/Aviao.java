package listaOrientacaoObjeto;


public class Aviao {
	
	
		
		// Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
		// em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es
		// deste objeto no console.
		
		public String modelo;
		public String color;
		public double velocMax;
		public int capcidadePassageiros;

		public Aviao (String modelo,String color,double velocMax, int capcidadePassageiros)
		{
			this.modelo = modelo;
			this.color = color;
			this.velocMax=velocMax;
			this.capcidadePassageiros=capcidadePassageiros;
		}
		
		//pegar todos os dados
		public String getdadosCompletos() 
		{
			String dadosCompletos = "modelo do aviao: "+modelo+"cor:"+color+""
			+"velocidade maxima ktchau:"+velocMax+" KM/h\n"+"capacidade passageiros:"+capcidadePassageiros;
			return dadosCompletos;
			
		}
			
	}
