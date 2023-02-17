import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Vector;
/**
 * 
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 1.0.0
 * @param <E> El tipo de dato del vector
 */
public class StackVector<E> extends AbstractStack<E> {

    private Vector<E> vector;
    /**
     * Constructor, crea un nuevo vector del tipo especificado
     */
    public StackVector() {
        vector = new Vector<E>();
    }

    @Override
    /**
     * Agrega datos al vector
     * @param item representa el dato que se agregará
     */
    public void push(E item) {
        vector.add(item);
    }

    @Override
    /**
     * Elimina y devuelve el último valor agregado al vector
     */
    public E pop() throws EmptyStackException {
        try {
            return vector.remove(vector.size() - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }
    }

    @Override
    /**
     * Devuelve el último valor agregado al vector
     */
    public E peek() throws EmptyStackException {
        try {
            return vector.lastElement();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
    }

    @Override
    /*
     * Devuelve true si el vector está vacío; false si no lo está 
     */
    public boolean empty() {
        return vector.isEmpty();
    }

    @Override
    /**
     * Devuelve el tamaño del vector
     */
    public int size() {
        return vector.size();
    }
    
}
