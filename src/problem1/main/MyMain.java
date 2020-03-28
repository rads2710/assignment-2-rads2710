/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain
{
    public static void main(String[] args)
    {
        MyBinarySearchTree tree=new MyBinarySearchTree();
        tree.insert(5);
        tree.insert(1);
        tree.insert(10);
        tree.insert(4);
        tree.insert(6);
        System.out.println("ALL LEFT NODES ARE:");
        tree.printLeftNode();
        System.out.println("COUNT OF NODES NOT HAVING NODE");
        tree.countNotLeft();
    }
}
