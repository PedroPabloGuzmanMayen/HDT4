import java.util.EmptyStackException;

/**
 * StackList:
 * Implementación de Stack utilizando la interfaz List de modo que pueda
 * utilizarse con cualquier implementación de List (LinkedList, DoublyLinkedList)
 */
public class StackList<E> extends AbstractStack<E> {

    protected List<E> list;

    /**
     * Constructor de la clase StackList
     * 
     * @param listImplementation La implementacion de List a utilizar ("Linked" o "DoublyLinked")
     */
    public StackList(String listImplementation) {
        listImplementation = listImplementation.toLowerCase().trim();
        switch (listImplementation) {
            case "linked":
                this.list = new LinkedList<E>();
                break;
            case "doublylinked":
                this.list = new DoublyLinkedList<E>();
                break;
            default:
                this.list = new LinkedList<E>();
                break;
        }
    }

    @Override
    public void push(E item) {
        this.list.add(item);
    }

    @Override
    public E pop() throws EmptyStackException {
        if (!this.list.isEmpty()) {
            return this.list.remove(this.list.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public E peek() throws EmptyStackException {
        if (!this.list.isEmpty()) {
            return this.list.remove(this.list.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public void clear() {
        this.list.clear();
    }
    
}
