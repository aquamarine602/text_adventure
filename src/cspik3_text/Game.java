package cspik3_text;

import java.util.Scanner;
import static java.lang.System.out;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		game(input);
	}
	
	public static void game(Scanner input) {
		
		boolean box = false;
		boolean lamp = false;
		boolean bulb = false;
		boolean hammer = false;
		boolean tile_shard = false;
		boolean stool = false;
		boolean paper = false;
		boolean wires = false;

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
		
		String location = room_center(lamp, box);
		out.println(location);
		
		
		
	}
	
	public static int room_count = 0;
	public static String room_center(boolean lamp, boolean box) {
		String words = "";
		
		words = "\n\nYou are in the center of a cold\n"
				+ "and damp room. The shape of the room\n"
				+ "seems to be a perfect square,"
				+ "though the room itself isn't very"
				+ "large. There are no doors, there are\n"
				+ "no windows.\n\n";
		
		if (lamp == false) {
			words = words + 
				"There is a lamp dangling from the ceiling,\n"
				+ "inside the lamp, there is a light bulb.\n"
				+ "the ceiling is crumbling around the hinges\n"
				+ "of the lamp.\n\n"
				+ " .=====.\r\n"
				+ "   |_|\r\n"
				+ "   | |\r\n"
				+ "(-------)\r\n"
				+ "(  ( )  )\n\n";
			
		}
		
		if (box == false) {
			words = words +
				"There is a small box sitting in the\n"
				+ "center of the room.";
		}
		
		return words;
		
	}

}
