package wk4;

public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = list.insert(list,1);
        list = list.insert(list,2);
        list = list.insert(list,7);
        list = list.insert(list,3);
        list = list.insert(list,4);
        list = list.insert(list,8);
        list = list.insert(list,9);
        list = list.insert(list,5);
        list.printList(list);

    }
}
