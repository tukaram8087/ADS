package Day6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/*
		DoublyLinkedList list1 = new DoublyLinkedList();
		
		  list1.insert(9);
		   list1.insert(7);	
		   list1.display(); // 7 9
		   list1.insert(2);
		   list1.insert(6);
		   list1.display(); //2 6 7 9
		
		*/
		
		System.out.println("Enter no of operator and operand");
		int n = sc.nextInt();
		System.out.println("Enter expersion to evaluate ");
		
		String arr[] = new String [n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter next operator and operand");
			arr[i] = sc.next();
		}
		System.out.println("postfix evaluation : ");
		int result = PostfixExpression.evaluateExpression(arr);
		
		System.out.println(result);
		
	}

}
