package fr.isen.mvc;

import java.awt.Image;

import javax.swing.JPanel;

/**
 * 
 * @author legra
 * 
 * Objet ayant le r�le de contr�lleur dans un sch�ma MVC.
 */
public interface Controller {
	
	/**
	 * Attache la destination pour la vue.
	 * @param listener JPanel La vue.
	 */
	public void setView(JPanel listener);
	
	/**
	 * Mets � jour l'affichage de la vue.
	 */
	public void updateView();

	/**
	 * Renvoie l'image � afficher.
	 */
	public Image getImage();
}
