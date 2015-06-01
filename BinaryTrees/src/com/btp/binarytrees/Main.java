package com.btp.binarytrees;

public class Main {

	public static void main(String[] args) {
		TreeNode startNode = new TreeNode(new Integer(5));
		for(int i = 1; i < 4; i += 1) {
			TreeNode.addNode(startNode, new TreeNode(new Integer(i)));
			System.out.println("Added " + i);
			TreeNode.addNode(startNode, new TreeNode(new Integer(10 - i)));
			System.out.println("Added " + (10 - i));
		}
		for(int i = 10; i < 15; i++) {
			TreeNode.addNode(startNode, new TreeNode(new Integer(i)));
			System.out.println("Added " + i);
		}
		//TreeNode.printInOrder(startNode);
		
		System.out.println("Start Node = " + startNode.getValue());
		System.out.println("Start Node Left = " + startNode.getLeft().getValue());
		System.out.println("Start Node Right = " + startNode.getRight().getValue());
		System.out.println("Start Node Left Right = " + startNode.getLeft().getRight().getValue());
		
		TreeNode.removeNode(startNode, new Integer(1));
		System.out.println("REMOVED 1");
		TreeNode.printInOrder(startNode);
		
		System.out.println("Start Node = " + startNode.getValue());
		System.out.println("Start Node Left = " + startNode.getLeft().getValue());
		//System.out.println("Start Node Right = " + startNode.getRight().getValue());
		//System.out.println("Start Node Left Right = " + startNode.getLeft().getRight().getValue());
	}

}
