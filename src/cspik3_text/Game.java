package cspik3_text;

import java.util.Scanner;
import static java.lang.System.out;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		game(input);
	}
	
	public static void game(Scanner input) {
		
		// checks if items are in inventory
		boolean box = false;
		boolean lamp = false;
		boolean bulb = false;
		boolean hammer = false;
		boolean tile_shard = false;
		boolean stool = false;
		boolean paper = false;
		boolean wires = false;
		
		// checks if items are present in room
		boolean bulb_present = true;
		boolean hammer_present = false;
		boolean tile_shard_present = false;
		boolean stool_present = false;
		boolean paper_present = false;
		boolean wires_present = false;
		
		// string for users location- starting location
		String location = room_center(lamp, box, bulb_present, wires_present);
		
		// introduces character to game
		out.println(" .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------. \r\n" + 
				"| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\r\n" + 
				"| |  _________   | || |    _______   | || |     ______   | || |      __      | || |   ______     | || |  _________   | || |              | |\r\n" + 
				"| | |_   ___  |  | || |   /  ___  |  | || |   .' ___  |  | || |     /  \\     | || |  |_   __ \\   | || | |_   ___  |  | || |      _       | |\r\n" + 
				"| |   | |_  \\_|  | || |  |  (__ \\_|  | || |  / .'   \\_|  | || |    / /\\ \\    | || |    | |__) |  | || |   | |_  \\_|  | || |     | |      | |\r\n" + 
				"| |   |  _|  _   | || |   '.___`-.   | || |  | |         | || |   / ____ \\   | || |    |  ___/   | || |   |  _|  _   | || |     | |      | |\r\n" + 
				"| |  _| |___/ |  | || |  |`\\____) |  | || |  \\ `.___.'\\  | || | _/ /    \\ \\_ | || |   _| |_      | || |  _| |___/ |  | || |     | |      | |\r\n" + 
				"| | |_________|  | || |  |_______.'  | || |   `._____.'  | || ||____|  |____|| || |  |_____|     | || | |_________|  | || |     |_|      | |\r\n" + 
				"| |              | || |              | || |              | || |              | || |              | || |              | || |     (_)      | |\r\n" + 
				"| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\r\n" + 
				" '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' ");
		out.println("\n\nYou wake up in a dark room.");
		out.println("The last memory you have is of\nyour head hitting your pillow.");
		
		// tutorial
		out.println("Would you like to hear the tutorial?");
		String tutorial_ans = input.nextLine();
		boolean tutorial_an = false;
		while (tutorial_an == false) {
			if (tutorial_ans.equals("yes") || tutorial_ans.equals("y") || tutorial_ans.equals("Yes") || tutorial_ans.equals("Y") || tutorial_ans.equals("no") || tutorial_ans.equals("n") || tutorial_ans.equals("No") || tutorial_ans.equals("N")) {
				tutorial_an = true;
			} else {
				
			}
		}
		
		
		out.println("Type 'look' to study your surroundings!");
		
		
	}
	
	
	public static String room_center(boolean lamp, boolean box, boolean bulb_pres, boolean wires_pres) {
		String words = "  _   _   _   _     _   _   _   _   _   _  \r\n" + 
				" / \\ / \\ / \\ / \\   / \\ / \\ / \\ / \\ / \\ / \\ \r\n" + 
				"( R | o | o | m ) ( C | e | n | t | e | r )\r\n" + 
				" \\_/ \\_/ \\_/ \\_/   \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ ";
		
		words = words + "\n\nYou are in the center of a cold\n"
				+ "and damp room. The shape of the room\n"
				+ "seems to be a perfect square,"
				+ "though the room itself isn't very"
				+ "large. There are no doors, there are\n"
				+ "no windows.\n\n";
		
		if (lamp == false) {
			words = words + 
				"There is a lamp dangling from the ceiling.\n"
				+ "The ceiling is crumbling around the hinges\n"
				+ "of the lamp.\n\n";
			
			if (bulb_pres == true) {
				words = words +
						"Inside the lamp, there is a light bulb\n"
						+ "that is screwed in very loosely.\n\n";
				
				words = words +
						" .=====.\r\n"
						+ "   |_|\r\n"
						+ "   | |\r\n"
						+ "(-------)\r\n"
						+ "(  (o)  )\n\n";
				
			} else {
				words = words +
						" .=====.\r\n"
						+ "   |_|\r\n"
						+ "   | |\r\n"
						+ "(-------)\r\n"
						+ "(       )\n\n";
			}
			
		}
		
		if (box == false) {
			words = words +
				"There is a small box sitting in the\n"
				+ "center of the room.\n\n"
				+ "\r\n" + 
				"                      _.-+.\r\n" + 
				"                 _.-\"\"     '.\r\n" + 
				"             +:\"\"            '.\r\n" + 
				"             J \\               '.\r\n" + 
				"              L \\             _.-+\r\n" + 
				"              |  '.       _.-\"   |\r\n" + 
				"              J    \\  _.-\"       L\r\n" + 
				"               L    +\"          J\r\n" + 
				"               +    |           |\r\n" + 
				"                \\   |          .+\r\n" + 
				"                 \\  |       .-'\r\n" + 
				"                  \\ |    .-'\r\n" + 
				"                   \\| .-'\r\n" + 
				"                    +'   \n\n";
		}
		
		if (wires_pres == true) {
			words = words +
				"Wires dangle from the ceiling where\n"
				+ "the lamp use to hang.\n\n";
		}
		
		words = words +
				"To the south is one side of the room.\n"
				+ "There is a different colored tile\n"
				+ "on that wall.";
		
		return words;
		
	}

}
