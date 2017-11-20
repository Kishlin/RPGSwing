package fr.isen;

import fr.isen.display.MainWindow;
import fr.isen.map.RPGMap;
import fr.isen.map.RPGMapBuilder;
import fr.isen.player.Player;
import fr.isen.utils.Constants;
import fr.isen.world.RPGWorldManager;
import fr.isen.map.element.town.TownFactory;

public class GameApp {
	
	public static void main(String[] args) {
		Player player = new Player();
		RPGMap map = (new RPGMapBuilder())
			.setSize(Constants.MAP_WIDTH, Constants.MAP_HEIGHT)
			.setFactory(TownFactory.getInstance())
			.build()
		;
		
		RPGWorldManager world = new RPGWorldManager(map, player);
		
		new MainWindow(world);
	}
	
}
