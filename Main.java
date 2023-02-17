import java.io.File;
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

        FileHandler fh = new FileHandler();
        File operations = fh.createFile("Operations.txt");

        String DIVIDER = "-----------------------------------------------------------";
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println(DIVIDER);
            System.out.println(
                "1. Leer archivo y mostrar resultados\n" + 
                "2. Mostrar el ultimo resultado\n" + 
                "3. Salir del programa"
            );
            System.out.println(DIVIDER);
            System.out.print("Ingrese una opcion: ");
            String input = sc.next();
            System.out.println(DIVIDER);
            switch (input) {
                case "1":   // Leer archivo y evaluar operaciones
                    
                    break;
                case "2":   // Mostrar el ultimo resultado calculado
                    // TODO: Comprobar si existe un resultado previo valido y si existe, imprimirlo
                    
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
