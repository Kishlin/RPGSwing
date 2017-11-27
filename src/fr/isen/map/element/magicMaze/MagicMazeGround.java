package fr.isen.map.element.magicMaze;

import java.awt.Image;

import fr.isen.map.element.Ground;
import fr.isen.map.element.TileModel;
import fr.isen.utils.R;

/**
 * 
 * @author legra
 *
 * Element de sol pour une carte de type layrinthe magique.
 */
public class MagicMazeGround extends Ground {

	/**
	 * Constructeur.
	 */
	public MagicMazeGround() {
		this.model = new TileModel("./maze/ground.png");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean enter() {
		this.updateModelImagePath("./maze/ground-active.png");
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void leave() {
		this.updateModelImagePath("./maze/ground.png");
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
