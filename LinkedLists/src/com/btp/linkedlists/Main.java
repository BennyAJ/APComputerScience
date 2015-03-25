package com.btp.linkedlists;

public class Main {

	public static void main(String[] args) {
		//Single Linked CD Test
		LinkedCD tempCD;
		LinkedCD firstCD = new LinkedCD("The Jimmies", "Ducks");
		firstCD.setNextNode(new LinkedCD("Ratatat", "Classics"));
		tempCD = (LinkedCD) firstCD.getNextNode();
		tempCD.setNextNode(new LinkedCD("Panic at the Disco", "A Fever You Can't Sweat Out"));
		tempCD = (LinkedCD) tempCD.getNextNode();
		tempCD.setNextNode(new LinkedCD("Bloc Party", "Four"));
		tempCD = (LinkedCD) tempCD.getNextNode();
		tempCD.setNextNode(new LinkedCD("The Zolas", "Ancient Mars"));
		
		firstCD.printList();
		firstCD.removeNodeFromList();
		System.out.println("\nREMOVED CD FROM END");
		firstCD.printList();
		
		firstCD.addNodeToList(new LinkedCD("Bleachers", "Strange Desire"));
		System.out.println("\nADDED CD TO END");
		firstCD.printList();
		
		tempCD = new LinkedCD("The Strokes", "Is This It");
		firstCD.getNextNode().insertNodeAfter(tempCD);
		System.out.println("\nINSERTED CD");
		firstCD.printList();
	}

}
