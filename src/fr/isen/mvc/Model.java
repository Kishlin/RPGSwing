package fr.isen.mvc;

/**
 * 
 * @author legra
 *
 * Objet ayant le rôle de modèle dans un pattern MVC.
 */
public interface Model {

	/**
	 * Renvoie le chemin vers l'image dans le dossier ressources.
	 * @return String Chemin vers le fichier.
	 */
	public String getImagePath();
	
}
