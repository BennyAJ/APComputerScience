package com.btp.linkedlists;

public class Main {

	public static void main(String[] args) {
		//Single Linked CD Test
		LinkedCD tempCD;
		LinkedCD firstCD = new LinkedCD("The Jimmies", "Ducks");
		firstCD.addNodeToList(new LinkedCD("Ratatat", "Classics"));
		firstCD.addNodeToList(new LinkedCD("Panic at the Disco", "A Fever You Can't Sweat Out"));
		firstCD.addNodeToList(new LinkedCD("Bloc Party", "Four"));
		firstCD.addNodeToList(new LinkedCD("The Zolas", "Ancient Mars"));
		firstCD.printList();
		
		firstCD.removeNodeFromList();
		System.out.println("\nREMOVED CD FROM END");
		firstCD.printList();
		
		firstCD.addNodeToList(new LinkedCD("Bleachers", "Strange Desire"));
		System.out.println("\nADDED CD TO END");
		firstCD.printList();
		
		tempCD = new LinkedCD("The Strokes", "Is This It");
		firstCD.insertNodeAfter(tempCD);
		System.out.println("\nINSERTED CD");
		firstCD.printList();
		
		//Unsorted Double Linked CD Test
		System.out.println("\n\n\nDOUBLE LINKED LIST TEST");
		DoubleLinkedCD doubleTempCD;
		DoubleLinkedCD doubleFirstCD = new DoubleLinkedCD("The Jimmies", "Ducks");
		doubleFirstCD.addNodeToList(new DoubleLinkedCD("Ratatat", "Classics"));
		doubleFirstCD.addNodeToList(new DoubleLinkedCD("Panic at the Disco", "A Fever You Can't Sweat Out"));
		doubleFirstCD.addNodeToList(new DoubleLinkedCD("The Zolas", "Ancient Mars"));
		doubleFirstCD.printList(false);
		
		System.out.println("\nPRINTING LIST IN REVERSE");
		doubleFirstCD.getLastNode().printList(true);
		
		doubleFirstCD.removeNodeFromList();
		System.out.println("\nREMOVED CD FROM END");
		doubleFirstCD.printList(false);
		
		doubleFirstCD.addNodeToList(new DoubleLinkedCD("Bleachers", "Strange Desire"));
		System.out.println("\nADDED CD TO END");
		doubleFirstCD.printList(false);
		
		doubleFirstCD.removeNodeFromBeginning();
		System.out.println("\nREMOVED CD FROM BEGINNING");
		doubleFirstCD = (DoubleLinkedCD) doubleFirstCD.getLastNode().getFirstNode();
		doubleFirstCD.printList(false);
		
		doubleTempCD = new DoubleLinkedCD("Bad Suns", "Language & Perspective");
		doubleFirstCD.addNodeToBeginning(doubleTempCD);
		System.out.println("\nADDED CD TO BEGINNING");
		doubleFirstCD = (DoubleLinkedCD) doubleFirstCD.getFirstNode();
		doubleFirstCD.printList(false);
		
		doubleTempCD = new DoubleLinkedCD("The Strokes", "Is This It");
		doubleFirstCD.insertNodeAfter(doubleTempCD);
		System.out.println("\nINSERTED CD AFTER FIRST ELEMENT");
		doubleFirstCD.printList(false);
		
		doubleTempCD = new DoubleLinkedCD("The Districts", "Young Blood");
		doubleFirstCD.insertNodeBefore(doubleTempCD);
		System.out.println("\nINSERTED CD Before FIRST ELEMENT");
		doubleFirstCD = (DoubleLinkedCD) doubleFirstCD.getFirstNode();
		doubleFirstCD.printList(false);
		
		doubleFirstCD = new DoubleLinkedCD("Bad Suns", "Language & Perspective");
		doubleFirstCD.insertNodeByArtist(new DoubleLinkedCD("The Jimmies", "Zoop"));
		doubleFirstCD.insertNodeByArtist(new DoubleLinkedCD("Ratatat", "Classics"));
		doubleFirstCD.insertNodeByArtist(new DoubleLinkedCD("Panic at the Disco", "A Beaver You Can't Sweat Out"));
		doubleFirstCD.insertNodeByArtist(new DoubleLinkedCD("The Zolas", "Ancient Mars"));
		doubleFirstCD.insertNodeByArtist(new DoubleLinkedCD("Passion Pit", "Sleepyhead"));
		doubleFirstCD.insertNodeByArtist(new DoubleLinkedCD("Ratatat", "Apple"));
		doubleFirstCD.insertNodeByArtist(new DoubleLinkedCD("Panic at the Disco", "A Fever You Can't Sweat Out"));
		doubleFirstCD.insertNodeByArtist(new DoubleLinkedCD("The Zolas", "Cab Driver"));
		System.out.println("\nMADE LIST AND SORTED BY ARTIST");
		doubleFirstCD = (DoubleLinkedCD) doubleFirstCD.getFirstNode();
		doubleFirstCD.printList(false);
	}

}
