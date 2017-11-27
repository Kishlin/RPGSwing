package fr.isen.player;

import fr.isen.mvc.Model;
import fr.isen.utils.Constants;

/**
 * 
 * @author legra
 *
 * Classe correspondant au mod�le du joueur pour le pattern MVC.
 */
public class PlayerModel implements Model {
	
	private Position position = null;
	
	/**
	 * Constructeur.
	 */
	public PlayerModel() {
		position = new Position();
		position.x = Constants.START_POS_X;
		position.y = Constants.START_POS_Y;
	}

	/**
	 * Mets � joueur la position du mod�le, an incr�mentant les coordonn�es correspondante.
	 * @param x int Evolution de la position horizontale.
	 * @param y int Evolution de la position verticale.
	 */
	public void updatePosition(int x, int y) {
		this.position.x += x;
		this.position.y += y;
	}

	/**
	 * Renvoie la position du joueur.
	 * @return Position Sa position.
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getImagePath() {
		return "./player.png";
	}

}
