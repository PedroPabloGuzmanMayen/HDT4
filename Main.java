import java.util.Scanner;
/**
 * 
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 1.0.0
 */
public class Main {
	/**
	 * En este método se encuentra
	 * @param args un array de strings que puede ser usado para el método
	 */
    public static void main(String[] args) {

        ICalculator calculator = new Calculator();


        String DIVIDER = "-----------------------------------------------------------";
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            sc.reset();
            System.out.println(DIVIDER);
            System.out.println(
                "1. Ingresar una nueva expresion\n" + 
                "2. Mostrar el ultimo resultado\n" + 
                "3. Salir del programa"
            );
            System.out.println(DIVIDER);
            System.out.print("Ingrese una opcion: ");
            String input = sc.nextLine();
            System.out.println(DIVIDER);
            switch (input) {
                case "1":   // Ingresar una nueva expresion
                    String inputedExpression = sc.nextLine();
                    System.out.println(inputedExpression);
                    // TODO: Convertir expresion a notacion postfix
                    // TODO: Evaluar la expresion postfix y devolver el resultado
                    break;
                case "2":   // Mostrar el ultimo resultado calculado
                    // TODO: Mostrar el ultimo resultado si existe
                    break;
                case "3":   // Salir del programa
                    exit = true;
                    System.out.println("Gracias por utilizar el programa");
                    System.out.println(DIVIDER);
                    break;
                default:
                    System.out.println("Por favor, ingrese una opcion valida");
                    break;
            }
        }
        sc.close();        
    }
}
