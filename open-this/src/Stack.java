public interface Stack<T> {

    void push(T item);

    Object pop() throws MyEmptyStackException;

    void peek();

    boolean isEmpty();


}
