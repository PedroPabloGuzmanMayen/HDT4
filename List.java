public interface List<E> {
    public void add(E value);
    // post: Appends the specified element to the end of this list

    public E remove(int index);
    // pre: The list is not empty
    // post: Removes the element at the specified position in this list
    
    public E get(int index);
    // pre: The list is not empty
    // post: Returns the element at the specified position in this list
    
    public boolean isEmpty();
    // post: Returns true if this list contains no elements
    
    public int size();
    // post: Returns the number of elements in this list

    public void clear();
    // Removes all of the elements from this list
}