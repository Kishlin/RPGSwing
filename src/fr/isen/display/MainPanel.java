package fr.isen.display;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import fr.isen.map.RPGMap;
import fr.isen.map.element.MapElement;
import fr.isen.player.Player;
import fr.isen.player.Position;
import fr.isen.utils.Constants;
import fr.isen.utils.Helper;
import fr.isen.world.RPGWorldManager;

/**
 * MainPanel
 * @author legra
 *
 * S'occupe de l'affichage du terrain de jeu et du joueur.
 */
@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	private Player player = null;
	
	private RPGMap map = null;
	
	/**
	 * Constructeur.
	 * @param world RPGWorldManager Le manager du jeu en cours.
	 */
	public MainPanel(RPGWorldManager world) {
		player = world.getPlayer();
		map = world.getMap();
		
		player.setView(this);
		bindMap();
	}
	
	/**
	 * Abonne l'affichage aux différents éléments de la carte, pour être prévenu quand le terrain doit être à nouveau dessiné.
	 */
	private void bindMap() {
    	for(int i = 0; i < Constants.MAP_WIDTH; i++) {
    		for(int j = 0; j < Constants.MAP_HEIGHT; j++) {
    			MapElement element = map.getMapElement(i, j);
    			element.setView(this);
    		}
    	}
	}

	/**
	 * {@inheritDoc}
	 */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        this.paintMap(graphics);
        this.paintPlayer(graphics);
    }

    /**
     * Peint la carte dans la fenêtre.
     * @param graphics Graphics Contexte de dessin.
     */
    private void paintMap(Graphics graphics) {
    	for(int i = 0; i < Constants.MAP_WIDTH; i++) {
    		for(int j = 0; j < Constants.MAP_HEIGHT; j++) {
    			MapElement element = map.getMapElement(i, j);
    			paintMapElement(graphics, element, i, j);
    		}
    	}
    }
    
    /**
     * Peint un élément de la carte à sa position sur le terrain.
     * @param graphics Graphics   Contexte de dessin.
     * @param element  MapElement Element à peindre.
     * @param i        int        Position horizontale.
     * @param j        int        Position verticale.
     */
    private void paintMapElement(Graphics graphics, MapElement element, int i, int j) {
    	Image image = element.getImage();
    	int offsetX = Helper.indexToPixel(i);
    	int offsetY = Helper.indexToPixel(j);
    	
    	graphics.drawImage(image, offsetX, offsetY, null);
    }
    
    /**
     * Peint le joueur à sa position sur le terrain.
     * @param graphics Graphics Contexte de dessin.
     */
    private void paintPlayer(Graphics graphics) {
    	Position position = player.getPosition();
    	Image playerImage = player.getImage();
    	int offsetX = Helper.indexToPixel(position.x);
    	int offsetY = Helper.indexToPixel(position.y);
    	
    	graphics.drawImage(playerImage, offsetX, offsetY, null);
    }
    
}
