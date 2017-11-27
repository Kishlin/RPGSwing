package fr.isen.map;

import java.util.List;

import fr.isen.map.element.MapElement;

/**
 * 
 * @author legra
 *
 * La carte du jeu.
 */
public class RPGMap {
	
	private List<List<MapElement>> map = null;
	
	/**
	 * Constructeur.
	 * @param tileArray List<List<MapElement>> Listes d'éléments à utiliser pour la carte.
	 */
	public RPGMap(List<List<MapElement>> tileArray) {
		this.map = tileArray;
	}

	/**
	 * Renvoie l'élément à la position demandée.
	 * Renvoie null si l'élément est hors de la carte.
	 * @param x int Ligne de l'élément.
	 * @param y int Colonne de l'élément.
	 * @return MapElement L'élément.
	 */
	public MapElement getMapElement(int x, int y) {
		try {
			return this.map.get(y).get(x);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

}
