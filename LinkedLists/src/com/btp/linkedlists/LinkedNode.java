package com.btp.linkedlists;

public abstract class LinkedNode {
	private LinkedNode nextNode;
	
	public LinkedNode() {
		nextNode = null;
	}
	
	public void setNextNode(LinkedNode nextNode) {
		this.nextNode = nextNode; //Adds given node onto end of list
	}
	
	public void removeNextNode() {
		nextNode = null;
	}
	
	public void addNodeToList(LinkedNode endNode) {
		LinkedNode tempNode = this;
		while(tempNode.getNextNode() != null) //Run until reaching node without pointer
			tempNode = tempNode.getNextNode();
		tempNode.setNextNode(endNode); //Add node to the end
	}
	
	public void iterateList() {
		LinkedNode tempNode = this; //Makes tempNode point to this node
		tempNode.printInfo(); //Prints info about initial node
		while(tempNode.getNextNode() != null) { //Runs while next node is not null
			tempNode = tempNode.getNextNode(); //Selects next node
			tempNode.printInfo(); //Prints info about the node
		}
	}
	
	public LinkedNode getNextNode() {
		return nextNode;
	}
	
	public abstract void printInfo();
}
