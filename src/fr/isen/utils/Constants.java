package fr.isen.utils;

import fr.isen.map.element.MapElementFactory;
import fr.isen.map.element.magicMaze.MagicMazeFactory;
import fr.isen.map.element.snow.SnowFactory;
import fr.isen.map.element.town.TownFactory;

/**
 * 
 * @author legra
 *
 * Classe de param�trisation des constantes du jeu.
 */
@SuppressWarnings("unused")
public class Constants {
	
	private Constants() {}

	// Taille d'une tuile du terrain en pixels.
	public static int TILE_SIZE = 32;
	
	// Largeur de la map, en nombre d'�l�ments.
	public static int MAP_WIDTH = 25;
	
	// Hauteur de la map, en nombre d'�l�ments.
	public static int MAP_HEIGHT = 25;
	
	// Position horizontale de d�part du joueur.
	public static int START_POS_X = MAP_WIDTH / 2;
	
	// Position verticale de d�part du joueur.
	public static int START_POS_Y = MAP_HEIGHT / 2;

	// La factory. D�commentez la ligne de celle souhait�e pour le jeu.
	//public static MapElementFactory FACTORY = TownFactory.getInstance();
	public static MapElementFactory FACTORY = SnowFactory.getInstance();
	//public static MapElementFactory FACTORY = MagicMazeFactory.getInstance();
	
}
