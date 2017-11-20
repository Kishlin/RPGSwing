package fr.isen.map.element.town;

import fr.isen.map.element.Ground;
import fr.isen.map.element.MapElementFactory;
import fr.isen.map.element.Wall;

public class TownFactory extends MapElementFactory {

	private static TownFactory instance = null;
	
	private TownFactory() { }
	
	public static TownFactory getInstance() {
		if (instance == null) instance = new TownFactory();
		
		return instance;
	}
	
	@Override
	public Wall getWall() {
		return new TownWall();
	}

	@Override
	public Ground getGround() {
		return new TownGround();
	}

}
