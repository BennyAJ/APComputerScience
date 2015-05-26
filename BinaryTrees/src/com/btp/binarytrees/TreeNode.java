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
	
	public Object getValue() {
		return value;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public void setValue(Comparable<Object> value) {
		this.value = value;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public boolean isLeaf() {
		if(left == null && right == null)
			return true;
		return false;
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
	
	public static void removeNode(TreeNode node) {
		if(node.isLeaf()) {
			
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
	
	public int compareTo(TreeNode node) {
		if(value.compareTo(node.getValue()) < 0)
			return -1; //Returns num with same sign as the compareTo of the values of the nodes
		else if(value.compareTo(node.getValue()) > 0)
			return 1;
		else
			return 0;
	}
}
