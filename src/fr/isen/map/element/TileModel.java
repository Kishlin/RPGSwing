package fr.isen.map.element;

import fr.isen.mvc.Model;

/**
 * 
 * @author legra
 *
 * Le modèle d'un élément de la carte.
 */
public class TileModel implements Model {

	private String imagePath;
	
	/**
	 * Consctructeur.
	 * @param imagePath String Chemin par défaut vers le fichier image de la tuile.
	 */
	public TileModel(String imagePath) {
		this.imagePath = imagePath;
	}
	
	/**
	 * Renvoie le chemin vers le fichier image dans le dossier ressource.
	 * @return String Chemin.
	 */
	@Override
	public String getImagePath() {
		return this.imagePath;
	}

	/**
	 * Mets à jour le chemin vers le fichier image.
	 * @param imagePath String Nouveau chemin.
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
