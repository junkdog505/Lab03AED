public class ListLinked<E> implements TDAList<E>{
    private Node<E> first;
    public ListLinked() {
        this.first = null;
    }
    public boolean isEmpty() {return this.first == null;}
    public boolean search(E x){return true;}
    public void insertFirst(E x) {this.first = new Node <E>(x, this.first);}
    public void insertLast(E x) {}
    public void remove(E x) {
        if(this.first.getData().equals(x))   //eliminación del primer nodo.
            this.first = this.first.getNext();
        else{
            Node<E> aux = this.first;
            while(aux.getNext() != null && !aux.getNext().getData().equals(x))
                aux = aux.getNext();
            if(aux.getNext() != null)
                aux.setNext(aux.getNext().getNext());
        }
    }
    public String toString() {
        String str = "";
        for(Node<E> aux = this.first; aux != null; aux = aux.getNext()){
            str += aux.toString() + ", ";
        }
        return str;
        
    }
}