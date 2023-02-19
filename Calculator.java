import java.util.EmptyStackException;

/**
 * 
 * @author José Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 1.0.0
 */
public class Calculator implements ICalculator {

    private Double lastResult; //Esta variable guarda el resultado de la última operación realizada
	private char[] operators = {'+', '-', '*', '/'};
    private Stack<Integer> stack;

	public Calculator(Stack<Integer> stack) {
		this.stack = stack;
		this.lastResult = null;
	}

	/**
	 * Este metodo evalua una expresión en notación postfix y devuelve el resultado de la expresión.
	 * 
	 * @param expression la expresión postfix a ser evaluada
	 * @returns el resultado de la expresión postfix
	 */
	public double evaluate(String expression) throws ArithmeticException {
        stack.clear();
        char[] elements = expression.trim().toCharArray();  
        for (char element : elements) {
            if (Character.isDigit(element)) {
                stack.push(Integer.parseInt(String.valueOf(element)));
            } else if (isOperator(element)) {
                try {
                    int operandA = stack.pop();
                    int operandB = stack.pop();
                    switch (element) {
                        case '+':
                            stack.push(operandA + operandB);
                            break;
                        case '-':
                            stack.push(operandA - operandB);
                            break;
                        case '*':
                            stack.push(operandA * operandB);
                            break;
                        case '/':
                            stack.push(operandA / operandB);
                            break;
                    }
                } catch (EmptyStackException e) {
                    throw new ArithmeticException("Not enough operators (2 needed)!");
                } catch (ArithmeticException e) {
                    throw new ArithmeticException("Invalid operation (zero division?).");
                }
            } else if (element == '\s') {
                continue;
            } else {
                throw new ArithmeticException("Invalid operator \'" + element + "\'.");
            }
        }
        if (stack.size() != 1) {
            throw new ArithmeticException("Too many operators (2 max)!");
        }
		this.lastResult = (double) stack.peek();
        return (double) stack.pop();
    }

    @Override
    public double getPrevious() {
		if (lastResult != null)
			return lastResult;
		else
			return 0;
    }

	private boolean isOperator(char x) {
        for (char o : operators) {
            if (o == x) {
                return true;
            }
        }
        return false;
    }
    
}
