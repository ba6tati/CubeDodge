package me.ba6tati.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

	private static final long serialVersionUID = -4921205426023688012L;
	
	//promenlivi
	public Window(int width, int height, String title, Game game) {
		//JFrame e za prozorec
		//frame.neshto prenasochvame kum JFrame
		JFrame frame = new JFrame(title);
		
		//Golemina na prozoreca
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		//Buton za zatvarqne na prozoreca
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Ne mozhesh da go namalqvash ili ogolemqvash
		frame.setResizable(false);
		//Ako go nqma prozoreca shte se otvori gore vlqvo na ekrana
		//Ako e null prozoreca shte se otvori v sredata na ekrana
		frame.setLocationRelativeTo(null);
		//Dobavqme "Game.class"
		frame.add(game);
		//Dali shte se vizhda ili shte e nevidim
		frame.setVisible(true);
		//Izpulnqvame "start" metod
		game.start();
		
	}

}
