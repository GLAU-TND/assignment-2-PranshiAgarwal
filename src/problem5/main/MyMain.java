/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class
import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;
import java.util.Random;
public class MyMain {
  public static void main(String[] args) {
        Random rand = new Random();
        MyCircularQueue queue = new MyCircularQueue();
        System.out.println("Adding Students :\n---------------------------");
        queue.enqueue(new Student(1, "virus", 2, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(2, "ninja", 4, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(3, "Magneto", 3, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(4, "Hulk", 5, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(5, "Professor", 0, rand.nextInt(2) + 1));
        queue.display(); System.out.println("Processing Elements :\n---------------------------");
        while (queue.processStudents() != false) {
        }
        queue.display();
    }
}
          
    

