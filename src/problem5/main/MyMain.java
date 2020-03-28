/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain
{
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue();
        obj.enqueue(new Student(1,"A",4,0));
        obj.enqueue(new Student(2,"B",4,1));
        obj.enqueue(new Student(3,"C",4,4));
        obj.enqueue(new Student(4,"D",2,1));
        obj.enqueue(new Student(5,"E",2,2));
        obj.enqueue(new Student(6,"F",0,0));
        obj.process();
        obj.display();

    }
}
