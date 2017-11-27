package fr.isen.world;

import fr.isen.gameplay.Movable;
import fr.isen.map.RPGMap;
import fr.isen.map.element.MapElement;
import fr.isen.player.Player;
import fr.isen.player.Position;

/**
 * 
 * @author legra
 *
 * Classe de gestion du monde jouable.
 */
public class RPGWorldManager implements Movable {

	private RPGMap map = null;
	
	private Player player = null;

	/**
	 * Constructeur
	 * @param player Player Le joueur.
	 * @param map    RPGMap La carte.
	 */
	public RPGWorldManager(Player player, RPGMap map) {
		this.player = player;
		this.map = map;
	}
	
	/**
	 * Renvoie la map de jeur.
	 * @return RPGMap La map.
	 */
	public RPGMap getMap() {
		return map;
	}
	
	/**
	 * Renvoie le joueur de la partie.
	 * @return Player Le joueur.
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Essaie de d�placer le joueur vers le Sud.
	 * Renvoie si oui ou non, le joueur a pu se d�placer.
	 * @return boolean true|false
	 */
	@Override
	public boolean moveSouth() {
		return move(0, 1);
	}

	/**
	 * Essaie de d�placer le joueur vers le Nord.
	 * Renvoie si oui ou non, le joueur a pu se d�placer.
	 * @return boolean true|false
	 */
	@Override
	public boolean moveNorth()  {
		return move(0, -1);
	}

	/**
	 * Essaie de d�placer le joueur vers l'Ouest.
	 * Renvoie si oui ou non, le joueur a pu se d�placer.
	 * @return boolean true|false
	 */
	@Override
	public boolean moveWest() {
		return move(-1, 0);
	}

	/**
	 * Essaie de d�placer le joueur vers l'Est.
	 * Renvoie si oui ou non, le joueur a pu se d�placer.
	 * @return boolean true|false
	 */
	@Override
	public boolean moveEast() {
		return move(1, 0);
	}
	
	/**
	 * Helper method.
	 * Essaie de d�placer le joueur dans la direction donn�e.
	 * Renvoie si oui ou non, le joueur a pu se d�placer.
	 * @param x int Direction de destination horizontale.
	 * @param y int Direction de destination verticale.
	 * @return boolean true|false
	 */
	private boolean move(int x, int y) {
		Position position = player.getPosition();
		if (tryAndMove(position, x, y)) {
			player.updatePosition(x, y);
		}
		return true;
	}
	
	/**
	 * Essaie de d�placer depuis la position indiqu�e, vers la direction donn�e.
	 * Renvoie si oui ou non, le joueur a pu se d�placer.
	 * @param position Position Position de d�part.
	 * @param x        int      Direction de destination horizontale.
	 * @param y        int      Direction de destination verticale.
	 * @return boolean true|false
	 */
	private boolean tryAndMove(Position position, int x, int y) {
		MapElement nextElement = map.getMapElement(position.x + x, position.y + y);
		if (nextElement  == null) return false;
		
		MapElement currentElement = map.getMapElement(position.x, position.y);
		return moveToElement(currentElement, nextElement);
	}
	
	/**
	 * D�clenche le d�placement d'un �l�ment de la carte vers un autre.
	 * Renvoie si oui ou non, le d�placement a pu �tre effectu�.
	 * @param currentElement MapElement Element de d�part.
	 * @param nextElement    MapElement Element de destination.
	 * @return true|false
	 */
	private boolean moveToElement(MapElement currentElement, MapElement nextElement) {
		boolean moved = nextElement.enter();
		if (moved) currentElement.leave();
		return moved;
	}

}
