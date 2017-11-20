package fr.isen.map.element.town;

import java.awt.Image;

import fr.isen.map.element.Ground;
import fr.isen.utils.R;

public class TownGround extends Ground {

	@Override
	public boolean enter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage() {
		return R.returnImage("./ground.png");
	}

}
