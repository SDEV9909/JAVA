package prog.collect;
class Node2<T>{
    T data;
    Node2<T> next;
    Node2(T data){
        this.data = data;
        this.next = null;
    }
}
public class Generic_linkedList<T> {
    Node2<T> HEad;
    public void append(T data){
        Node2<T> newNode = new Node2<>(data);
        if(HEad == null){
            HEad = newNode;
            return;
        }
        Node2<T> Current = HEad;
        while(Current.next != null){
            Current = Current.next;
        }
        Current.next = newNode;
    }
    public void Printlistt(){
        Node2<T> CUrrent = HEad;
        while(CUrrent != null){
            System.out.print(CUrrent.data + "->");
            CUrrent = CUrrent.next;
        }
        System.out.print("Null\n");
    }

    public static void main(String[] args) {
     Generic_linkedList<Integer> g1 = new Generic_linkedList<>();
     g1.append(2);
     g1.append(3);
     g1.Printlistt();
     Generic_linkedList<String> g2 = new Generic_linkedList<>();
     g2.append("apple");
     g2.append("Mango");
     g2.append("Litchi");
     g2.Printlistt();
    }
}
