package collections.binarytree;

import java.util.Scanner;

import java.util.Stack;

public class BinaryTree {

	//nodes 
	public class BT {
		public int data;
		public BT leftChild;
		public BT rightChild;

		public BT(int element) {
			data = element;
			leftChild = null;
			rightChild = null;
		}

	}

	//root node
	public BT root;

	public BinaryTree() {
		root = null;
	}

	//inserting element
	public void insertElement(int element, Scanner sc) {
		BT n1 = new BT(element);
		if (root == null) {
			root = n1;
			System.out.println(" Root Created !!! ");
			return;
		}
		BT temp = root;
		while (true) {
			System.out.println("Where do you want to add left or right " + temp.data);
			String str = sc.next();
			if (str.equals("left")) {
				if (temp.leftChild == null) {
					temp.leftChild = n1;
					System.out.println("Node Added At Left Of " + temp.data);
					break;
				}
				temp = temp.leftChild;
			} else if (str.equals("right")) {
				if (temp.rightChild == null) {
					temp.rightChild = n1;
					System.out.println("Node Added At right Of " + temp.data);
					break;
				}
				temp = temp.rightChild;
			} else {
				System.out.println("Wrong Input");
				break;
			}
		}
	}

	//printing using preorder
	public void printUsingPreorder(BT root) {
		if (root == null)
			return;
		System.out.println(root.data);
		
		printUsingPreorder(root.leftChild);
		printUsingPreorder(root.rightChild);

	}
	
	public void printUsingPreorderIterative(BT root) {
		Stack<BT> stack = new Stack<>();
		BT Current=root;
		while(Current != null || stack.isEmpty()) {
              while(Current !=null) {
            	  stack.push(Current);
            	  Current=Current.leftChild;
              }			
              Current=stack.pop();
              System.out.println("Data"+Current.data);
              Current=Current.rightChild;
		}
	}

	//printing using inorder
	public void printUsingInorder(BT root) {
		if(root == null)
			return;
		
		printUsingInorder(root.leftChild);
		System.out.println(root.data);
		printUsingInorder(root.rightChild);
		
	}

	//printing using postorder
	public void printUsingPostorder(BT root) {	
		if(root == null)
			return;
		
		printUsingPostorder(root.leftChild);
		printUsingPostorder(root.rightChild);
		System.out.println(root.data);
	}
	
	
	//counting total nodes
	public int CountNodes(BT root) {
		if(root == null)
			return 0;
		
		return 1+CountNodes(root.leftChild) + CountNodes(root.rightChild);
	}
	
	//counting leaf nodes 
	public int CountLeafNodes(BT root) {
		if(root == null)
			return 0;
		if(root.leftChild == null && root.rightChild == null) {
			return 1;
		}
		return CountLeafNodes(root.leftChild)+CountLeafNodes(root.rightChild);
	}
	
	
	//counting nodes with given value
	public int CountNodesWithValue(BT root, int value) {
		if(root == null) 
			return 0;
		
		if(root.data == value) {
			return 1;
		}
		
		return CountNodesWithValue(root.leftChild,value)+CountNodesWithValue(root.rightChild,value);
	
	}
	
	//height of tree
	
//	public int heightofTree(BT root) {
//		
//		if(root == null) return 0;
//		
//		
//	}

	}
