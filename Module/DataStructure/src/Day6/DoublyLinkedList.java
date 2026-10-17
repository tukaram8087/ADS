package Day6;

public class DoublyLinkedList {
//	class Node {
//		int data;
//		Node next;
//		Node prev;
//
//		public Node(int element) {
//			data = element;
//			next = null;
//			prev = null;
//
//		}
//	}

	Node head;

	// constructor
	public DoublyLinkedList() {
		head = null;
	}

	// inserting element by sorted order
	public void insert(int element) {
		Node newNode = new Node(element);
		// no node
		if (head == null) {
			head = newNode;
			return;
		}
		// single node
		if (head.data >= element) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}

		Node current = head;
		//insert in between
		while (current != null) {
			
			//in between node
			if (current.data >= element) {
				newNode.next = current;
				newNode.prev = current.prev;
				current.prev.next = newNode;
				current.prev = newNode;
				return;
			}
			
			//for last node
			if (current.next == null) {
				current.next = newNode;
				newNode.prev = current;
				return;
			}

			current = current.next;
		}
	}
	
	
	
	public void reverse(Node head ) {
		
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

}
