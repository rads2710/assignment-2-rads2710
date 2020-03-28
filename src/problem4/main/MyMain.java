/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain
{
    public static void main(String[] args)
    {
        MyBinarySearchTree tree=new MyBinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println("TREE PREORDER:");
        tree.preOrderTraverse();
        System.out.println();
        MyQueue queue=new MyQueue();
        queue.addData(tree);
        System.out.println("QUEUE DISPLAY:");
        queue.printQueue();
    }
}
