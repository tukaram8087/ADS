package Day6;

public class PostfixExpression {

	private int[] stackArr;
	private int top;

	// constructor
	PostfixExpression(int size) {
		stackArr = new int[size];
		top = -1;
	}

	// push element
	public void push(int element) {
		if (isFull())
			throw new ArrayIndexOutOfBoundsException("stack is full");

		top = top + 1;
		stackArr[top] = element;
	}

	// pop element
	public int pop() {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException("stack is empty");

		int result = stackArr[top];
		top = top - 1;

		return result;
	}

	// top element
	public int peek() {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException("stack is empty");

		return stackArr[top];
	}

	// checks is full or not
	public boolean isFull() {
		if (stackArr.length == top)
			return true;
		return false;
	}

	// checks is empty or not
	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}
	
	

	public static int evaluateExpression(String str[]) {

		int n = str.length;
		int index = 0;
		
		PostfixExpression operandStack = new PostfixExpression(n + 1);
		

		//runs 
		while (index < n) {
			
			String temp = str[index++];
			
			//checking operator or operand
			if(temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/") ) {
				
				int no2 = operandStack.pop();
				int no1 = operandStack.pop();
				int result = 0;
				
				if(temp.equals("+")) {
					result = no2 + no1;
				}else if(temp.equals("-")) {
					result = no1 - no2;
				}else if(temp.equals("*")) {
					result = no2 * no1;
				}else if(temp.equals("/")) {
					result = no1 / no2;
				}
				
				operandStack.push(result);
				
			}else {
				operandStack.push(Integer.parseInt(temp));
			}

		}
		
		return operandStack.pop();
	}

}
