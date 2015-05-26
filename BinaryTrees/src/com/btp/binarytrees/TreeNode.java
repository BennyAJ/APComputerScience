package com.btp.binarytrees;

public class TreeNode implements Comparable<TreeNode> {
	private Comparable<Object> value;
	private TreeNode parent;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode() {
		value = null;
		left = null;
		right = null;
	}
	
	public TreeNode(Comparable<Object> value) {
		this.value = value;
		left = null;
		right = null;
	}
	
	public Comparable<Object> getValue() {
		return value;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public TreeNode getParent() {
		return parent;
	}
	
	public void setValue(Comparable<Object> value) {
		this.value = value;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
		right.setParent(this);
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
		left.setParent(this);
	}
	
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	public boolean isLeaf() {
		if(left == null && right == null)
			return true;
		return false;
	}
	
	public int compareTo(TreeNode node) {
		if(value.compareTo(node.getValue()) < 0)
			return -1; //Returns num with same sign as the compareTo of the values of the nodes
		else if(value.compareTo(node.getValue()) > 0)
			return 1;
		else
			return 0;
	}
	
	public static void addNode(TreeNode current, TreeNode node) {
		if(current == null) {
			current = node;
		}
		else if(node.compareTo(current) < 0) {
			if(current.getLeft() == null)
				current.setLeft(node);
			else
				addNode(current.getLeft(), node);
		}
		else if(node.compareTo(current) > 0) {
			if(current.getRight() == null)
				current.setRight(node);
			else
				addNode(current.getRight(), node);
		}
	}
	
	public static TreeNode getLargestNode(TreeNode current) {
		if(current.getRight() != null) //Finds largest value in subtree
			getLargestNode(current.getRight());
		return current;
	}
	
	public static TreeNode getSmallestNode(TreeNode current) {
		if(current.getLeft() != null) //Finds smallest value in subtree
			getSmallestNode(current.getLeft());
		return current;
	}
	
	public static void removeNode(TreeNode current, Comparable<Object> value) {
		boolean left = false; //Tracks which side the removed node is on relative to parent
		TreeNode tempNode = search(current, value);
		TreeNode parentNode = tempNode.getParent(); //Save parent node separately for neatness
		left = (parentNode.getLeft() == tempNode); //If tempNode is on left of parent node, true
		
		if(tempNode.isLeaf()) {
			if(left)
				parentNode.setLeft(null);
			else
				parentNode.setRight(null);
		}
		else if(tempNode.getLeft() != null && tempNode.getRight() != null) {
			TreeNode largestNode = getLargestNode(tempNode.getLeft());
			tempNode.setValue(largestNode.getValue());
			removeNode(tempNode, largestNode.getValue());
		}
	}
	
	public static TreeNode search(TreeNode current, Comparable<Object> obj) {
		if(current == null) {
			return current;
		}
		else if(obj.compareTo(current.getValue()) < 0) {
			return search(current.getLeft(), obj);
		}
		else if(obj.compareTo(current.getValue()) > 0) {
			return search(current.getRight(), obj);
		}
		return current;
	}
}
