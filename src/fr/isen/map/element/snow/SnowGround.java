package fr.isen.map.element.snow;

import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import fr.isen.map.element.Ground;
import fr.isen.map.element.TileModel;
import fr.isen.utils.R;

/**
 * 
 * @author legra
 *
 * Element de sol pour une carte de type zone enneigée.
 */
public class SnowGround extends Ground {
	
	Timer timer = null;
	
	/**
	 * Constructeur.
	 */
	public SnowGround() {
		this.model = new TileModel("./snow/ground.png");
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
		this.updateModelImagePath("./snow/ground-active.png");
		
		if(timer != null) resetTimer();
		scheduleTimer();
		
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
	 * Réinitialise le timer pour le compteur.
	 */
	private void resetTimer() {
		timer.cancel();
		timer.purge();
		timer = null;
	}
	
	/**
	 * Planifie le retrait des traces de pas sur le sol.
	 */
	private void scheduleTimer() {
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				updateModelImagePath("./snow/ground.png");
			}
		}, 3000);
	}

}
