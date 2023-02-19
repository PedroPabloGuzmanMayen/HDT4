public class LinkedList<E> extends AbstractList<E> {

    protected int count; // list size
    protected Node<E> head; // ref. to first element

    public LinkedList()
    // post: generates an empty list
    {
        head = null;
        count = 0;
    }

    @Override
    public int size()
    // post: returns number of elements in list
    {
        return count;
    }

    public void addFirst(E value)
    // post: value is added to beginning of list
    {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<E>(value, head);
        count++;
    }

    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }

    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }

    public void addLast(E value)
    // post: adds value to end of list
    {
        // location for new value
        Node<E> temp = new Node<E>(value, null);
        if (head != null) {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null) {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else
            head = temp;

        count++;

    }

    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff value is found in list
    {
        Node<E> finger = head;

        while (finger != null && !finger.value().equals(value)) {
            finger = finger.next();
        }
        return finger != null;
    }

    @Override
    public void add(E value) {
        addLast(value);
    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index < size() && !isEmpty()) {
            int counter = 0;
            Node<E> currentNode = this.head;
            Node<E> previousNode = null;
            while (counter != index) {
                previousNode = currentNode;
                currentNode = currentNode.next();
                counter++;
            }
            if (index == 0)
                this.head = currentNode.next();
            else
                previousNode.setNext(currentNode.next());
            this.count--;
            return currentNode.value();
        } else {
            throw new IndexOutOfBoundsException("No element at index \"" + index + "\"");
        }
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < size() && !isEmpty()) {
            int counter = 0;
            Node<E> currentNode = this.head;
            while (counter != index) {
                currentNode = currentNode.next();
                counter++;
            }
            this.count--;
            return currentNode.value();
        } else {
            throw new IndexOutOfBoundsException("No element at index \"" + index + "\"");
        }
    }

    @Override
    public void clear() {
        this.head = null;
        this.count = 0;
    }

}
