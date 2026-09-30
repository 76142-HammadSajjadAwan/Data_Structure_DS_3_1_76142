/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class PriorityQueue {
    static class Priority{
        private int value;
        private int priority;
        
        public Priority(int value,int priority)
        {
            this.value=value;
            this.priority=priority;
        }
    }
    private Priority[] arr;
    private int size;
    
    public PriorityQueue(int capacity)
    {
        arr=new Priority[capacity];
        size=0;
    }
    
    public void enqueue(int value,int priority)
    {
        if(size==arr.length)
        {
            System.out.println("Queue is Full.");
            return;
        }
         arr[size]=new Priority(value,priority);
         size++;
         System.out.println("Value: "+value+"  Priority: "+priority);
    }
    
    public void dequeue()
    {
        if(size==0)
        {
            System.out.println("Queue is Empty");
            return;
        }
        int highestPriorityIn=0;
        for(int i=1;i<size;i++)
        {
            if(arr[i].priority<arr[highestPriorityIn].priority)
            {
                highestPriorityIn=i;
            }
        }
        System.out.println("Removed Element");
        System.out.println("Value: "+arr[highestPriorityIn].value+ "        Priority: "+arr[highestPriorityIn].priority);  
        
        for(int i=highestPriorityIn;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[size-1]=null;
        size--;
    }
        public void display()
        {
            if(size==0)
            {
                System.out.println("Queue is underflow! It is empty.");
            }
            System.out.println("=======================");
            System.out.println("    Priority Queue     ");
            System.out.println("=======================");
            for(int i=0;i<size;i++)
            {
                System.out.println("Value: "+arr[i].value+"      Priority: "+arr[i].priority);
            }
        }    
}


