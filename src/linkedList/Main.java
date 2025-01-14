package linkedList;




public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        LinkedListV2 ll=new LinkedListV2();
//        ll.insertArrayElements(arr);
//        ll.insertFirst(1000);
//        ll.insertAtLast(100);
//        ll.insertTIndex(4,20);
        ll.insert(arr);
//        ll.insert(1);
//        ll.insert(1);
//        ll.insert(2);
//        ll.insertLast(arr);
        ll.display();
        LinkedListV2.Node h=ll.retHead();
        ll.reorderList(h);
        ll.display();
//        LinkedListV2.Node h1=ll.reverseBetween(h,2,4);
//        boolean h1= ll.hasCycle(h);
//        ll.display(h1);
//        ll.display(ll.deleteDuplicates1(h));
//        ll.removeNthNodeFromEnd(2);
//      ll.reverse();


    }


}
