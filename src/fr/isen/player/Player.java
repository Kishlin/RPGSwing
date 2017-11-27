package fr.isen.player;

import java.awt.Image;

import javax.swing.JPanel;

import fr.isen.mvc.Controller;
import fr.isen.utils.R;

/**
 * 
 * @author legra
 *
 * Classe correspondant au personnage dans le jeu.
 */
public class Player implements Controller {
	
	private JPanel listener = null;
	
	private PlayerModel model = null;
	
	/**
	 * Constructeur.
	 */
	public Player() {
		model = new PlayerModel();
	}
	
	/**
	 * Renvoie la position du joueur.
	 * @return Position La position.
	 */
	public Position getPosition() {
		return this.model.getPosition();
	}

	/**
	 * Mets à jour la position du joueur en incrémentant les coordonnées correspondantes.
	 * @param x int Evolution de la position verticale.
	 * @param y int Evolution de la position horizontale.
	 */
	public void updatePosition(int x, int y) {
		this.model.updatePosition(x, y);
		this.updateView();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setView(JPanel listener) {
		this.listener = listener;		
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void updateView() {
		if (this.listener != null) listener.repaint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image getImage() {
		return R.returnImage(this.model.getImagePath());
	}

}
