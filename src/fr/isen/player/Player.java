package fr.isen.player;

import java.awt.Image;

import fr.isen.display.Drawable;
import fr.isen.utils.R;

public class Player implements Drawable {
	
	private Position position = null;
	
	public Player() {
		position = new Position();
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	@Override
	public Image getImage() {
		return R.returnImage("./player.png");
	}	

}
