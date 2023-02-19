/*
 * Autor: Alejandro Anton, Alejandro Jose, Pedro pablo guzman
 * hoja de trabajo 4
 * deseño siglenton
 */
public class Siglenton <E>{
    private static calculator cal;

    private calculator(){

    }
    /* est parte nos da la instancia de la clase a la que se le aplica el diseño*/
    public static calculator getInstance(){

        if(cal == null){
            cal = new calculator();
        }
        /*indica que si cal no tiene valor que se le asigne un nuevo valor en calculadora*/
        return cal;
    }

}
