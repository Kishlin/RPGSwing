package fr.isen.gameplay;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 
 * @author legra
 *
 * Classe à abonner aux évènements clavier.
 */
public class KeyboardListener implements KeyListener {
	
	private Movable movable = null;
	
	/**
	 * Constructeur.
	 * @param movable Movable Objet déplaçable avec les flèches directionnelles ou ZQSD.
	 */
	public KeyboardListener(Movable movable) {
		this.movable = movable;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void keyPressed(KeyEvent e) {
	    int key = e.getKeyCode();

	    if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_Q) {
	    	movable.moveWest();
	    }

	    if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
	    	movable.moveEast();
	    }

	    if (key == KeyEvent.VK_UP || key == KeyEvent.VK_Z) {
	    	movable.moveNorth();
	    }

	    if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
	    	movable.moveSouth();
	    }
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
}
