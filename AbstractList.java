public abstract class AbstractList<E> implements List<E> {

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

}
