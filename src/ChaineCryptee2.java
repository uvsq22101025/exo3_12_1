/**
 * Deuxième version de la classe. On stocke à présent la chaîne chiffrée, sans modifier l'inteface.
 */
public class ChaineCryptee2 {
	
	/**
	 * Crée une instance de chaîne cryptée.
	 * @param clair (String) La chaîne en clair. Si la chaîne fournie vaut null, elle sera initialisée en
	 * une chaîne vide.
	 * @param decal (int) le décalage à appliquer au caractères de notre chaîne.
	 */
	public ChaineCryptee2(String clair, int decal) {
		if (clair == null)
			clair = "";
		else
			clair = clair.toUpperCase();
		this.decal = decal;
		this.crypt = clair;
		this.crypt = crypte();
	}
	
	
	/**
	 * Renvoie la chaîne en clair.
	 * @return String la chaîne en clair.
	 */
	public String decrypte() {
		char[] tmp = crypt.toCharArray();
		for (int i = 0; i < tmp.length; i++)
			tmp[i] = ChaineCryptee2.decaleCaractere(tmp[i], -decal);
		return new String(tmp);
	}
	
	
	/**
	 * Chiffre par décalage la chaîne en clair.
	 * @return String la chaîne chiffrée.
	 */
	public String crypte() {
		char[] tmp = crypt.toCharArray();
		for (int i = 0; i < tmp.length; i++)
			tmp[i] = ChaineCryptee2.decaleCaractere(tmp[i], decal);
		return new String(tmp);
		
	}
	
	
	/**
	 * Décale un caractère majuscule.
	 * Les lettres en majuscule ('A' - 'Z') sont décalées de <code>decalage</code>
	 * caractères de façon circulaire. Les autres caractères ne sont pas modifiés.
	 *
	 * @param c le caractère à décaler
	 * @param decalage le décalage à appliquer
	 * @return le caractère décalé
	 */
	private static char decaleCaractere(char c, int decalage) {
	    return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
	}
	
	private String crypt;
	private int decal;
}
