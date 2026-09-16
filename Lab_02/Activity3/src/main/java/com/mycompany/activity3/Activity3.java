/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity3;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Activity3 {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        Node fifth=new Node(50);
        
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        
        System.out.print("Initial List:");
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
        
        Node newBeginnig =new Node(6);
        newBeginnig.next=head;
        head=newBeginnig;
        
        Node newEnd=new Node(100);
        current=head;
        
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newEnd;
        
        int searchValue=50;
        boolean found=false;
        
        current=head;
        while(current!=null)
        {
            if(current.data==searchValue)
            {
                found=true;
                break;
            }
            current=current.next;
        }
        
        if(found)
        {
            System.out.println(searchValue+ " Found.");
        }
        else
        {
            System.out.println(searchValue+" Not Found.");
        }
        
        int deleteValue=40;
        current=head;
        while(current!=null && current.next!=null)
        {
            if(current.next.data==deleteValue)
            {
                current.next=current.next.next;
                break;
            }
            current=current.next;
        }
        
        System.out.print("Final Display: ");
        current =head;
        while(current!=null)
        {
            System.out.print(current.data+ " ");
            current=current.next;
        }
    }
}
        