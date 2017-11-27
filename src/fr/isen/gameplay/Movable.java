package fr.isen.gameplay;

/**
 * 
 * @author legra
 *
 * Objet déplaçable avec les flèches directionnelles ou ZQSD.
 */
public interface Movable {

	/**
	 * Essaie de déplacer l'objet vers la droite. 
	 * Renvoie vrai si l'objet a pu bouger.
	 * @return boolean true|false
	 */
	public boolean moveEast();

	/**
	 * Essaie de déplacer l'objet vers la gauche. 
	 * Renvoie vrai si l'objet a pu bouger.
	 * @return boolean true|false
	 */
	public boolean moveWest();

	/**
	 * Essaie de déplacer l'objet vers le haut. 
	 * Renvoie vrai si l'objet a pu bouger.
	 * @return boolean true|false
	 */
	public boolean moveNorth();

	/**
	 * Essaie de déplacer l'objet vers le bas. 
	 * Renvoie vrai si l'objet a pu bouger.
	 * @return boolean true|false
	 */
	public boolean moveSouth();
	
}
