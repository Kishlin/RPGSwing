package fr.isen.map.element.town;

import fr.isen.map.element.Ground;
import fr.isen.map.element.MapElementFactory;
import fr.isen.map.element.Wall;

/**
 * 
 * @author legra
 *
 * Factory des �l�ments de type ville.
 */
public class TownFactory extends MapElementFactory {

	private static TownFactory instance = null;

	/**
	 * Constructeur.
	 */
	private TownFactory() { }

	/**
	 * Renvoie l'instance du singleton.
	 * @return TownFactory La factory.
	 */
	public static TownFactory getInstance() {
		if (instance == null) instance = new TownFactory();
		
		return instance;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Wall getWall() {
		return new TownWall();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Ground getGround() {
		return new TownGround();
	}

}
