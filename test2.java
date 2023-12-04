package test;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
class test2{
	public static class Player
	{
		public String name;
	    public int shooting;
	    public int passing;
	    public int defense;
	    public int speed;
	};
    public static void main(String[] args) {
    	Scanner scanMan = new Scanner(System.in);
		int numPlayers = promptPlayerCount(scanMan);
		Player[]draftClass = new Player[numPlayers];
		int nameCounter = 200;
		for(int i = 0; i<numPlayers; i++) {
			draftClass[i] = playerCreate("Player #"+String.valueOf(nameCounter));
			nameCounter++;
		}
		displayPlayers(draftClass);
		while(true) {
			String userStatSort = promptPlayerStat(scanMan);
			String userAlgo = promptPlayerSort(scanMan);
			switch(userAlgo) { //TODO: add algorithm function to switch case
				case "bubble":
					bubbleSort(draftClass, userStatSort);
					break;
			}
			String userContinue = promptExit(scanMan);
			if(userContinue.equals("n")) {
				System.out.println("Enjoy!");
				break;
			}
		}
		
    }
    
    
    
    public static Player playerCreate(String name) {
    	Random rand = new Random();
    	Player newPlayer = new Player();
    	newPlayer.name = name;
    	newPlayer.shooting = rand.nextInt(20);
    	newPlayer.passing = rand.nextInt(20);
    	newPlayer.defense = rand.nextInt(20);
    	newPlayer.speed = rand.nextInt(20);
    	return newPlayer;
    }
    
    public static int getStat(String stat, Player player) {
    	int desiredStat=0;
    	switch(stat) {
			case "shooting":
				desiredStat = player.shooting;
				break;
			case "passing":
				desiredStat = player.passing;
				break;
			case "defense":
				desiredStat = player.defense;
				break;
			case "speed":
				desiredStat = player.speed;
				break;
	    };
    	return desiredStat;
    }
    
    public static int promptPlayerCount(Scanner scanMan) {
    	int numPlayers = 0;
    	while(true) {
	    	System.out.print("How many players would you like to create? 10-100"); //custom character?
	    	numPlayers = scanMan.nextInt();
	    	if(numPlayers >= 10 && numPlayers <= 100) {
	    		break;
	    	}
	    	System.out.println("ERROR: Did you even read the prompt lil bro?");
    	}
    	return numPlayers;
    }
    
    public static String promptPlayerStat(Scanner scanMan) {
    	boolean loopRunner = true;
    	String statDesire ="";
    	while(loopRunner) {
			System.out.println("What stat would you like to sort by? shooting/defense/passing/speed");
			statDesire = scanMan.next().toLowerCase();
			switch(statDesire) {
				case "shooting":
					loopRunner = false;
					break;
				case "passing":
					loopRunner = false;
					break;
				case "defense":
					loopRunner = false;
					break;
				case "speed":
					loopRunner = false;
					break;
				default:
					System.out.println("ERROR: try again with ur spelling lil bro");
					break;
			};
    	}
    	return statDesire;
    }
    
    public static String promptPlayerSort(Scanner scanMan) {
    	boolean loopRunner = true;
    	String sortDesire = "";
	    	while(loopRunner) {
	    	System.out.println("What Sorting Algorithm would you like to use?: Bubble");
			sortDesire = scanMan.next().toLowerCase();
			switch(sortDesire) { //TODO: Add your algorithm name to the switch case
				case "bubble":
					loopRunner = false;
					break;
				default:
					System.out.println("ERROR: try again with ur spelling lil bro");
					break;
			};
    	
    	}
	    	return sortDesire;
    }
    public static String promptExit(Scanner scanMan) {
    	boolean loopRunner = true;
    	String userNeeds = "";
    	while(loopRunner) {
	    	System.out.println("Do you want to sort again? y/n");
			userNeeds = scanMan.next().toLowerCase();
			if(userNeeds.equals("y") || userNeeds.equals("n")) {
				loopRunner = false;
			}
			else {
				System.out.println("ERROR: Try Again");
			}
    	}
    	return userNeeds;
    }
    public static void displayPlayers(Player[]draftClass) {
    	int numPlayers = draftClass.length;
    	for(int i = 0; i<numPlayers; i++) {
			System.out.println(draftClass[i].name);
			System.out.println("Shooting: " + draftClass[i].shooting);
			System.out.println("Passing: " + draftClass[i].passing);
			System.out.println("Speed: " + draftClass[i].speed);
			System.out.println("Defense: "  + draftClass[i].defense);
			System.out.println("----------------------------------");
		}
    }
    
    
    
    //TODO: Create your on algorithm functions with same arguments as bubbleSort
    public static void bubbleSort(Player[]draftClass, String stat) {
    	int steps = 0;
    	while(true) {
    		steps++;
    		

    		break;
    	}
    	
    	displayPlayers(draftClass);
    	System.out.println("Number of steps " + steps);
    }
    
}