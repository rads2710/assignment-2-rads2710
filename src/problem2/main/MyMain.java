/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;


import problem1.mybst.MyBinarySearchTree;

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
        System.out.println("PreOrder Traversal : ");
        tree.preOrderTraverse();
        System.out.println();
        System.out.println("PostOrder Traversal : ");
        tree.postOrderTraverse();
        System.out.println();
        System.out.println("Condition A:Root element is placed at opposite end, i.e. "+
                        "in pre order root is the first element where as in post order root is the last element is TRUE");
        System.out.println("Condition B:They have common mid point,"+
                "i.e. both the traversal will give same element at the mid position for odd number of nodes is FALSE");
    }
}
