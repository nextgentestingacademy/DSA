package stack;

import java.util.Stack;

public class ReverseAString {

	public static String reverseString(String expression) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder reverseString = new StringBuilder();
		//converting the string into a char array and also iterating it
		for(char ch: expression.toCharArray()) {
			//each character gets pushed in the stack
			stack.push(ch);
		}
		
		//append each top character element of the stack in the stringbuilder  object 
		while(!stack.isEmpty()) {
			reverseString.append(stack.pop());
		}
		
		//convert the stringbuilder object to string and return
		return reverseString.toString();
	}
	
	public static void main(String[] args) {
		//string expression
		String exp = "HELLO WORLD";
		//printing the reverse output of the string
		System.out.println("Reverse of " + exp + " is " + reverseString(exp));
	}

}

