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

        // StackFactory
        StackFactory<Integer> stackFactoryInt = new StackFactory<Integer>();
        StackFactory<Character> stackFactoryChar = new StackFactory<Character>();

        // Singleton de la clase calculadora
        Singleton calcSingleton = Singleton.getInstance(stackFactoryInt.getStack("Vector"));
        
        // Infix to Postfix
        InfixToPostfixConverter postfixConvertor = new InfixToPostfixConverter(stackFactoryChar.getStack("ArrayList"));

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
                    try {
                        postfixConvertor = new InfixToPostfixConverter(new StackVector<Character>());
                        String postfixExp = postfixConvertor.convertToPostfix(inputedExpression);
                        System.out.println("Converted Infix Expression: " + postfixExp);
                        System.out.println("Postifx evaluation result: " + calcSingleton.geCalculator().evaluate(postfixExp));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":   // Mostrar el ultimo resultado calculado
                    double previousResult = calcSingleton.geCalculator().getPrevious();
                    if (previousResult != 0)
                        System.out.println("Previous result: " + previousResult);
                    else 
                        System.out.println("No previous result found.");
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
