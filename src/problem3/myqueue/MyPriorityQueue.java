/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue
{
    private Node front;
    private Node rear;
    private int size;

    public MyPriorityQueue()
    {
        front=null;
        rear=null;
        size=0;
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

    public void enqueue(Student element)
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

            if(element.getRollNo()>=rear.getStudent().getRollNo())
            {
                rear.setNext(node);
                rear=node;
            }
            else if(element.getRollNo()<=front.getStudent().getRollNo())
            {
                node.setNext(front);
                front=node;
            }
            else
            {
                Node prev = front;
                Node temp = front;
                while (temp.getNext() != null)
                {
                    if (temp.getStudent().getRollNo() > element.getRollNo())
                    {
                        break;
                    }
                    prev=temp;
                    temp=temp.getNext();
                }
                prev.setNext(node);
                node.setNext(temp);
            }
        }
    }

    public int getSize()
    {
        return size;
    }

    public void printQueue()
    {
        Node temp=front;
        while(temp.getNext() != null)
        {
            System.out.print(temp.getStudent()+"--->");
            temp=temp.getNext();
        }
        System.out.print(temp.getStudent());
    }
}
