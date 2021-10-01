package exo3_12_1;

/**
 * Première version de la classe. On stocke la chaîne en clai en attribut.
 */
public class ChaineCryptee {

	/**
	 * Crée une instance de chaîne cryptée.
	 * @param clair (String) La chaîne en clair. Si la chaîne fournie vaut null, elle sera initialisée en
	 * une chaîne vide.
	 * @param decal (int) le décalage à appliquer au caractères de notre chaîne.
	 */
	public ChaineCryptee(String clair, int decal) {
		if (clair == null)
			clair = "";
		this.clair = clair.toUpperCase();
		this.decal = decal;
	}
	
	
	/**
	 * Renvoie la chaîne en clair.
	 * @return String la chaîne en clair.
	 */
	public String decrypte() {
		return clair;
	}
	
	
	/**
	 * Chiffre par décalage la chaîne en clair.
	 * @return String la chaîne chiffrée.
	 */
	public String crypte() {
		char[] tmp = clair.toCharArray();
		for (int i = 0; i < tmp.length; i++)
			tmp[i] = ChaineCryptee.decaleCaractere(tmp[i], decal);
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
	
	private String clair;
	private int decal;
}
