/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue
{
    Node front;
    Node rear;
    int size;

    public MyCircularQueue()
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
            rear.setNext(front);
        }
        else
        {
            rear.setNext(node);
            rear=node;
            rear.setNext(front);
        }
    }
    public void process()
    {
        int counter=size;
        while(counter>0)
        {
            counter--;
            Student s=front.getData();
            if(s.getBackLog()-s.getAppearingCount() <= 0 )
            {
                rear.setNext(front.getNext());
                front=front.getNext();
            }
            else
            {
                front = front.getNext();
                rear = rear.getNext();
            }
        }

    }

    public void display()
    {
        Node temp = front;
        System.out.println();
        while(temp.getNext()!=front)
        {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }
}
