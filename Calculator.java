/**
 * 
 * @author José Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 1.0.0
 */
public class Calculator implements ICalculator {

    //private Stack<Double> stack;
    private Double lastResult; //Esta variable guarda el resultado de la última operación realizada
    
	private int operationCounter =0; //Esta variable sirve para contar las operaciones efectuadas con el métdo evaluate

	/**
	 * Este metodo evalua una expresión en notación postfix y devuelve el resultado de la expresión
	 * @param expression la expresión a ser evaluada
	 * @returns devuelve el resultado de la expresión en notación postfix
	 */
    public double evaluate(String expression) throws ArithmeticException {
    	//pre: expression es un string el cuál representa una expresión aritmetica en notación postfiz
    	//post: se devuelve el resultado de la operación postfix ingresada, si hay una operación no válida se retornara un valor negativo
    	try {
    		if (!expression.contains("+") && !expression.contains("-") && !expression.contains("*") && !expression.contains("/")) { //Evaluar si hay operadores en la expresión
    			throw new ArithmeticException("No hay operadores");
    		}
    		Stack<Double> stack = new StackVector<Double>(); //esta variable almacena el stack que se usará para realizar las operaciones
    		String[] characters = expression.split("\s"); //esta varaiable divide el string necesario para la operacion y lo divide varios strings. Para hacer la dividsión debe haber un espacio en blanco
    		for (int i=0; i<characters.length; i++) { //Ciclo for el cuál evaluara cada elemento del array de strings
    			if (Character.isDigit(characters[i].charAt(0))){ //Evalua si el elemento es un numero
    				stack.push(Double.valueOf(characters[i])); //SI es un número, el elemento se agrega al stack
    			}
    			else { //Procedimiento a seguir si el elemento del array no es un número
    				Double firstNum = stack.pop(); //Guardar el último elemento del stack y luego borrarlo
    				Double secondnumb = stack.pop();
    				switch(characters[i]) { //Evaluar 6 4 7 + p el signo de la operación, se harán operaciones dependiendo el signo. Guardar el resultado de la operación en el stack
    					
    					case "+":
    						stack.push(firstNum+ secondnumb);
    						break;
    					case "-":
    						stack.push(firstNum- secondnumb);
    						break;
    					case "*":
    						stack.push(firstNum* secondnumb);
    						break;
    					case "/":
    						stack.push(firstNum/ secondnumb);
    						break;
    					
    				}
    			}
    		}
    		this.operationCounter +=1; //Sumar 1 si se utiliza evaluate
    		this.lastResult = stack.peek(); //Guardar el valor más reciente en una variable
    		return stack.pop(); //Devolver el valor más reciente de la lista. Dejar el stack vacío
    	}
    	catch (Exception e){
    		throw new ArithmeticException("Operación incorrecta"); //Indicar que hubo un error
    	}

    }

    @Override
    public double getPrevious() {

    	//post: regresa el valor de la última operación realizada si el valor de operationCounter no es cero, de lo contrario, regresa un valor negativo
    	double res =0.0; //Variable a devolver
		if (this.operationCounter != 0) {
			res = this.lastResult; //Guardar el valor de last result
		}
		else {
			throw new NullPointerException("No se realizaron operaciones"); //Devolver un valor negativo
		}
		return res; //Devolver la variable
		
    }
    
}
