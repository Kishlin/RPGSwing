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
	 * Essaie de déplacer le joueur vers le Sud.
	 * Renvoie si oui ou non, le joueur a pu se déplacer.
	 * @return boolean true|false
	 */
	@Override
	public boolean moveSouth() {
		return move(0, 1);
	}

	/**
	 * Essaie de déplacer le joueur vers le Nord.
	 * Renvoie si oui ou non, le joueur a pu se déplacer.
	 * @return boolean true|false
	 */
	@Override
	public boolean moveNorth()  {
		return move(0, -1);
	}

	/**
	 * Essaie de déplacer le joueur vers l'Ouest.
	 * Renvoie si oui ou non, le joueur a pu se déplacer.
	 * @return boolean true|false
	 */
	@Override
	public boolean moveWest() {
		return move(-1, 0);
	}

	/**
	 * Essaie de déplacer le joueur vers l'Est.
	 * Renvoie si oui ou non, le joueur a pu se déplacer.
	 * @return boolean true|false
	 */
	@Override
	public boolean moveEast() {
		return move(1, 0);
	}
	
	/**
	 * Helper method.
	 * Essaie de déplacer le joueur dans la direction donnée.
	 * Renvoie si oui ou non, le joueur a pu se déplacer.
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
	 * Essaie de déplacer depuis la position indiquée, vers la direction donnée.
	 * Renvoie si oui ou non, le joueur a pu se déplacer.
	 * @param position Position Position de départ.
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
	 * Déclenche le déplacement d'un élément de la carte vers un autre.
	 * Renvoie si oui ou non, le déplacement a pu être effectué.
	 * @param currentElement MapElement Element de départ.
	 * @param nextElement    MapElement Element de destination.
	 * @return true|false
	 */
	private boolean moveToElement(MapElement currentElement, MapElement nextElement) {
		boolean moved = nextElement.enter();
		if (moved) currentElement.leave();
		return moved;
	}

}
