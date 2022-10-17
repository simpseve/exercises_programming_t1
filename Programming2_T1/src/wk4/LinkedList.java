package wk4;

public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            next=null;

        }
    }
    //take in the current linked list and the data that will be appended to the node
    public static LinkedList insert(LinkedList list, int data){
        //using constructor in Node class- pass in the data to create node
        Node newNode = new Node(data);
        //null as its the new end of the list
        newNode.next=null;
        //nothing added to the list currently(empty) then set new head to be new node
        if(list.head==null) {
            list.head= newNode;
        }else{
            //while last.next isnt null that means we are still in the middle of the list
            //if its null that means we are at the end
            Node last = list.head;
            while (last.next !=null){
                last=last.next;
            }
            last.next=newNode;
        }
        return list;
    }
    //Printing a list

    public static void printList(LinkedList list) {
        Node currentNode = list.head;

        System.out.println("Linked list: ");
        //while im not at the end of the list
        while (currentNode !=null){
            System.out.println(currentNode.data + " ");
            //parse to next node
            currentNode=currentNode.next;
        }


    }


}
