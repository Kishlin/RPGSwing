package fr.isen.map.element.magicMaze;

import fr.isen.map.element.Ground;
import fr.isen.map.element.MapElementFactory;
import fr.isen.map.element.Wall;

/**
 * 
 * @author legra
 *
 * Factory des éléments de type layrinthe magique.
 */
public class MagicMazeFactory extends MapElementFactory {

	private static MagicMazeFactory instance = null;
	
	/**
	 * Constructeur.
	 */
	private MagicMazeFactory() { }
	
	/**
	 * Renvoie l'instance du singleton.
	 * @return MagicMazeFactory La factory.
	 */
	public static MagicMazeFactory getInstance() {
		if (instance == null) instance = new MagicMazeFactory();
		
		return instance;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Wall getWall() {
		return new MagicMazeWall();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Ground getGround() {
		return new MagicMazeGround();
	}

}
