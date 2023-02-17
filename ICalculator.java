
/**
 * ICalculator
 * 
 * Interfaz que representa una calculadora en el sistema.
 */
public interface ICalculator {
    /**
     * Calcula la expresión postfix dada.
     * La expresión postfix debe ser una expresión válida, lo que significa
     * que toda validación de formato a realizar debe hacerse antes de llamar a este
     * método.
     * 
     * La excepción se encuentra en caso se encuentre alguna división entre 0
     * o algún otro caso de excepción aritmética.
     * 
     * @param expression La expresion a calcular.
     * @return El resultado de la expresión.
     */
    public double evaluate(String expression) throws ArithmeticException;

    /**
     * Obtiene el resultado de la operación anterior.
     * 
     * En caso no exista una operación anterior, retorna 0.
     * 
     * @return El resultado de la operación anterior.
     */
    public double getPrevious();
}
