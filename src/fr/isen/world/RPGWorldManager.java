package fr.isen.world;

import fr.isen.gameplay.Movable;
import fr.isen.map.RPGMap;
import fr.isen.map.element.MapElement;
import fr.isen.player.Player;
import fr.isen.player.Position;

public class RPGWorldManager implements Movable {

	private RPGMap map = null;
	
	private Player perso = null;

	public RPGWorldManager(RPGMap map, Player perso) {
		this.map = map;
		this.perso = perso;
	}
	
	public RPGMap getMap() {
		return map;
	}
	
	public Player getPerso() {
		return perso;
	}

	@Override
	public boolean moveSouth() {
		return move(1, 0);
	}

	@Override
	public boolean moveNorth()  {
		return move(0, -1);
	}

	@Override
	public boolean moveWest() {
		return move(-1, 0);
	}

	@Override
	public boolean moveEast() {
		return move(1, 0);
	}
	
	private boolean move(int x, int y) {
		Position position = perso.getPosition();
		if (tryAndMove(null, position, x, y)) {
			updatePersoPosition(position, x, y);
		}
		return true;
	}
	
	private boolean tryAndMove(MapElement nextElement, Position position, int x, int y) {
		if ((nextElement = map.getElement(position.x + x, position.y + y)) == null) {
			return false;
		} else {
			return moveToElement(map.getElement(position.x, position.y), nextElement);
		}
	}
	
	private boolean moveToElement(MapElement currentElement, MapElement nextElement) {
		boolean moved = false;
		if ((moved = nextElement.enter()) == true) currentElement.leave();		
		return moved;
	}
	
	private void updatePersoPosition(Position position, int x, int y) {
		position.x += x;
		position.y += y;
	}
}
