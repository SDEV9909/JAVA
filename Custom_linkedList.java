package prog.collect;

import java.util.concurrent.Callable;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Custom_linkedList {
    Node head; // as it is non stattic it is by default null


    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node Current = head;
        while (Current.next != null){
            Current = Current.next;
        }
       Current.next = newNode;
    }
    public void Printlist(){
        Node Current = head;
        while(Current != null){
            System.out.print(Current.data+"->");
            Current = Current.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
 Custom_linkedList list = new Custom_linkedList();
 list.append(10);
 list.append(20);
 list.append(30);
 list.append(40);
 list.Printlist();
    }
}

