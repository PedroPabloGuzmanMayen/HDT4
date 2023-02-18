public interface List<E> {
    /**
     * post: Appends the specified element to the end of this list
     * 
     * @param value the value to be added to the list
     */
    public void add(E value);

    /**
     * pre: The list is not empty
     * post: Removes the element at the specified position in this list
     * 
     * @param index the positional index of the element to be removed
     * @return the removed element
     */
    public E remove(int index);
    
    /**
     * pre: The list is not empty
     * post: Returns the element at the specified position in this list
     * 
     * @param index the positional index of the element to be retrieved
     * @return the retrieved element
     */
    public E get(int index);
    
    /**
     * post: Returns true if this list contains no elements
     * 
     * @return true if the list is empty, false if it's not
     */
    public boolean isEmpty();
    
    /**
     * post: Returns the number of elements in this list
     * 
     * @return number of elements in the list
     */
    public int size();
    
    /**
     * Removes all of the elements from this list
     */
    public void clear();
    
}