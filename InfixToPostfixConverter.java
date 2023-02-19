/**
 * 
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 2.0.0
 *
 */
public class InfixToPostfixConverter {

	private Stack<Character> stack;

	private char[] operators = {'+', '-', '*', '/', '^'};

	/**
	 * Constructor de la clase InfixToPostfixConverter.
	 * 
	 * @param stack La implementación de Stack<Character> que se utilizará
	 */
	public InfixToPostfixConverter(Stack<Character> stack) {
		this.stack = stack;
	}
	
	/**
	 * Convierte una expresión aritmética en notación Infix a su equivalente en notación Postfix
	 * Utilizando una implementación de Stack.
	 * 
	 * @param infixExpression La expresión Infix a convertir
	 * @return El equivalente en notación Postfix de infixExpression
	 */
	public String convertToPostfix(String infixExpression) throws ArithmeticException {
		this.stack.clear();
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
