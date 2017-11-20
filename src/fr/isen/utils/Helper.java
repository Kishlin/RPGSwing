package fr.isen.utils;

public class Helper {

	private Helper() { }
	
	public static int indexToPixel(int index) {
		int pixel = Constants.TILE_SIZE;
		return index * pixel;
	}
	
}
