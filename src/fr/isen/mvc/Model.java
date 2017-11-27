package fr.isen.mvc;

/**
 * 
 * @author legra
 *
 * Objet ayant le r�le de mod�le dans un pattern MVC.
 */
public interface Model {

	/**
	 * Renvoie le chemin vers l'image dans le dossier ressources.
	 * @return String Chemin vers le fichier.
	 */
	public String getImagePath();
	
}
