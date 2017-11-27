package fr.isen.mvc;

import java.awt.Image;

import javax.swing.JPanel;

/**
 * 
 * @author legra
 * 
 * Objet ayant le rôle de contrôlleur dans un schéma MVC.
 */
public interface Controller {
	
	/**
	 * Attache la destination pour la vue.
	 * @param listener JPanel La vue.
	 */
	public void setView(JPanel listener);
	
	/**
	 * Mets à jour l'affichage de la vue.
	 */
	public void updateView();

	/**
	 * Renvoie l'image à afficher.
	 */
	public Image getImage();
}
