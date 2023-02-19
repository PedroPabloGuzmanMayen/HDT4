/*
 * Autor: Alejandro Anton, Alejandro Jose, Pedro pablo guzman
 * hoja de trabajo 4
 * deseño siglenton
 */
public class Singleton {
    
    private static Singleton singleInstance;

    private Calculator calculator;

    /**
     * Constructor de Singleton
     */
    private Singleton(Stack<Integer> stack) {
        this.calculator = new Calculator(stack);
    }

    /**
     * Devuelve la instancia de la clase a la que se le aplica el diseño Singleton
     * 
     * @return Instancia de Singleton
     */
    public static Singleton getInstance(Stack<Integer> stack){

        if(singleInstance == null){
            singleInstance = new Singleton(stack);
        }
        /*indica que si singleInstance no tiene valor que se le asigne un nuevo valor en calculadora*/
        return singleInstance;
    }

    /**
     * Obtiene la instancia de única Calculator guardada en Singleton
     * 
     * @return Instancia de Calculator
     */
    public Calculator geCalculator() {
        return this.calculator;
    }

}
