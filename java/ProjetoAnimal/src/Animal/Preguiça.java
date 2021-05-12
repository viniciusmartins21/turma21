package Animal;

public class Preguiça extends Animal{

	public Preguiça(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void som() {
		System.out.println("zuim zuim zuim");
	}
		
}
