/**
 * Scoreboard of 13 rounds for the yahtzee game
 * @author jarod meyer
 *
 */
public class Scoreboard {
	/**
	 * Make an array of 13 (number of rounds AND different scoretypes)
	 */
	private int[] roundScoring = new int[13];
	
	/**
	 * Initialize a scoreboard to all rounds/scoring types unused
	 */
	public Scoreboard() {
		//initialize to -1 to indicate unused scoring
		for (int index = 0; index < 13; index++) {
			roundScoring[index] = -1;
		}
	}
	
	/**
	 * A method for scoring a round.
	 * @param index the type of scoring to use
	 * @param rolls an array of the five rolls to use
	 * @return true IF that round was unused, and the size of rolls was valid
	 * return false if that index/scoring type was used already, or if rolls size != 5
	 */
	public boolean scoreRound(int index, Die[] rolls) {
		//invalid roll size
		if (rolls.length != 5) {
			System.out.println("Invalid array size!");
			return false;
		} else if (roundScoring[index] != -1) {
			//if a scoring type was used already, then invalid!
			System.out.println("Invalid: Scoring type already used!");
			return false;
		} else {
			//the different types of scoring for the dif rounds
			switch(index) {
				case 0:
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				//index not in score array (0-12 only)
				default:
					break;
					
			}
			return true;
		}
	}
	
}
