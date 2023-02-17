import java.util.NoSuchElementException;

public class DoublyLinkedList<E> extends AbstractList<E> {

    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    public DoublyLinkedList()
    // post: constructs an empty list
    {
        head = null;
        tail = null;
        count = 0;
    }

    public void addFirst(E value)
    // pre: value is not null
    // post: adds element to head of list
    {
        // construct a new element, making it head
        head = new DoublyLinkedNode<E>(value, head, null);
        // fix tail, if necessary
        if (tail == null)
            tail = head;
        count++;
    }

    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
        // construct new element
        tail = new DoublyLinkedNode<E>(value, null, tail);
        // fix up head
        if (head == null)
            head = tail;
        count++;
    }

    public E removeLast()
    // pre: list is not empty
    // post: removes value from tail of list
    {
        DoublyLinkedNode<E> temp = tail;
        tail = tail.getPreviousElement();
        if (tail == null) {
            head = null;
        } else {
            tail.setNextElement(null);
            ;
        }
        count--;
        return temp.getData();
    }

    @Override
    public void add(E value) {
        addLast(value);
    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index < this.count && !isEmpty()) {
            int counter = 0;
            DoublyLinkedNode<E> tempNode = head;
            while (counter != index) {
                tempNode = tempNode.getNextElement();
                counter++;
            }
            tempNode.getPreviousElement().setNextElement(tempNode.getNextElement());
            return tempNode.getData();
        } else {
            throw new NoSuchElementException("No element at index \"" + index + "\"");
        }
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
    }

}