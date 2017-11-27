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
	 * @param tileArray List<List<MapElement>> Listes d'�l�ments � utiliser pour la carte.
	 */
	public RPGMap(List<List<MapElement>> tileArray) {
		this.map = tileArray;
	}

	/**
	 * Renvoie l'�l�ment � la position demand�e.
	 * Renvoie null si l'�l�ment est hors de la carte.
	 * @param x int Ligne de l'�l�ment.
	 * @param y int Colonne de l'�l�ment.
	 * @return MapElement L'�l�ment.
	 */
	public MapElement getMapElement(int x, int y) {
		try {
			return this.map.get(y).get(x);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

}
