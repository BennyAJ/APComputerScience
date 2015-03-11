package com.btp.linkedlists;

public class LinkedCD extends LinkedNode {
	private String artist;
	private String title;
	
	public LinkedCD() {
		artist = "NA";
		title = "NA";
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setInfo() {
		artist = InputManager.getStringInput("Input the artist of the CD");
		title = InputManager.getStringInput("Input the title of the CD");
	}
	
	@Override
	public void printInfo() {
		System.out.println(title + " by " + artist);
	}
}
