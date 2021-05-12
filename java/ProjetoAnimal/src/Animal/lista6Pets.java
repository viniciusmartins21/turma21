package Animal;

public class lista6Pets {

	public static void main(String[] args) {
		
		//instaciamento os PETS possiveis dados
		Cachorro cachorro = new Cachorro("bob", 14);
		Cavalo cavalo = new Cavalo("pé de pano", 15);
		Preguiça preguica = new Preguiça("pano", 16);
		
		//especificação do DOG
		System.out.println("nome do cachorro: " + cachorro.getNome());
		System.out.println("Idade do cachorro: " + cachorro.getIdade());
		cachorro.som();
		//especificação do DOG
		
		System.out.println("");
		
		//especificação do Cavalo
		System.out.println("nome do cavalo: " + cavalo.getNome());
		System.out.println("Idade do cavalo: " + cavalo.getIdade());
		cavalo.som();
		//especificação do Cavalo
		
		System.out.println("");
		
		//especificação do preguiça
		System.out.println("nome da preguiça: " + preguica.getNome());
		System.out.println("Idade do preguiça: " + preguica.getIdade());
		preguica.som();
		//especificação do preguiça
		
		System.out.println("");
		
		
	}
	

}
