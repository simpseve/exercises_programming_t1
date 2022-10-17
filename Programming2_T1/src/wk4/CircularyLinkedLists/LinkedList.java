package wk4.CircularyLinkedLists;

public class LinkedList<E> {

    //generic tail
    private Node<E> tail = null;
    private int size = 0;

    public LinkedList(){

    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    //E is the element defined in generic tail
    public E first(){
        //if the list is empty
        if(isEmpty()){
            return null;
        }else{
            //if not, pull out the first thing in the list (head)
            return tail.getNext().getElement();
        }
    }
    public E last(){
        //if the list is empty
        if(isEmpty()){
            return null;
        }else{
            //if not, pull out the last thing in the list (tail)
            return tail.getElement();
        }
    }

    public void rotate(){
        //firstly check if there is anything to rotate in the list
        if(tail != null){
            //whatever is stored at the end- get the thing at the front and store at the back
            tail = tail.getNext();
        }
    }
    public void addFirst(E e){
        if(isEmpty()){
            //set the tail as a new node, take in element e and bc its the first thing in list- next is null
            //initialises tail
            tail = new Node<>(e,null);
            //this is where the circle is started- connects back to itself
            tail.setNext(tail);
        }else{
            //if the list isnt empty
            //becase we have things in the list next is the tail
            Node<E> newest = new Node<>(e,tail.getNext());
            tail.setNext(newest);
            size++;
        }
    }
    //parameter is type of data
    public void addLast(E e){
        addFirst(e);
        tail= tail.getNext();
    }

    public E removeFirst(){
        if(isEmpty()){
            return  null;
        }else{
            Node<E> head = tail.getNext();
            if (head == tail){
                tail = null;

            }else{
                tail.setNext(head.getNext());
            }
            size --;
            return head.getElement();
        }

    }




}
