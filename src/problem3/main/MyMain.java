/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain
{
    public static void main(String[] args)
    {
        MyPriorityQueue myQueue=new MyPriorityQueue();
        myQueue.enqueue(new Student(29,"A"));
        myQueue.enqueue(new Student(2,"B"));
        myQueue.enqueue(new Student(9,"C"));
        myQueue.enqueue(new Student(13,"C"));
        myQueue.enqueue(new Student(32,"D"));
        myQueue.enqueue(new Student(45,"E"));
        myQueue.printQueue();
    }
}
