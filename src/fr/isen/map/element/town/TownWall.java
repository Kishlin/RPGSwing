package fr.isen.map.element.town;

import java.awt.Image;

import fr.isen.map.element.TileModel;
import fr.isen.map.element.Wall;
import fr.isen.utils.R;

/**
 * 
 * @author legra
 *
 * Un élément de mur pour une carte de type ville.
 */
public class TownWall extends Wall {

	/**
	 * Constructeur.
	 */
	public TownWall() {
		this.model = new TileModel("./town/wall.png");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image getImage() {
		return R.returnImage(this.model.getImagePath());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean enter() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void leave() {
		return;
	}
	
}
