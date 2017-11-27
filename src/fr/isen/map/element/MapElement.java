package fr.isen.map.element;

import javax.swing.JPanel;

import fr.isen.mvc.Controller;

/**
 * 
 * @author legra
 *
 * Squelette d'un �l�ment de la carte, sol ou mur.
 */
public abstract class MapElement implements Controller {
	
	protected JPanel listener = null;
	
	protected TileModel model = null;
	
	/**
	 * M�thode d�clench�e quand le joueur souhaite marcher sur l'�l�ment.
	 * Renvoie faux si le d�placement sur l'�l�ment est impossible. Vrai si oui.
	 * @return boolean true|false
	 */
	public abstract boolean enter();
	
	/**
	 * M�thode d�clench�e lors du d�part de l'�l�ment par le joueur.
	 */
	public abstract void leave();

	/**
	 * Mets � jour le chemin vers le fichier image du mod�le.
	 * @param newPath String nouveau chemin.
	 */
	public void updateModelImagePath(String newPath) {
		this.model.setImagePath(newPath);
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
		this.listener.repaint();
	}
	
}
