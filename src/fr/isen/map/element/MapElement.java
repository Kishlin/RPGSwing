package fr.isen.map.element;

import javax.swing.JPanel;

import fr.isen.mvc.Controller;

/**
 * 
 * @author legra
 *
 * Squelette d'un élément de la carte, sol ou mur.
 */
public abstract class MapElement implements Controller {
	
	protected JPanel listener = null;
	
	protected TileModel model = null;
	
	/**
	 * Méthode déclenchée quand le joueur souhaite marcher sur l'élément.
	 * Renvoie faux si le déplacement sur l'élément est impossible. Vrai si oui.
	 * @return boolean true|false
	 */
	public abstract boolean enter();
	
	/**
	 * Méthode déclenchée lors du départ de l'élément par le joueur.
	 */
	public abstract void leave();

	/**
	 * Mets à jour le chemin vers le fichier image du modèle.
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
