package main.gui;

import java.util.Random;

public class Select {

	public static void selectTask (boolean radioButton,boolean division,boolean fraction,boolean percent,TaskGUI task) {
		
		Random randy = new Random();
		int difficulty;
		int counter;
		
		if (radioButton) {
			difficulty = 0;
		}
		else {
			difficulty = 1;
		}
			
		do {
			counter = 0;
			int randomChoice = randy.nextInt(3);
			
			if(randomChoice == 0){
				if(division){
					counter++;
					task.divisionGUI(Math.division(difficulty));				
				}
			}
			if(randomChoice == 1){
				if(fraction){
					counter++;
					task.fractionGUI(Math.fraction(difficulty));
				}
			}
			else {
				if(percent){
					counter++;
					task.percentGUI(Math.percent(difficulty));
				}
			}
		} while(counter < 1);	
	}	
}
