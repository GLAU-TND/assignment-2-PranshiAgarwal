/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;
public class MyMain {
   public static void main(String[] args) {
        MyBinarySearchTree mytree = new MyBinarySearchTree();
        mytree.insert(50);
        mytree.insert(30);
        mytree.insert(20);
        mytree.insert(40);
        mytree.insert(70);
        mytree.insert(60);
        mytree.insert(80);
        mytree.insert(90);
        mytree.insert(10);
        System.out.println("PreOrder Traversal : ");
        mytree.traversePreOrder();
        MyQueue queue = new MyQueue();
        queue.storePreOrderSuccessor(mytree);
        queue.display();
}
}
