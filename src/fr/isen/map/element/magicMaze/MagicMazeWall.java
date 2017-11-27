package fr.isen.map.element.magicMaze;

import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import fr.isen.map.element.TileModel;
import fr.isen.map.element.Wall;
import fr.isen.utils.R;

/**
 * 
 * @author legra
 *
 * Un élément de mur pour une carte de type labyrinthe magique.
 */
public class MagicMazeWall extends Wall {

	Timer timer = null;
	
	/**
	 * Constructeur.
	 */
	public MagicMazeWall() {
		this.model = new TileModel("./maze/wall.png");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean enter() {
		this.updateModelImagePath("./maze/wall-active.png");

		if(timer != null) resetTimer();
		scheduleTimer();
		
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

	/**
	 * Réinitialise le timer.
	 */
	private void resetTimer() {
		timer.cancel();
		timer.purge();
		timer = null;
	}
	
	/**
	 * Planifie l'extinction du mur.
	 */
	private void scheduleTimer() {
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				updateModelImagePath("./maze/wall.png");
			}
		}, 3000);
	}

}
