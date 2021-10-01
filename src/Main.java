public class Main {

	public static void main(String[] args) {
		/*//Première version de la classe.
		ChaineCryptee crypt = new ChaineCryptee("Ceci est un test", 3);
		System.out.println(crypt.decrypte());
		System.out.println(crypt.crypte());
		
		
		ChaineCryptee testNull = new ChaineCryptee(null, 3);
		System.out.println(testNull.decrypte());
		System.out.println(testNull.crypte());
		*/
		
		/*//Test de ChaineCryptee2
		ChaineCryptee2 crypt = new ChaineCryptee2("Ceci est un test", 3);
		System.out.println(crypt.decrypte());
		
		
		ChaineCryptee testNull = new ChaineCryptee(null, 3);
		System.out.println(testNull.decrypte());
		*/
		
		// Test de la troisième version de la classe
		ChaineCryptee3 c = ChaineCryptee3.deEnClair("Ceci est un test", 3);
		System.out.println(c.decrypte());
		
	}

}
