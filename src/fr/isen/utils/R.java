package fr.isen.utils;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class R {

	private static HashMap<String, Image> images = new HashMap<String, Image>();
	
	public static Image returnImage(String path) {
		if (!images.containsKey(path)) {
			URL url = ClassLoader.getSystemResource(path);
			try {
	            images.put(path, ImageIO.read(url));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
		
		return images.get(path);
	}
	
}
