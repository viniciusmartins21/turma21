package listaOrientacaoObjeto;

public class Paciente {
	
	public String nome;
	public String cpf;
	public String convenio;
	public char genero;
	
	
	public Paciente (String nome, String cpf, String convenio, char genero)
	{	
		this.nome = nome;
		this.cpf = cpf;
		this.convenio = convenio;
		this.genero = genero;
	}
	
		public String getdadosCompletos() {
			
		String getdadosCompletos = "Nome do paciente? " + nome + " CPF: " + cpf + "Convenio : "+ convenio + " Genero: "+ genero ;
		return getdadosCompletos ;
			
		}
}