/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("=============================================================");
            System.out.println("            LAB 5 —QUEUE TYPES & INFIX TO POSTFIX="          );
            System.out.println("=============================================================");
            System.out.println("1. Circular Queue"); 
            System.out.println("2. Priority Queue");
            System.out.println("3. Deque");
            System.out.println("4. Infix to Postfix");
            System.out.println("5. Exit");
            System.out.println("============================================");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch(choice){
                //=================================
                //Circular Queue
                //=================================
                case 1:
                    CircularQueue circularQueue = new CircularQueue(); 
                    int circularChoice; 
                    do {
                        System.out.println();
                        System.out.println("---------- CIRCULAR QUEUE ----------"); 
                        System.out.println("1. Enqueue"); 
                        System.out.println("2. Dequeue");
                        System.out.println("3. Peek");
                        System.out.println("4. Display");
                        System.out.println("5. Back to Main Menu");
                        System.out.print("Enter your choice: "); 
                        circularChoice = input.nextInt();
                        switch (circularChoice) {
                            case 1: 
                                System.out.print("Enter value: "); 
                                int value = input.nextInt(); 
                                circularQueue.enqueue(value);
                                break; 
                            case 2: 
                                circularQueue.dequeue(); 
                                break; 
                            case 3: 
                                circularQueue.peek(); 
                                break; 
                            case 4:
                                circularQueue.display(); 
                                break;
                            case 5:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                    }while (circularChoice != 5);
                    break;
                //===============================
                //Priority Queue
                //===============================
                case 2:
                    System.out.println("Enter Priority Queue Capacity: ");
                    int capacity=input.nextInt();
                    PriorityQueue priorityQueue = new PriorityQueue(capacity);
                    int priorityChoice;
                    do{
                        System.out.println("---------- PRIORITY QUEUE ----------");
                        System.out.println("1.Enqueue");
                        System.out.println("2.Dequeue");
                        System.out.println("3.Display");
                        System.out.println("4.Back to Main Menu");
                        System.out.println("Enter your choice: ");
                        priorityChoice = input.nextInt();
                        switch(priorityChoice)
                        {
                            case 1:
                                System.out.print("Enter value: ");
                                int value = input.nextInt();
                                
                                System.out.print("Enter priority: ");
                                int priority = input.nextInt();
                                priorityQueue.enqueue(value, priority); 
                                break;
                            case 2:
                                priorityQueue.dequeue();
                                break;
                            case 3:
                                priorityQueue.display();
                                break;
                            case 4:
                                System.out.println("Returning to Main Menu...");
                                break;
                            default:
                                System.out.println("Invalid Choice!");
                        }         
                    }while (priorityChoice != 4);
                //===============================
                //Deque
                //===============================
                case 3:
                    System.out.print("Enter Deque capacity: ");
                    int dequeCapacity = input.nextInt();
                    Dequeue deque = new Dequeue(dequeCapacity);
                    int dequeChoice;
                    do {
                        System.out.println("--------------- DEQUE ---------------");
                        System.out.println("1. Insert Front");
                        System.out.println("2. Insert Rear");
                        System.out.println("3. Delete Front");
                        System.out.println("4. Delete Rear");
                        System.out.println("5. Display");
                        System.out.println("6. Back to Main Menu");
                        System.out.println("Enter your choice: ");
                        dequeChoice=input.nextInt();
                        switch(dequeChoice)
                        {
                            case 1:
                                System.out.print("Enter value: ");
                                int frontValue = input.nextInt();
                                deque.insertFront(frontValue);
                                break;
                            case 2:
                                System.out.print("Enter value: "); 
                                int rearValue = input.nextInt(); 
                                deque.insertRear(rearValue); 
                                break;
                            case 3:
                                int deletedFront = deque.deleteFront();
                                if (deletedFront != -1)
                                {
                                    System.out.println("Deleted from Front: " + deletedFront); 
                                }
                                break;
                            case 4:
                                int deletedRear = deque.deleteRear();
                                if (deletedRear != -1)
                                {
                                    System.out.println("Deleted from Rear: " + deletedRear);
                                }
                                break;
                            case 5:
                                deque.display();
                                break;
                            case 6:
                                System.out.println("Returning to Main Menu...");
                                break; 
                            default:
                                System.out.println("Invalid choice!");
                        }
                    }while (dequeChoice != 6);
                    break;
                //===========================
                //Infix to Postfix
                //===========================
                case 4:
                    InfixPostfix obj=new InfixPostfix();
                    input.nextLine();
                    System.out.print("Enter Infix Expression: ");
                    String expression = input.nextLine();
                    String result = obj.infixToPostfix(expression);
                    System.out.println("Infix Expression: "+expression);
                    System.out.println("Postfix Expression: " + result);
                    
                    System.out.print("Enter Postfix Expression: ");
                    String postfix = input.nextLine();  
                    int answer = obj.evaluatePostfix(postfix);
                    System.out.println("Postfix Expression: " + postfix);
                    System.out.println("Result: " + answer);

                    break;
                //EXIT
                //=============================
                case 5:
                    System.out.println("Program exited successfully."); 
                    break;  
                default:
                    System.out.println("Invalid choice! Please enter 1 to 5.");
            }
        }while (choice != 5);
        input.close();
    }
}
