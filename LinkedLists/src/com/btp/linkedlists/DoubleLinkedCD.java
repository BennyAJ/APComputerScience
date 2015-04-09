package com.btp.linkedlists;

public class DoubleLinkedCD extends DoubleLinkedNode {
	private String artist;
	private String title;
	
	public DoubleLinkedCD() {
		artist = "NA";
		title = "NA";
	}
	
	public DoubleLinkedCD(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setInfo() {
		artist = InputManager.getStringInput("Input the artist of the CD");
		title = InputManager.getStringInput("Input the title of the CD");
	}
	
	public void insertNodeByArtist(DoubleLinkedCD artistNode) {
		DoubleLinkedCD tempNode = (DoubleLinkedCD) this.getFirstNode(); //Move to first node in list
		while(tempNode.getNextNode() != null 
		&& ((DoubleLinkedCD) tempNode.getNextNode()).getArtist().compareToIgnoreCase(artistNode.getArtist()) < 0) {
			tempNode = (DoubleLinkedCD) tempNode.getNextNode();
			//Iterates through list until the same artist or an artist that is later
			//or equal in the alphabet is found
		}
		while(tempNode.getNextNode() != null 
		&& ((DoubleLinkedCD) tempNode.getNextNode()).getArtist().compareToIgnoreCase(artistNode.getArtist()) == 0 
		&& ((DoubleLinkedCD) tempNode.getNextNode()).getTitle().compareToIgnoreCase(artistNode.getTitle()) < 0) {
			tempNode = (DoubleLinkedCD) tempNode.getNextNode();
			//Continue iterating for as long until a different artist is reached or
			//a title that is later or equal in the alphabet is found
		}
		
		//Determines where to insert the CD relative to the tempNode based on alphabetical order
		if(tempNode.getArtist().compareToIgnoreCase(artistNode.getArtist()) > 0) 
			tempNode.insertNodeBefore(artistNode);
		else if(tempNode.getArtist().compareToIgnoreCase(artistNode.getArtist()) < 0)
			tempNode.insertNodeAfter(artistNode);
		else if(tempNode.getTitle().compareToIgnoreCase(artistNode.getTitle()) > 0)
			tempNode.insertNodeBefore(artistNode);
		else if(tempNode.getTitle().compareToIgnoreCase(artistNode.getTitle()) <= 0)
			tempNode.insertNodeAfter(artistNode);
	}
	
	public void swapInfo(DoubleLinkedCD swapCD) {
		String tempString = swapCD.getArtist(); //Saves swap CD's artist
		swapCD.setArtist(this.getArtist()); //Moves this artist to swap CD
		setArtist(tempString); //Move swap CD's artist to this
		
		tempString = swapCD.getTitle(); //Save swap CD's title
		swapCD.setTitle(this.getTitle()); //Move this title to swap CD
		setTitle(tempString); //Move swap CD's artist to this
	}
	
	@Override
	public void printInfo() {
		System.out.println(title + " by " + artist);
	}
}
