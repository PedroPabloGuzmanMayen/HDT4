import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Stack ArrayList:
 * Implementación de Stack utilizando ArrayList
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 */
public class StackArrayList<E> extends AbstractStack<E> {

    protected ArrayList<E> arrayList;

    public StackArrayList() {
        this.arrayList = new ArrayList<E>();
    }

    @Override
    public void push(E item) {
        this.arrayList.add(item);        
    }

    @Override
    public E pop() throws EmptyStackException {
        if (!this.arrayList.isEmpty()) {
            E temp = this.arrayList.get(this.arrayList.size() - 1);
            this.arrayList.remove(this.arrayList.size() - 1);
            return temp;
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public E peek() throws EmptyStackException {
        if (!this.arrayList.isEmpty()) {
            return this.arrayList.get(this.arrayList.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public int size() {
        return this.arrayList.size();
    }

    @Override
    public void clear() {
        this.arrayList.clear();
    }
    
}
