/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fintechtradingmanagement;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class TransactionStack {
    private Transaction[] stack;
    private int top;

    public TransactionStack(int size)
    {
        stack = new Transaction[size];
        top=-1;
    }
    
    public void push(Transaction tr)
    {
        if(top==stack.length-1)
        {
            System.out.println("Stack overflow.");
            return;
        }
        top++;
        stack[top]=tr;
        
    }
    
    public Transaction pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow.");
            return null;
        }
        Transaction tr=stack[top];
        top--;
        return tr;
    }
    
    public Transaction peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty.");
            return null;
        }
        return stack[top];
    }
    
    public void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty.");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println("Transaction ID: "+stack[i].getTransactionId());
            System.out.println("Asset: "+stack[i].getAssetName());
            System.out.println("Type: "+stack[i].getTransactionType());
            System.out.println("Quantity: "+stack[i].getQuantity());
        }
    }
}
