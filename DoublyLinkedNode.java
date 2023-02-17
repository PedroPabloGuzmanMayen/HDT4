public class DoublyLinkedNode<E> {
    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public DoublyLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DoublyLinkedNode<E> getNextElement() {
        return nextElement;
    }

    public void setNextElement(DoublyLinkedNode<E> nextElement) {
        this.nextElement = nextElement;
    }

    public DoublyLinkedNode<E> getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(DoublyLinkedNode<E> previousElement) {
        this.previousElement = previousElement;
    }
}
