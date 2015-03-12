package com.btp.linkedlists;

public abstract class DoubleLinkedNode {
	private DoubleLinkedNode nextNode;
	private DoubleLinkedNode prevNode;
	
	public DoubleLinkedNode() {
		nextNode = null;
		prevNode = null;
	}
	
	public void setNextNode(DoubleLinkedNode nextNode) {
		this.nextNode = nextNode; //Adds given node onto end of list
	}
	
	public void removeNextNode() {
		nextNode = null;
	}
	
	public void setPrevNode(DoubleLinkedNode prevNode) {
		this.prevNode = prevNode;
	}
	
	public void removePrevNode() {
		prevNode = null;
	}
	
	public DoubleLinkedNode getNextNode() {
		return nextNode;
	}
	
	public DoubleLinkedNode getPrevNode() {
		return prevNode;
	}
	
	public void addNodeToList(DoubleLinkedNode endNode) {
		DoubleLinkedNode tempNode = this;
		while(tempNode.getNextNode() != null) //Run until reaching node without pointer
			tempNode = tempNode.getNextNode();
		tempNode.setNextNode(endNode); //Add node to the end
	}
	
	public void removeNodeFromList() {
		DoubleLinkedNode tempNode = this;
		while(tempNode.getNextNode().getNextNode() != null) //Run until reaching node without pointer
			tempNode = tempNode.getNextNode();
		tempNode.setNextNode(null); //Add node to the end
	}
	
	public void printList(boolean reversed) {
		DoubleLinkedNode tempNode = this; //Makes tempNode point to this node
		tempNode.printInfo(); //Prints info about initial node
		if(reversed) {
			while(tempNode.getPrevNode() != null) { //Runs while next node is not null
				tempNode = tempNode.getPrevNode(); //Selects next node
				tempNode.printInfo(); //Prints info about the node
			}
		}
		else {
			while(tempNode.getNextNode() != null) { //Runs while next node is not null
				tempNode = tempNode.getNextNode(); //Selects next node
				tempNode.printInfo(); //Prints info about the node
			}
		}
	}
	
	public abstract void printInfo();
}
