package fr.isen.map;

import java.util.List;

import fr.isen.map.element.MapElement;

public class RPGMap {
	
	private int width;
	
	private int height;
	
	private List<List<MapElement>> map = null;
	
	public RPGMap(List<List<MapElement>> tileArray) {
		this.map = tileArray;
		this.width = tileArray.size();
		this.height = (tileArray.size() > 0) ? tileArray.get(0).size() : 0;
	}
	
	public MapElement getElement(int x, int y) {
		try {
			return this.map.get(y).get(x);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
