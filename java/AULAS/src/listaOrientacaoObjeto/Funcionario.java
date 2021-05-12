package listaOrientacaoObjeto;

public class Funcionario {
	
	
	public String nome;
	public String cpf;
	double salario;
	public char genero;
	
	
	public Funcionario(String nome, String cpf, char genero, double salario) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.genero = genero;
	}
		public String getdadosCompletos() {
			
		String getdadosCompletos = "Nome do cliente? " + nome + " CPF: " + cpf + "Salario: "+ salario + " Genero: "+ genero ;
		return getdadosCompletos ;
			
		}


		
}
