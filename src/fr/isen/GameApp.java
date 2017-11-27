package fr.isen;

import fr.isen.display.MainWindow;
import fr.isen.map.RPGMap;
import fr.isen.map.RPGMapBuilder;
import fr.isen.map.element.MapElementFactory;
import fr.isen.player.Player;
import fr.isen.utils.Constants;
import fr.isen.world.RPGWorldManager;

/**
 * 
 * @author legra
 *
 * Classe de jeu.
 */
public class GameApp {
	
	private RPGWorldManager worldManager = null;
	
	/**
	 * Constructeur.
	 */
	public GameApp() {
		gameFromScracth();
		startGame();
	}
	
	/**
	 * Génère une nouvelle partie.
	 */
	public void gameFromScracth() {
		Player player = new Player();
		RPGMap map = this.generateMap(Constants.FACTORY);
	
		this.worldManager = new RPGWorldManager(player, map);
	}

	/**
	 * Lance la fenêtre principale du jeu.
	 */
	private void startGame() {
		MainWindow window = new MainWindow(this.worldManager);
		window.setVisible(true);	
	}
	
	/**
	 * Génère une carte avec la factory donnée.
	 * @param factory MapElementFactory Factory d'éléments pour la carte.
	 * @return RPGMap La carte générée.
	 */
	private RPGMap generateMap(MapElementFactory factory) {
		RPGMapBuilder builder = new RPGMapBuilder();
		
		return builder
			.setSize(Constants.MAP_WIDTH, Constants.MAP_HEIGHT)
			.setFactory(factory)
			.build()
		;
	}
	
	/**
	 * Main.
	 * @param args In-line arguments.
	 */
	public static void main(String[] args) {
		new GameApp();
	}
}
