public interface TDAList<E> {
    boolean isEmpty();
    boolean search(E x);
    void insertFirst(E x);
    void insertLast(E x);
    void remove(E x); 
}
