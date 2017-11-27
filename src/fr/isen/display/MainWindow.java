package fr.isen.display;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import fr.isen.gameplay.KeyboardListener;
import fr.isen.utils.Constants;
import fr.isen.utils.Helper;
import fr.isen.world.RPGWorldManager;

/**
 * @author legra
 *
 *
 * Fenêtre principale de l'application.
 */
@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	private RPGWorldManager world = null;
	
    JLabel label;

    /**
     * Constructeur.
     * @param worldManager RPGWorldManager Manager du jeu en cours.
     */
    public MainWindow(RPGWorldManager worldManager) {
        super("2D RPG");
        
        this.world = worldManager;
        
        this.setLayout(new BorderLayout());
        MainPanel panel = new MainPanel(world);
        this.getContentPane().add(panel, BorderLayout.CENTER);
        
		addKeyListener(new KeyboardListener(this.world));

		setSize(
        	Helper.indexToPixel(Constants.MAP_WIDTH), 
        	Helper.indexToPixel(Constants.MAP_HEIGHT + 1)
        );
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		setVisible(true);
    }
    
}
