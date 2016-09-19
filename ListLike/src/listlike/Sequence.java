package listlike;
import java.util.*;


/**
 * Created by shsoni on 9/18/2016.
 */
class Sequence{
   // private static int counter;
    private Node tail;
    private Node head;
    private static int counter;
    public Sequence(){}

    public void add(Object data) {
        if(tail == null){
            tail = new Node(data);
            head = tail;
        }
        else{
            Node curr = tail;
            Node temp = new Node(data);
            curr.next = temp;
            tail = temp;
        }
        incrementCounter();
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    public Object get(int idx){
        if(idx < 0){
            return null;
        }
        Node curr = null;
        if(head != null){
            curr = head;
            for(int i =0; i<idx;i++){
                if(curr.getNext() == null){
                    return null;
                }
                curr = curr.getNext();
            }
            return curr.getData();
        }
        return null;
    }

    public int size() {
        return getCounter();
    }



    public class Node{
        Node next;
        Object data;
        public Node(Object data) {
            this.next = null;
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

    }

    public Iterator iterator(){
        return new SequenceIterator();
    }

    private class SequenceIterator  implements Iterator{
        private Node nextNode = head;


        public boolean hasNext(){
            return nextNode != null;
        }

        public Object next(){
            Object res = nextNode.data;
            nextNode = nextNode.next;
            return res;
        }
    }


}

