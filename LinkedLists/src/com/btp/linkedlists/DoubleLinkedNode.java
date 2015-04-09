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
	
	public DoubleLinkedNode getLastNode() {
		DoubleLinkedNode tempNode = this;
		while(tempNode.getNextNode() != null) //Run until reaching node without pointer
			tempNode = tempNode.getNextNode();
		return tempNode;
	}
	
	public DoubleLinkedNode getFirstNode() {
		DoubleLinkedNode tempNode = this;
		while(tempNode.getPrevNode() != null) //Run until reaching node without pointer
			tempNode = tempNode.getPrevNode();
		return tempNode;
	}
	
	public void addNodeToList(DoubleLinkedNode endNode) {
		DoubleLinkedNode tempNode = this;
		while(tempNode.getNextNode() != null) //Run until reaching node without pointer
			tempNode = tempNode.getNextNode();
		tempNode.setNextNode(endNode); //Add node to the end
		endNode.setPrevNode(tempNode);
	}
	
	public void addNodeToBeginning(DoubleLinkedNode startNode) {
		DoubleLinkedNode tempNode = this;
		while(tempNode.getPrevNode() != null) //Run until reaching node without pointer
			tempNode = tempNode.getPrevNode();
		tempNode.setPrevNode(startNode);
		startNode.setNextNode(tempNode); //Add node to the start
	}
	
	public void removeNodeFromList() {
		DoubleLinkedNode tempNode = this;
		while(tempNode.getNextNode() != null) //Run until reaching node without pointer
			tempNode = tempNode.getNextNode();
		tempNode.getPrevNode().setNextNode(null); //Removes current node
	}
	
	public void removeNodeFromBeginning() {
		DoubleLinkedNode tempNode = this;
		while(tempNode.getPrevNode() != null) //Run until reaching node without pointer
			tempNode = tempNode.getPrevNode();
		tempNode.getNextNode().setPrevNode(null); //Removes reference to temp node
	}
	
	public void insertNodeAfter(DoubleLinkedNode afterNode) {
		afterNode.setNextNode(this.getNextNode());
		afterNode.setPrevNode(this); //Adds afterNode between this element and the next
		setNextNode(afterNode);
	}
	
	public void insertNodeBefore(DoubleLinkedNode beforeNode) {
		if(getPrevNode() != null) {
			getPrevNode().setNextNode(beforeNode);
		}
		beforeNode.setNextNode(this); //Adds beforeNode between this element and the previous
		beforeNode.setPrevNode(getPrevNode());
		setPrevNode(beforeNode);
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
