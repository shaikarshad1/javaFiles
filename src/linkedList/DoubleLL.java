package linkedList;

public class DoubleLL {

    private Node head;

    private class Node{
        private int value;
        private Node next;
        private Node prev;


        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node() {
        }


    }

    void arrayElements(int[] arr){
        if(head==null){
            Node newN=new Node();
            if(arr.length>0){
                newN.value=arr[0];
                newN.prev=null;
                newN.next=head;
                head=newN;
            }
        }
    }





}
