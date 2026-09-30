/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class CircularQueue {
    private int capacity=5;
    private int[] queue=new int[capacity];
    private int front=0,rear=0,size=0;
    
    public boolean isEmpty()
    {
        return size==0;
    }
    
    public boolean isFull()
    {
        return size==capacity;
    }
    
    public void enqueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue overflow! It is full.");
            return;
        }
        queue[rear]=value;
        rear=(rear+1)%capacity;
        size++;
        System.out.println(value+ " inserted successfully.");
    }
    
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue underflow! It is empty.");
            return;
        }
        System.out.println(queue[front]+" removed.");
        front=(front+1)%capacity;
        size--;
    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Peek Element: "+queue[front]);
    }
    
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is underflow! It is empty.");
        }
        System.out.println("=======================");
        System.out.println("    Circular Queue     ");
        System.out.println("=======================");
        
        for(int i=0;i<size;i++)
        {
            int index=(front+i)%capacity;
            System.out.print(queue[index]+" ");
        }
        System.out.println();
    }
}

