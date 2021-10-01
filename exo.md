**Comment se comporte votre classe si la chaîne passée au constructeur est null ? Vous pouvez utiliser le débogueur pour identifier le problème (s’il y a un problème) au niveau de crypte.**

Une exception java.lang.NullPointerException est levée quand l'argument chaîne de caractère vaut null.

**Si la méthode a échoué, modifiez la classe pour prendre en compte la chaîne null**

	On passe de ce constructeur (l'erreur a lieu au String.toUpperCase) :
	
	```Java
	public ChaineCryptee(String clair, int decal) {
		if (clair == null)
			clair = "";
		this.clair = clair.toUpperCase();
		this.decal = decal;
	}
	```
	
	A ce constructeur :
	
	```Java
	public ChaineCryptee(String clair, int decal) {
		if (clair == null)
			clair = "";
		this.clair = clair.toUpperCase();
		this.decal = decal;
	}
	```
	
**Changez la représentation interne de la classe : seule la chaîne cryptée est stockée (plus la chaîne en clair).**

	La réponse est la classe ChaineCryptee2.
	