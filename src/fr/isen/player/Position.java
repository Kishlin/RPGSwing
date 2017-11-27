package fr.isen.player;

import fr.isen.utils.Constants;

/**
 * 
 * @author legra
 * 
 * Position d'un objet dans un espace 2D.
 */
public class Position {
	
	public int x = 0;
	
	public int y = 0;
	
	/**
	 * Constructeur pour une position par défaut.
	 */
	public Position() {	
		this(Constants.START_POS_X, Constants.START_POS_Y);
	}
	
	/**
	 * Constructeur avec position initiale paramétrée.
	 * @param x int Position horizontale initiale.
	 * @param y int Position verticale initiale.
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
