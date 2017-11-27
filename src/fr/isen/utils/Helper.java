package fr.isen.utils;

/**
 * 
 * @author legra
 *
 * Classe de méthodes d'aide génériques.
 */
public class Helper {
	
	private Helper() {}

    /**
     * Convertie une valeur de position ou de taille normée, en sa valeur en pixels correspondante sur l'affichage.
     * @param index Position ou taille selon l'axe normé.
     * @return int Position en pixel.
     */
	public static int indexToPixel(int index) {
		int pixel = Constants.TILE_SIZE;
		return index * pixel;
	}
	
}
