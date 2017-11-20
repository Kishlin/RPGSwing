package fr.isen.display;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import fr.isen.gameplay.KeyboardListener;
import fr.isen.utils.Helper;
import fr.isen.world.RPGWorldManager;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	private RPGWorldManager world = null;
	
    JLabel label;

    public MainWindow(RPGWorldManager world) {
        super("2D RPG");
        
        this.world = world;
        
        this.setLayout(new BorderLayout());
        MapPanel panel = new MapPanel(world);
        this.getContentPane().add(panel, BorderLayout.CENTER);
        
        setSize(
        	Helper.indexToPixel(this.world.getMap().getWidth()), 
        	Helper.indexToPixel(this.world.getMap().getHeight() + 1)
        );
        
		addKeyListener(new KeyboardListener(this.world));
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		setVisible(true);
    }
    
}
