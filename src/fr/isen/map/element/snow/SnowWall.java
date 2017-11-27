package fr.isen.map.element.snow;

import java.awt.Image;

import fr.isen.map.element.TileModel;
import fr.isen.map.element.Wall;
import fr.isen.utils.R;

/**
 * 
 * @author legra
 *
 * Un �l�ment de mur pour une carte de type zone enneign�e.
 */
public class SnowWall extends Wall {
	
	/**
	 * Constructeur.
	 */
	public SnowWall() {
		this.model = new TileModel("./snow/wall.png");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean enter() {
		this.updateModelImagePath("./snow/wall-active.png");
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void leave() {
		return;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image getImage() {
		return R.returnImage(this.model.getImagePath());
	}

}
