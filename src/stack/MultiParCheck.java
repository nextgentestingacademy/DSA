package stack;

import java.util.Stack;

public class MultiParCheck {

	public static void main(String[] args) {
		String expression = "{3+5}/[7-3]][";
		//create a stack of type character data type
		Stack<Character> stack = new Stack<Character>();
		boolean isBalanced = true;
		
		//traversing through each character of the expression 
		for(int i=0;i<expression.length();i++) {
			char c = expression.charAt(i);
			
			//if character is matching any of the opening parenthesis it gets pushed in the stack
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}else if(c==')' || c=='}' || c==']') { //if matches any of the closing parenthesis,..
				if(stack.isEmpty()) { //checks whether stack is already empty, if yes...
					isBalanced = false; //expression is not balanced and come out of the iteration
					break;
				}
				
				char top = stack.pop(); //store the top element value
				//check if the closing parenthesis matches the opening parenthesis type of the character variable
				//if not, then expression is not balanced
				if((c==')' && top!='(') ||
					(c=='}' && top!='{') ||
					(c==']' && top!='[')) {
					isBalanced = false;
					break;
				}
			}
		}
		
		//if isBalanced is still true and stack is Empty then it is Balanced else it is NOT
		if(isBalanced == true && stack.isEmpty()) {
			System.out.println("Expression is Balaned");
		}else {
			System.out.println("Expression is NOT Balaned");
		}
	}
}
