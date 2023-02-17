import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackArrayList<E> extends AbstractStack<E> {

    private ArrayList<E> arrayList;

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
    
}
