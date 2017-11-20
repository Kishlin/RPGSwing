package fr.isen.gameplay;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {
	
	private Movable movable = null;
	
	public KeyboardListener(Movable movable) {
		this.movable = movable;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());

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

	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
}
