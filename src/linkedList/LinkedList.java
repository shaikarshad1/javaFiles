package linkedList;

public  class LinkedList{
    private Node head;
    private Node reve;

    public void insertAtLast(int i) {
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        System.out.println(temp==null);
        Node neww=new Node(i);
        temp.next=neww;

    }
    void deleteFirst(){
        head=head.next;
    }

//    void delteLast(){
//        Node temp=head;
//        while (temp.next!=null){
//            temp=temp.next;
//            if(temp.next.next==null){
//                return;
//            }
//        }
//
//        temp=null;
//    }

    void delteAtIndex(int i){
        Node temp=head;
        for(int j=1;j<i;j++){
            temp=temp.next;
        }
        Node newVal=temp.next.next;
        temp.next=newVal;
    }

    public void insertTIndex(int i, int i1) {
        Node temp=head;
        for(int j=1;j<i;j++){
            temp=temp.next;
        }
        Node newVal=new Node(i1,temp.next);
        temp.next=newVal;
    }

    public class Node {
    private int value;
    private Node next;
//    private Node prev;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

}

public void insertFirst(int val){
    Node newNode=new Node(val);
    newNode.next=head;
    head=newNode;
}
    public void insertArrayElements(int[] arr){
//        if
//        Node head=new Node();
        if(head==null){
            if(arr.length!=0){
                Node newNode=new Node(arr[0]);
                newNode.next=head;
                head=newNode;

            }
            else {
                return;
            }
        }
        Node temp=head;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
//    return head.next;
    }

    void display(){
        Node temp=head;
        while ((temp!=null)){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("end");
    }

    void display(Node n){
        Node temp=n;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("end");
    }

    void reverse(){
        Node temp=head;

        Node rtemp=reve;
        while(temp!=null){
            int val= temp.value;
            temp=temp.next;
            Node newn=new Node(val);
            newn.next=rtemp;
            rtemp=newn;

        }
        display(rtemp);
    }

   void removeNthNodeFromEnd(int n){
        Node temp=head;
        Node temp1=head;
        int len=0;
       while(temp!=null){
           len+=1;
           temp=temp.next;
       }
       for(int i=1;i<len-n;i++){
           temp1=temp1.next;
       }
        if(temp1.next!=null) {
            temp1.next = temp1.next.next;
        }
       if(len-n==0){
           head=head.next;
       }
       display(head);
    }

    void deleteValue(int val){
        Node t=head;
        while(t!=null){
            if(t.value==val){
                if(t.next!=null) {
                    t.next = t.next.next;
                }
                t=null;
            }
            t=t.next;
        }

    }
}
