package fr.isen.map.element.town;

import java.awt.Image;

import fr.isen.map.element.Ground;
import fr.isen.map.element.TileModel;
import fr.isen.utils.R;

/**
 * 
 * @author legra
 *
 * Element de sol pour une carte de type ville.
 */
public class TownGround extends Ground {

	/**
	 * Constructeur.
	 */
	public TownGround() {
		this.model = new TileModel("./town/ground.png");
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean enter() {
		return true;
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
