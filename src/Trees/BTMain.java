package Trees;

import java.util.Scanner;

public class BTMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.bsInsert(sc);
        binaryTree.display();
    }

}
