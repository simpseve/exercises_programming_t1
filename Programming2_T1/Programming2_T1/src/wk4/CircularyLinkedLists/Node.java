package wk4.CircularyLinkedLists;

public class Node<E> {

    private E element;
    private Node<E> next;

    public Node(E e, Node<E> next){
        element=e;
        this.next=next;
    }

    public E getElement(){
        return element;
    }

    public Node<E> getNext(){
        return next;
    }

    public void setNext(Node<E> n){
        next=n;
    }

}
