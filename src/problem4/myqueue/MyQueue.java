/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.node.Node;

public class MyQueue
{
    private Node front;
    private Node rear;
    private int size;

    public MyQueue()
    {
        front=null;
        rear=null;
        size=0;
    }

    public int getSize()
    {
        return size;
    }

    boolean isEmpty()
    {
        boolean response=false;
        if(front == null)
        {
            response=true;
        }
        return response;
    }

    public void enqueue(int element)
    {
        Node node=new Node(element);
        size++;
        if(isEmpty())
        {
            front=node;
            rear=node;
        }
        else
        {
            rear.setNext(node);
            rear=node;
        }
    }

    void preOrder(TreeNode node)
    {
        if(node!=null)
        {
            enqueue(node.getData());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void addData(MyBinarySearchTree tree)
    {
        preOrder(tree.getRoot());
    }

    public void printQueue()
    {
        Node temp=front;
        while(temp.getNext() != null)
        {
            System.out.print(temp.getData()+"--->");
            temp=temp.getNext();
        }
        System.out.print(temp.getData());
    }


}
