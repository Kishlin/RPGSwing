package fr.isen.map.element.snow;

import fr.isen.map.element.Ground;
import fr.isen.map.element.MapElementFactory;
import fr.isen.map.element.Wall;

/**
 * 
 * @author legra
 *
 * Factory des éléments de type zone enneigée.
 */
public class SnowFactory extends MapElementFactory {

	private static SnowFactory instance = null;

	/**
	 * Constructeur.
	 */
	private SnowFactory() { }

	/**
	 * Renvoie l'instance du singleton.
	 * @return SnowFactory La factory.
	 */
	public static SnowFactory getInstance() {
		if (instance == null) instance = new SnowFactory();
		
		return instance;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Wall getWall() {
		return new SnowWall();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Ground getGround() {
		return new SnowGround();
	}

}
