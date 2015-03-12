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
	
	public void setInfo() {
		artist = InputManager.getStringInput("Input the artist of the CD");
		title = InputManager.getStringInput("Input the title of the CD");
	}
	
	@Override
	public void printInfo() {
		System.out.println(title + " by " + artist);
	}
}
