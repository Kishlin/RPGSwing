package fr.isen.display;

import java.awt.Graphics;

import javax.swing.JPanel;

import fr.isen.map.RPGMap;
import fr.isen.map.element.MapElement;
import fr.isen.player.Player;
import fr.isen.player.Position;
import fr.isen.utils.Helper;
import fr.isen.world.RPGWorldManager;

@SuppressWarnings("serial")
public class MapPanel extends JPanel {

	private RPGMap map = null;
	
	private Player player = null;
	
	public MapPanel(RPGWorldManager world) {
		this.player = world.getPerso();
		this.map = world.getMap();
	}

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
    
        drawMap(graphics);
        drawPlayer(graphics);
    }
    
    private void drawPlayer(Graphics graphics) {
        Position position = player.getPosition();
        graphics.drawImage(
        	player.getImage(),
        	Helper.indexToPixel(position.x), 
        	Helper.indexToPixel(position.y), 
        	null
        );
    }
    
    private void drawMap(Graphics graphics) {
        for(int i = 0; i < map.getWidth(); i++) {
        	for(int j = 0; j < map.getHeight(); j++) {
        		drawMapElement(graphics, i, j);
        	}
        }
    }
    
    private void drawMapElement(Graphics graphics, int i, int j) {
		MapElement e = map.getElement(i, j);
		graphics.drawImage(
    		e.getImage(), 
    		Helper.indexToPixel(i), 
    		Helper.indexToPixel(j), 
    		null
    	);
    }
}
