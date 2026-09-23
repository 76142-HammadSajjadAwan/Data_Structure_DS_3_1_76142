/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_04_activity_02_task_01;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_04_Activity_02_Task_01 {
    int[] stack = new int[5];
    int top = -1;

    public void push(int value)
    {
        if(top==stack.length-1)
        {
            System.out.println("Stack Overflow, Stack is full.");
        }
        else
        {
            top++;
            stack[top]=value;
            System.out.println("[Pushed Value: "+value);
        }
    }

    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow, Stack is empty.");
        }
        else
        {
            System.out.println("Popped Value: "+stack[top]);
            top--;
        }
    }

    public void peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.println("Top element is: "+stack[top]);
        }
    }

    public void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.println("Stack elements:");

            for(int i=top; i>=0; i--)
            {
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Lab_04_Activity_02_Task_01 s = new Lab_04_Activity_02_Task_01();
        
        s.push(10);
        s.push(20);
        s.push(30);
        
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
