import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>();
//        integers.

//    ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
//        Main mai=new Main();
//    mai.removeNthFromEnd(head,3);
//    String s="bdea";
//    StringBuilder ss1=new StringBuilder(s);
        ListNode list1=new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2=new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode[] listtt=new ListNode[2];
        listtt[0]=list1;
        //listtt[1]=list2;




        ListNode head=new ListNode();
        ListNode trav=head;
        ListNode temp=null;
        for(ListNode ll:listtt){
            while(ll!=null){
            if(trav.next==null){
                trav.next=ll;
                trav=trav.next;
                break;
            }
//            if(trav.val<ll.val){
//
//            }
            }
        }



//        while(list1!=null || list2!=null){
//            if(list1==null && list2!=null){
//                trav.next=new ListNode(list2.val);
//                trav=trav.next;
//                list2=list2.next;
//            }
//            else if(list2==null && list1!=null){
//                trav.next=new ListNode(list1.val);
//                trav=trav.next;
//                list1=list1.next;
//            }
//            if(list1.val<=list2.val){
//                trav.next=new ListNode(list1.val);
//                trav=trav.next;
//                list1=list1.next;
//            }
//            else if(list1.val>list2.val){
//                trav.next=new ListNode(list2.val);
//                trav=trav.next;
//                list2=list2.next;
//            }
//        }



//
//        char[] dd=s.toCharArray();
//        List<String> ss=new ArrayList<>();
//        for(int i=0;i<dd.length-1;i++){
//            String ll="";
//            for(int j=0;j<dd.length-1;j++){
//
//
//                char one=dd[i];
//                char tw0=dd[j];
//
//                    if(dd[j]==one){
//                        dd[j]=tw0;
//                    }else if(dd[j]==tw0){
//                        dd[j]=one;
//                    }
//                    ll+=dd[j];
//                }
//                ss.add(ll);
//                ll="";
//
//
//
//
//        }
//        Collections.sort(ss);
//        System.out.println(ss);

//        int[] sxc={1,2,3,4,5,3,1};
//
//
//
//        int start=0,last=sxc.length-1;
//        int mid=start+(last-start)/2;
////        int find=sxc[mid];
//        while(start<last){
//            if (sxc[mid]>sxc[mid+1]) {
//                last=mid;
//            }
//             else {
//                start=mid+1;
//
//            }
//            mid=start+(last-start)/2;
//        }

//        if(start!=sxc.length){

          //  System.out.println(start);
//        }
//        System.out.println(sxc[0]);
//    System.out.println(sxc[start]);







//        String s="aa",p=".*";
//        String p1="";
//        int itr=0;
//        if(p.equals(".*")) {
//            System.out.println(true);
//        }
//        for(int i=0;i<p.length();i++){
//
//            if(p.charAt(i)=='.'){
//                p1=""+s.charAt(i);
//            }else{
//            p1=""+p.charAt(i);}
//        }


        // TODO : plus one
//        int[] nums = {1,2,3};
//        int plus=0,i=0;
//        List<Integer> kkj=new ArrayList<>();
//      for(i=0;i<nums.length;i++){
//          plus=(nums[i])+plus*10;
//      }
//      System.out.println(nums);
//        System.out.println("done");
//
    }

    public void removeNthFromEnd(ListNode head, int n) {
        int listlen=0,i=0;
        ListNode temp=head;
        ListNode temp1=head;
    while(temp!=null){
        listlen++;
        temp=temp.next;
    }
        while(i<listlen){
        i++;
            temp1 = temp1.next;
        if(i==n && temp1.next!=null) {
            temp1.next = new ListNode(temp1.next.val,temp1.next.next);
        } else if (i==n && temp1.next==null) {
            temp1.next=null;
        }

        }
    System.out.println(temp1);
    System.out.println(head);
    System.out.println(listlen);
    }
}