package model;

import java.util.Random;
import java.util.Scanner;

public class die {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
        die dice = new die();
        
		while(true) {
			dice.draw();
			System.out.println("Do you want to continue? (Type no to stop the program!)");
			String input = scanner.nextLine();
	         if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
	             System.out.println("Come Again!");
	             scanner.close();
	             return;
	         }
		}
		
	}
	
	private void draw() {
		int ctr;
		
		Scanner dice = new Scanner(System.in);
		Random first = new Random();
		
		System.out.println("Number of sides: ");
		int sides = dice.nextInt();
		System.out.println("Number of rolls: ");
		int rolls = dice.nextInt();
		
		for(ctr = 0; ctr < rolls; ++ctr) {
			int rollDie = ctr + 1;
			int firstDie = first.nextInt(sides);
			++rollDie;
			System.out.println("The die rolled on a " + firstDie);
		}
	}
}



