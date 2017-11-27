package fr.isen.map.element;

/**
 * 
 * @author legra
 *
 * Squelette d'une factory générant les éléments d'une carte.
 */
public abstract class MapElementFactory {

	/**
	 * Génère un mur.
	 * @return Wall Le mur généré.
	 */
	public abstract Wall getWall();
	
	/**
	 * Génère un sol.
	 * @return Ground Le sol généré.
	 */
	public abstract Ground getGround();
	
}
