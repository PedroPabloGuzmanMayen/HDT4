/**
 * @author Alejandro Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * hoja de trabajo 4
 * factory
 */

public class StackFactory<E> {

    /**
     * Constructor de la clase StackFactory
     */
    public StackFactory() {
        
    }

    /**
     * Devuelve una nueva instancia de Stack con el tipo de implementación
     * especificado. (StackVector por defecto)
     * 
     * @param stackType El tipo de implementación de la Stack (Vector, ArrayList, LinkedList, DoublyLinkedList)
     * @return Una instancia de Stack de la implementación especificada
     */
    public Stack<E> getStack(String stackType) {
        switch (stackType.trim().toLowerCase()) {
            case "vector":
                return new StackVector<E>();
            case "arraylist":
                return new StackArrayList<E>();
            case "linkedlist":
                return new StackList<E>("Linked");
            case "doublylinkedlist":
                return new StackList<E>("DoublyLinked");
            default:
                return new StackVector<E>();
        }
    }
    
}
