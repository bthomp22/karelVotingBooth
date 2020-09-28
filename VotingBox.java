import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			checkAndClear();
		}
		
				
	}
	
	//this is to clear both sides if no beeper is detected in the middle or to just move on
	public void checkAndClear() {
		if (noBeepersPresent()) {
			
			turnLeft();
			move();
			checkSide();
			move();
			checkSide();
			afterSides();
			
		} else {
			move();
		}
	}
	
		
//this checks a side to see if there is a beeper that needs to be removed

	public void checkSide() {
		if (beepersPresent()) {
			while(beepersPresent()){
				pickBeeper();
			}
			turnAround();
			move();
		} else {
			turnAround();
			move();
		}
	}


// this is to start karel in the right direction after clearing a side
	public void afterSides() {
		turnRight();
		move();

	}
}
