import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 * Contains main.
 * Responsibilities:
 * - Reading in user input (difficulty, and the moves the player wants to make)
 * - Generating the graph
 * - Generating the player
 * - Generating the UI for the main menu
 * - Generating the UI for the maze
 * @author 
 *
 */
public class MazeMain {
    public static void main(String[] args)
    {
    	Scanner console = new Scanner(System.in);
    	
    	//Create the main menu
    	MazeGraph maze = null;
    	
    	MazeMenu mazeMenu = new MazeMenu(maze);
    	System.out.println("Welcome to the ultimate maze!");
    	System.out.println("Please enter difficutly: ");

    	String input = console.nextLine();
    	   	
    	if (input.equals("easy")) {
    		maze = new MazeGraph(1);
    	} else if (input.equals("medium")) {
    		maze = new MazeGraph(2);
    	} else if (input.equals("hard")) {
    		maze = new MazeGraph(3);
    	} else {
    		maze = new MazeGraph(4);
    	}
    	
    	System.out.println("Please enter player name: ");
    	input = console.nextLine();
    	Player player = new Player(input, maze);
    	
    	//Start the maze game
    	//while (true) {
    	    MazeUI mazeUI = new MazeUI(maze, player);
    	    mazeUI.displayMaze();
    	    //Read move input
    	    int action = 0;
    		//KeyInput keyInput = new KeyInput();
    	   
    	   //System.out.println("Action: " + action);

    	    player.move(action);
    	    //System.out.println("");
    	//}
    	
    }
}
