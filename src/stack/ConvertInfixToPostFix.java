package stack;

import java.util.Stack;

public class ConvertInfixToPostFix {

	public static int precedence(char c) {
		switch (c) {
		case '+':
		case '-':return 1;	
		case '*':
		case '/':return 2;
		}	
		return -1;
		
	}
	
	public static String convert(String expression) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder op = new StringBuilder();
		
		for(char ch: expression.toCharArray()) {
			
			if(Character.isLetterOrDigit(ch)) {
				op.append(ch + " ");
			}else if(ch == '(') {
				stack.push(ch);
			}else if(ch ==')') {
				while(!stack.isEmpty() && stack.peek()!='(') {
					op.append(stack.pop() + " ");
				}
				stack.pop();
			}else {
				while(!stack.isEmpty() && (precedence(ch) <= precedence(stack.peek()))) {
					op.append(stack.pop() + " ");
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty()) {
			op.append(stack.pop() + " ");
		}
		
		return op.toString();
		
	}
	
	
	public static void main(String[] args) {
		String exp = "A*B+(D-E)";
		
		System.out.println("Postfix is: " + convert(exp));
	}

}
