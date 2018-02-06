package org.vj.hktest;

public class BinaryTree {

	Node root;
	
	public void addNode(int key,String name) {
		
	}
	
	public static void main(String args[]) {
		
	}
}

class Node{
	int data;// stores Data
	Node leftChild;
	Node rightChild;
	
	public Node(int data) {
		this.data=data;
		
	}
	public String toString() {
		return "Node data  ::"+data;
	}
}