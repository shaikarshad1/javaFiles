package Trees;

import java.util.Scanner;

public class BinaryTree {
    private Node root;
    class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    void insertElements(int[] arr){
        if(root==null){
            Node newNode=new Node(arr[0]);
            root=newNode;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[0]>1){

            }
        }
    }

    void bsInsert(Scanner sc){
        int val=sc.nextInt();
       root=new Node(val);
       populate(sc,root);


    }

    private void populate(Scanner sc, Node root) {
        System.out.println("left");
        boolean left=sc.nextBoolean();
        if(left){
            int val=sc.nextInt();
            Node le=new Node(val);
            root.left=le;
            populate(sc,le);
        }
        System.out.println("right");
        boolean right=sc.nextBoolean();
        if(right){
            int val=sc.nextInt();
            Node rig=new Node(val);
            root.right=rig;
            populate(sc,rig);
        }
    }

    void display(){
        display(root," ");
    }
    void display(Node root,String in){
        if(root==null){
            return;
        }
        System.out.println(root.value);
        display(root.left,in+"\t");
        display(root.right,in+"\t");
    }

    void recrssionBSTInsert(Node tree,int val){
        if(tree.value>val){
            recrssionBSTInsert(tree.left,val);
        }
        if(tree.value<val){
            recrssionBSTInsert(tree.right,val);
        }
    }


}
