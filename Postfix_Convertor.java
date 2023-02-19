/**
 * 
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 2.0.0
 *
 */
public class Postfix_Convertor {
	
	private String postfix;
	public Postfix_Convertor(Stack<String> stack, String expression) {
		
		for (int i = 0; i< expression.length(); i++) {
			char c = expression.charAt(i);
			if (Character.isDigit(c)) {
				this.postfix += expression.charAt(i)+"\n";
				
			}
			else if (String.valueOf(c) == "+" || String.valueOf(c) == "-" || String.valueOf(c) == "*" || String.valueOf(c) == "/" ) {
				stack.push(String.valueOf(c));
			}
			else if (String.valueOf(c) == "(") {
				stack.push(String.valueOf(c));
			}
			else if (String.valueOf(c) == ")") {
				
				while (!stack.empty()) {
					
				}
			}
			
		}
	}
	
	public String getPostfixE() {
		return this.postfix;
	}
	
}
