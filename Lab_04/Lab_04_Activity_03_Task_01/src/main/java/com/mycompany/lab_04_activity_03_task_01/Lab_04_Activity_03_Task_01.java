/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_04_activity_03_task_01;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_04_Activity_03_Task_01 {
    int[] queue = new int[5];
    int front = -1;
    int rear = -1;
    
    public void enqueue(int value)
    {
        if(rear==queue.length-1)
        {
            System.out.println("Queue Overflow, Queue is full.");
        }
        else
        {
            if(front==-1)
            {
                front=0;
            }
            rear++;
            queue[rear]=value;

            System.out.println(value+" enqueued into Queue.");
        }
    }
    public void dequeue()
    {
        if(front==-1||front>rear)
        {
            System.out.println("Queue Underflow, Queue is empty.");
        }
        else
        {
            System.out.println(queue[front]+" dequeued from Queue.");
            front++;
            if(front>rear)
            {
                front=-1;
                rear=-1;
            }
        }
    }
    public void peek()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty.");
        }
        else
        {
            System.out.println("Front element is: "+queue[front]);
        }
    }
    public void display()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty.");
        }
        else
        {
            System.out.println("Queue elements:");

            for(int i=front; i<=rear; i++)
            {
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Lab_04_Activity_03_Task_01 q = new Lab_04_Activity_03_Task_01();
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.peek();
        q.dequeue();
        q.display();
    }
}
