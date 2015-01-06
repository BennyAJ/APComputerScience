package johnson.inheritance;

public abstract class Fielder extends Hitter {
	private String position; //Holds field position
	
	public Fielder() {
		//This constructor is unneeded since it implicitly inherits from Hitter
		//Position is set differently in PositionPlayer and Pitcher so it doesn't
		//need to be set here
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void displayPlayerInfo() {
		super.displayPlayerInfo(); //Calls the display info method from hitter
		System.out.println("He plays " + position); //Adds on his position
	}
	
	//No need for setPlayerInfo since the position doesn't need to be set
	//inside of the abstract Fielder. PositionPlayer and Pitcher inherit
	//setPlayerInfo directly
}
