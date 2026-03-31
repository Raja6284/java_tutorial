
//Linked list imp
//insert at n, insert at end, insert at start, delete at n, delete at start, delete at end, show method


class Node{
    int data;
    Node next;
}

class LinkedList{

    Node head = null;

    public void insertAtStart(int data){

        Node n = new Node();
        n.data = data;

        if(head != null){
            n.next = head;
            head = n;
        }else{
            head = n;
        }
        

    }

    public void insertAtEnd(int data){
        Node n = new Node();
        n.data = data;

        Node temp = head;

        if(head == null){
            insertAtStart(data);
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = n;

    }

    public void insertAtN(int data, int pos){

        Node n = new Node();
        n.data = data;

        Node temp = head;

        

        for(int i = 1; i<pos-1; i++){
            temp = temp.next;
        }

        Node in = temp.next;
        n.next = in;
        temp.next = n;
    }


    public void deleteAtStart(){

    }

    public void deleteAtEnd(){

    }

    public void deleteAtN(int pos){

    }

    public void show(){
        Node n = head;

        while(n != null){
            System.out.print(n.data + " " + "->" + " ");
            n=n.next;
        }
        System.out.print("null");
    }


}


public class Runner{
    public static void main(String args[]){

        LinkedList ll = new LinkedList();

        ll.insertAtStart(8);
        ll.insertAtStart(88);
        ll.insertAtStart(888);
        ll.insertAtStart(8888);
        ll.insertAtStart(88888);
        ll.insertAtStart(888888);


        ll.insertAtEnd(2);
        ll.insertAtEnd(22);
        ll.insertAtEnd(222);


        ll.insertAtN(234, 3);

        ll.show();
        
    }
}