package main.gui;

import java.util.ArrayList;
import java.util.Random;

public class Math {
	
	public static int[] division(int difficulty) {
			
		Random randy = new Random();
		int boundryStart;
		int boundryEnd;
		int randomNum;
		int[] results = new int[3];
		ArrayList<Integer> resultList = new ArrayList<Integer>();
			
		if(difficulty == 0){
			boundryStart = 0;
			boundryEnd = 100;
			
			do{
				
				//Es wird nur eine Zahl ausgewaehlt, die durch 2 und 5 teilbar ist
				do{
					randomNum = randy.nextInt(boundryEnd - boundryStart) + boundryStart;
				}while(randomNum % 2 != 0 && randomNum % 5 != 0);
				
				//Die ArrayList wird mit allen moeglichen ganzzahligen Teilern der Zufallszahl gefuellt
				for(int x = 1; x <= randomNum; x++){
					if(randomNum % x == 0) resultList.add(x);
				}
				
				//Es werden nur Zahlen mit mehr als 4 Teilern genommen
				if(resultList.size() > 4){
					int randomResult = randy.nextInt(resultList.size() - 2) + 1; 	//Es werden der kleinste und groesste Teiler ignoriert, welche immer 1 und die Zahl selber sind
					results[0] = randomNum;											//z.B. bei 5 Teilern gibt es in der ArrayList Elemente von 0-4. Subtrahiert man 2 von der Anzahl der Elemente ergibt dies eine Zufallszahl zwischen 0 und 2. Addiert man danach 1 geht es von 1-3.
					results[1] = resultList.get(randomResult);
					results[2] = results[0] / results[1];
					break;
				}else resultList.clear();
				
			}while(resultList.size() < 1);
				
		}else{
			boundryStart = 50;
			boundryEnd = 500;
			
			do{
				//Es wird nur eine Zahl ausgewaehlt, die nicht durch 2 und 5 teilbar ist
				do{
					randomNum = randy.nextInt(boundryEnd - boundryStart) + boundryStart;
				}while(randomNum % 2 == 0 || randomNum % 5 == 0);
				
				//Die ArrayList wird mit allen moeglichen ganzzahligen Teilern der Zufallszahl gefuellt
				for(int x = 1; x <= randomNum; x++){
					if(randomNum % x == 0) resultList.add(x);
				}
				
				//Es werden nur Zahlen mit mehr als 4 Teilern genommen
				if(resultList.size() > 4){
					int randomResult = randy.nextInt(resultList.size() - 2) + 1; 	//Es werden der kleinste und groesste Teiler ignoriert, welche immer 1 und die Zahl selber sind
					results[0] = randomNum;											//z.B. bei 5 Teilern gibt es in der ArrayList Elemente von 0-4. Subtrahiert man 2 von der Anzahl der Elemente ergibt dies eine Zufallszahl zwischen 0 und 2. Addiert man danach 1 geht es von 1-3.
					results[1] = resultList.get(randomResult);
					results[2] = results[0] / results[1];
					break;
				}else resultList.clear();			
				
			}while(resultList.size() < 1);
			
		}
		return results;
		
	}
	
	public static int[] fraction(int difficulty){
		
		Random randy = new Random();
		int[] results = new int[4];
		
		if(difficulty == 0){
			
			int fractionSave = 0;
			int randomNumBot;
			int randomNumTop = randy.nextInt(3) + 2;	//Bereich 2 - 5
			int randomNumMult;

			do{
				randomNumMult = randy.nextInt(4) + 2; 	//Zahlen: 2 - 6
				randomNumBot = randy.nextInt(4) + 4; 	//Zahlen: 4 - 8
			}while(randomNumBot == randomNumMult);	//Es werden nur gerade Zahlen genommen
			
			ArrayList<Integer> fraction1 = new ArrayList<Integer>();
			ArrayList<Integer> fraction2 = new ArrayList<Integer>();
			
			//Es werden alle Teiler der ersten Zahl ermittelt
			for(int x = 1; x <= randomNumMult; x++){
				if (randomNumMult % x == 0) fraction1.add(x);
			}
			//Es werden alle Teiler der zweiten Zahl ermittelt
			for(int x = 1; x <= randomNumBot; x++){
				if (randomNumBot % x == 0) fraction2.add(x);
			}
				
			//Hier wird der groesste gemeinsame Teiler der beiden Zahlen herausgefunden
			for(int x = 0; x < fraction1.size(); x++){
				for(int y = 0; y < fraction2.size(); y++){
					if(fraction1.get(x) == fraction2.get(y) && fraction1.get(x) > fractionSave) fractionSave = fraction1.get(x); 
				}
			}
			
			results[0] = randomNumTop * randomNumMult; //obere Zahl des Bruches
			results[1] = randomNumBot * randomNumTop; //untere Zahl des Bruches
			results[2] = randomNumMult / fractionSave;
			results[3] = randomNumBot / fractionSave;
			
		}else{
			int fractionSave = 0;
			int randomNumBot;
			int randomNumMult;
			int randomNumTop = randy.nextInt(6) + 3;	//Bereich 3 - 9
			
			do{
				randomNumBot = randy.nextInt(16) + 7; 	//Bereich 7 - 23
				randomNumMult = randy.nextInt(6) + 5; 	//Zufallszahl im Bereich 5 - 11, kann variiert werden. Je hoeher die Zahl, desto mehr Brueche >1 entstehen
			}while(randomNumMult % 10 == 0 || randomNumBot % 10 == 0 || randomNumBot / randomNumMult == 1);	
			//10 und 20 werden rausgefiltert, sowie Ergebnisse, bei denen beide Zahlen die gleiche sind
			
			ArrayList<Integer> fraction1 = new ArrayList<Integer>();
			ArrayList<Integer> fraction2 = new ArrayList<Integer>();
			
			//Es werden alle Teiler der ersten Zahl ermittelt
			for(int x = 1; x <= randomNumMult; x++){
				if (randomNumMult % x == 0) fraction1.add(x);
			}
			 //Es werden alle Teiler der zweiten Zahl ermittelt
			for(int x = 1; x <= randomNumBot; x++){
				if (randomNumBot % x == 0) fraction2.add(x);
			}
			
			//Hier wird der groesste gemeinsame Teiler der beiden Zahlen herausgefunden
			for(int x = 0; x < fraction1.size(); x++){
				for(int y = 0; y < fraction2.size(); y++){
					if(fraction1.get(x) == fraction2.get(y) && fraction1.get(x) > fractionSave) fractionSave = fraction1.get(x); 
				}
			}
			
			results[0] = randomNumTop * randomNumMult; //obere Zahl des Bruches
			results[1] = randomNumBot * randomNumTop; //untere Zahl des Bruches
			results[2] = randomNumMult / fractionSave;
			results[3] = randomNumBot / fractionSave;
			
		}
		return results;
		
	}
	
	public static int[] percent(int difficulty){
		
		Random randy = new Random();
		int[] results = new int[4];
		results[3] = randy.nextInt(3);
		int randomPercent;
		int randomNum;
		int result;
		
		if(difficulty == 0){
			do{
				do{
					randomPercent = randy.nextInt(97) + 2;
				}while(randomPercent % 2 != 0 || randomPercent % 5 != 0);
				randomNum = randy.nextInt(499) + 1;
			}while((randomNum * randomPercent) % 100 != 0);
			
			result = randomNum * randomPercent / 100;
			
			if (results[3] == 0) {					
				results[0] = randomPercent;
				results[1] = randomNum;
				results[2] = result;
			}
			if (results[3] == 1) {
				results[0] = result;
				results[1] = randomNum;
				results[2] = randomPercent;
			}
			if (results[3] == 2) {					
				results[0] = randomPercent;
				results[1] = result;
				results[2] = randomNum;
			}
		}else{
			do{
				do{
					randomPercent = randy.nextInt(97) + 2;
				}while(randomPercent % 2 == 0 || randomPercent % 5 == 0);
				randomNum = randy.nextInt(999) + 1;
			}while(((randomNum * randomPercent) % 100) != 0);
			
			result = randomNum * randomPercent / 100;
			
			if(results[3] == 0){					
				results[0] = randomPercent;
				results[1] = randomNum;
				results[2] = result;	
			}if(results[3] == 1){
				results[0] = result;
				results[1] = randomNum;
				results[2] = randomPercent;	
			}if (results[3] == 2) {				
				results[0] = randomPercent;
				results[1] = result;
				results[2] = randomNum;
			}
		}
		
	return results;	
	}

}
