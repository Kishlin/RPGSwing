package fr.isen.gameplay;

/**
 * 
 * @author legra
 *
 * Objet d�pla�able avec les fl�ches directionnelles ou ZQSD.
 */
public interface Movable {

	/**
	 * Essaie de d�placer l'objet vers la droite. 
	 * Renvoie vrai si l'objet a pu bouger.
	 * @return boolean true|false
	 */
	public boolean moveEast();

	/**
	 * Essaie de d�placer l'objet vers la gauche. 
	 * Renvoie vrai si l'objet a pu bouger.
	 * @return boolean true|false
	 */
	public boolean moveWest();

	/**
	 * Essaie de d�placer l'objet vers le haut. 
	 * Renvoie vrai si l'objet a pu bouger.
	 * @return boolean true|false
	 */
	public boolean moveNorth();

	/**
	 * Essaie de d�placer l'objet vers le bas. 
	 * Renvoie vrai si l'objet a pu bouger.
	 * @return boolean true|false
	 */
	public boolean moveSouth();
	
}
