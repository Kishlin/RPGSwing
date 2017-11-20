package fr.isen.map.element;

import fr.isen.display.Drawable;

public abstract class MapElement implements Drawable {
	
	public abstract boolean enter();
	
	public abstract void leave();
	
}
