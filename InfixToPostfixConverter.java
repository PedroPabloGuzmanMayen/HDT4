/**
 * 
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 2.0.0
 *
 */
public class InfixToPostfixConverter {

	private char[] operators = {'+', '-', '*', '/', '^'};
	
	private String postfix;
	public InfixToPostfixConverter(Stack<String> stack, String expression) {
		
		for (int i = 0; i< expression.length(); i++) {
			char c = expression.charAt(i);
			if (Character.isDigit(c)) {
				this.postfix += expression.charAt(i)+"\n";
				
			}
			else if (String.valueOf(c) == "+" || String.valueOf(c) == "-" || String.valueOf(c) == "*" || String.valueOf(c) == "/" ) {
				stack.push(String.valueOf(c));
			}
			else if (String.valueOf(c) == "(") {
	
			}
			else if (String.valueOf(c) == ")") {
				
				while (!stack.empty()) {
					postfix+=stack.pop()+"\n";
				}
			}
			
		}
		if (!stack.empty()) {
			while (!stack.empty()) {
				postfix+=stack.pop()+"\n";
			}
		}
	}
	
	public String getPostfixE() {
		return this.postfix;
	}

	public String convertToPostfix(String infixExpression) {
		StackVector<Character> stack = new StackVector<Character>();
		StringBuilder postfixExp = new StringBuilder("");

		for (char c : infixExpression.trim().toCharArray()) {
			if (Character.isDigit(c)) {
				postfixExp.append(c);
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (!stack.empty() && stack.peek() != '(') {
					postfixExp.append(stack.pop());
				}
				if (!stack.empty() && stack.peek() != '(')
					throw new ArithmeticException("Invalid expression.");
				else
					stack.pop();
			} else {	// Si es un operador
				while (!stack.empty() && precedence(c) <= precedence(stack.peek())) {
					postfixExp.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while (!stack.empty()) {
			postfixExp.append(stack.pop());
		}
		return postfixExp.toString();
	}

	private boolean isOperator(char c) {
		for (char o : this.operators) {
			if (c == o)
				return true;
		}
		return false;
	}

	private int precedence(char c) {
		switch (c) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			default:
				return -1;
		}
	}
	
}
