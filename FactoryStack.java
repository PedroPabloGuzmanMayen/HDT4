import java.util.LinkedList;

/*
 * Autor: Alejandro Anton, Alejandro Jose, Pedro pablo guzman
 * hoja de trabajo 4
 * factory
 */

public class FactoryStack <E>{

    public factor obtenerFactor(calculadora calculadora){

        if (calculadora == calculadora.StackList){
            return new StackList();
        }
        if (calculadora == calculadora.StackArray){
            return new StackArray();
        }
        if (calculadora == calculadora.StackVector){
            return new StackVector();
        }
        if (calculadora == calculadora.LinkedList){
            return new LinkedList();
        }

    }
    
}
