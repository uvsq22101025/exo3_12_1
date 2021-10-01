

/**
 * Troisième version de la classe utilisant une variante du DP Fabrique.
 */
public class ChaineCryptee3 {
		
	/**
	* Crée une instance de chaîne cryptée.
	* @param clair (String) La chaîne claire ou chiffrée. Si la chaîne fournie vaut null, elle sera initialisée en
	* une chaîne vide.
	* @param decal (int) le décalage à appliquer aux caractères de notre chaîne.
	*/
	private ChaineCryptee3(String s, int decal) {
		if (s == null)
			s = "";
		else
			s = s.toUpperCase();
		this.decal = decal;
		this.crypt = s;
	}
		
	
	/**
	 * Crée une chaîne cryptée à partir d'une chaîne en clair.
	 * @param s (String) la chaîne en clair.
	 * @param dec (int) le décalage à appliquer.
	 * @return un objet chaîne cryptée contenant la valeur chiffrée du paramètre s.
	 */
	public static ChaineCryptee3 deEnClair(String s, int dec) {
		ChaineCryptee3 c = new ChaineCryptee3(s, dec);
		return ChaineCryptee3.deCryptee(c.crypte(), dec);
	}
	
	
	/**
	 * Crée une chaîne cryptée à partir d'une chaîne chiffrée.
	 * @param s(String) la chaîne chiffré.
	 * @param dec le décalage à appliquer.
	 * @return un objet chaîne cryptée contenant chaîne chiffrée s.
	 */
	public static ChaineCryptee3 deCryptee(String s, int dec) {
		return new ChaineCryptee3(s, dec);
	}
	
	/**
	 * Renvoie la chaîne en clair.
	 * @return String la chaîne en clair.
	 */
	public String decrypte() {
		char[] tmp = crypt.toCharArray();
		for (int i = 0; i < tmp.length; i++)
			tmp[i] = ChaineCryptee3.decaleCaractere(tmp[i], -decal);
		return new String(tmp);
	}
	
	
	/**
	 * Chiffre par décalage la chaîne en clair.
	 * @return String la chaîne chiffrée.
	 */
	public String crypte() {
		char[] tmp = crypt.toCharArray();
		for (int i = 0; i < tmp.length; i++)
			tmp[i] = ChaineCryptee3.decaleCaractere(tmp[i], decal);
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
