package Animal;

public class lista6Pets {

	public static void main(String[] args) {
		
		//instaciamento os PETS possiveis dados
		Cachorro cachorro = new Cachorro("bob", 14);
		Cavalo cavalo = new Cavalo("p� de pano", 15);
		Pregui�a preguica = new Pregui�a("pano", 16);
		
		//especifica��o do DOG
		System.out.println("nome do cachorro: " + cachorro.getNome());
		System.out.println("Idade do cachorro: " + cachorro.getIdade());
		cachorro.som();
		//especifica��o do DOG
		
		System.out.println("");
		
		//especifica��o do Cavalo
		System.out.println("nome do cavalo: " + cavalo.getNome());
		System.out.println("Idade do cavalo: " + cavalo.getIdade());
		cavalo.som();
		//especifica��o do Cavalo
		
		System.out.println("");
		
		//especifica��o do pregui�a
		System.out.println("nome da pregui�a: " + preguica.getNome());
		System.out.println("Idade do pregui�a: " + preguica.getIdade());
		preguica.som();
		//especifica��o do pregui�a
		
		System.out.println("");
		
		
	}
	

}
