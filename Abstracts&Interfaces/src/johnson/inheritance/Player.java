package johnson.inheritance;

public interface Player {
	String getName(); //Returns first and last name
	String getFirstName(); //Returns first name
	String getLastName(); //Returns last name
	int getNumber(); //Returns player number
	void displayPlayerInfo(); //Displays everything about the player
	
	void setFirstName(String firstName); //Sets first name
	void setLastName(String firstName); //Sets last name
	void setNumber(int number); //Sets player number
	void setPlayerInfo(); //Conversational input for everything about the player
}
