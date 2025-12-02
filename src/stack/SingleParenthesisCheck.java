package stack;

import java.util.Stack;

public class SingleParenthesisCheck {

	static boolean balanceCheck(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			
			if(ch=='(') {
				stack.push(ch);
			}else if(ch==')') {
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		String expression = "50+28-(9*10))(";
		
		boolean result = balanceCheck(expression);
		if(result) {
			System.out.println("Expression is balanced");
		}else {
			System.out.println("Expression is NOT balanced");
		}
	}
}