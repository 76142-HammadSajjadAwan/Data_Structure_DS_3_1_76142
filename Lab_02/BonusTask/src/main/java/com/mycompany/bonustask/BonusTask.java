/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bonustask;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class BonusTask {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        int[] marks = {78, 65, 90, 55, 82};
        System.out.print("Array Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        double sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+marks[i];
        }
        System.out.println("\nSum: "+sum);
        
        double average=sum/5;
        System.out.println("Average: "+average);
        
        int max=marks[0];
        for(int i=0;i<5;i++)
        {
            if(marks[i]>max)
            {
                max=marks[i];
            }
        }
        System.out.println("Maximum Marks: "+max);
        
        int min=marks[0];
        for(int i=0;i<5;i++)
        {
            if(marks[i]<min)
            {
                min=marks[i];
            }
        }
        System.out.println("Minimum Marks: "+min);
  
        for(int i=0;i<marks.length-1;i++)
        {
            for(int j=0;j<marks.length-i-1;j++)
            {
                if(marks[j]>marks[j+1])
                {
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                }
            }
        }
        //Singly Link list
        Node head = new Node(78);
        Node second = new Node(65);
        Node third = new Node(90);
        Node fourth = new Node(55);
        Node fifth = new Node(82);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println("\nLinked List:");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        
        Node newNode = new Node(95);
        newNode.next = head;
        head = newNode;
        
        int deleteValue = 90;
        current = head;
        while (current != null && current.next != null) {
            if (current.next.data == deleteValue) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        
        
        System.out.println("\nFinal Linked List:");
        current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        
        
        System.out.println("\nFinal Array:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
