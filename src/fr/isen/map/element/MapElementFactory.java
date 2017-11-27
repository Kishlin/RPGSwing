package fr.isen.map.element;

/**
 * 
 * @author legra
 *
 * Squelette d'une factory g�n�rant les �l�ments d'une carte.
 */
public abstract class MapElementFactory {

	/**
	 * G�n�re un mur.
	 * @return Wall Le mur g�n�r�.
	 */
	public abstract Wall getWall();
	
	/**
	 * G�n�re un sol.
	 * @return Ground Le sol g�n�r�.
	 */
	public abstract Ground getGround();
	
}
