package linkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListV2 {

    private Node head;
    private Node tail;


    public class Node{
        int val;
        Node next;

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }

        public Node() {
        }
    }

    void insert(int n){
        if(head==null){
            head=new Node(n);

        }else {
        Node newN=new Node(n);
        newN.next=head;
        head=newN;}
    }


    void insert(int[] n){
        if(head==null){
            System.out.println(n[0]);
            head=new Node(n[0]);
        }
        Node t=head;
        for(int i=1;i<n.length;i++){
            System.out.println(n[i]);
            t.next=new Node(n[i]);
            t=t.next;
        }
        System.out.println("insert done");
    }

    void insertLast(int[] n){
        if(head==null){
            System.out.println(n[0]);
            head=new Node(n[0]);
        }
        Node t=head;
        while(t.next!=null){
//            System.out.print(t.val+" -> ");
            t=t.next;
        }
        for(int i=0;i<n.length;i++){
//            System.out.println(n[i]);
            t.next=new Node(n[i]);
            t=t.next;
        }
        System.out.println("insert done");
    }

    void display(){
        Node t=head;
        while(t!=null){
            System.out.print(t.val+" -> ");
            t=t.next;
        }
        System.out.println("display done");
    }

    void display(Node n){
        Node t=n;
        while(t!=null){
            System.out.print(t.val+" -> ");
            t=t.next;
        }
        System.out.println("display done");
    }

    Node retHead(){
        return head;
    }
    Node deleteDuplicates(Node n){
//        int fVal=head.val;
        Node t=head;
        Node t1=new Node();
        Node t2=t1;
        while(t.next!=null){
            if(t.val!=t.next.val){
                t = t.next;
//                    t2=t2.next;


            }else {

                t.next=t.next.next;
            }
        }

        return head;
    }

    public boolean hasCycle(Node head) {
        Node t=head;
        List<Integer> r=new ArrayList<>();
//        r.add(t.val);
        while(t!=null){

            if(r.contains(t.val) && t.next.next!=null && t.next.val==t.next.next.val){
                return true;
            }
            r.add(t.val);
            t=t.next;
        }
        return false;
    }

    public boolean isHappy(int n) {

        return false;
    }

    public Node reverseBetween(Node head, int left, int right) {
        Node r=new Node();
        Node reverse=r;
        int i=1;
        while(head!=null){
            Node newN=new Node(head.val);
            reverse.next=newN;
            reverse=reverse.next;
            head=head.next;
            i++;
            while(i>=left && i<right){
                newN=new Node(head.val);
                newN.next=reverse;
                reverse=newN;
                head=head.next;i++;
            }

        }
        return r.next;

    }

    public boolean isPalindrome(Node head) {
        Node t=head;
        Node r=null;
        while (t!=null){
            Node n=new Node(t.val);
            n.next=r;
            r=n;
            t=t.next;

        }

        while(r!=head){
            if(r.val!= head.val){
                return false;

            }
            r=r.next;
            head=head.next;
        }
        return true;
    }

    public Node deleteMiddle(Node head) {
        Node f=head;
        Node s1=new Node();
        Node s=s1;
        int len=0;

        while(f!=null){
            f=f.next;
           len++;
        }
        f=head;
        int m=len/2,st=0;
        while(f!=null){

            if(st==m ){
                if(f.next==null){
                    return s1.next;
                }
                System.out.println(f.val);
               f=f.next;
            }
            Node n=new Node(f.val);
            s.next=n;
            s=s.next;
            f=f.next;
            st++;
        }
        // s.next=s.next.next;
        System.out.println(len);
        return s1.next;

    }

    public Node deleteDuplicates1(Node head) {
        Node prev=null;
        Node pres=head;
        Node next=head.next;
        Node r=new Node();
        Node r1=r;
        while(pres.next!=null){
          if(prev==null && pres.val!=next.val){
            r1=new Node(pres.val);
          }
          prev=pres;
          pres=next;
          next=next.next;
        }
        return r.next;
    }

    Node recrivse(Node head){
        if(head.next!=null){
            return head;
        }
        Node n=null;
        tail.next=n;
        tail=n;
        return n;
    }

    public void reorderList(Node n) {
        Node t=n;
        Node r=null;
        Node re=new Node();
        Node re1=re;
        int len=0;
        while (t!=null){
            Node n1 =new Node(t.val);
            n1.next=r;
            r= n1;
            t=t.next;
            len++;
        }
        len=len/2;
        while((len)>0){
            re1=new Node(n.val);
            re1.next=new Node(r.val);
            re1=re1.next;
            r=r.next;
            n=n.next;
            len--;
        }
        re1=new Node(n.val);
        display(re);
    }
}
