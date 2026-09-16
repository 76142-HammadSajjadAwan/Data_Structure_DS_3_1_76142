/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_task_02;
       import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_Task_02 {

    public static void main(String[] args) {
        //Activity No.01
       /* Scanner input = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = input.nextInt();
        System.out.println("Marks = " + marks);*/
        
        //Activity No.02
       /* if (marks >= 85)
            System.out.println("A");
        else if (marks >= 70)
            System.out.println("B");
        else if (marks >= 50)
            System.out.println("C");
        else
            System.out.println("Fail");*/
       
       //Activity No.03
       /*Scanner input=new Scanner(System.in);
       int choice = input.nextInt();
        switch (choice) {
        case 1:
            System.out.println("Insert");
            break;
        case 2:
            System.out.println("Delete");
            break;
        default:
            System.out.println("Invalid choice");
        }*/
       
       //Student Exercise
       //Task 15
       /*Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("Larger value: " + num1);
        } else {
            System.out.println("Larger value: " + num2);
        }
        input.close();*/
       
       //Task 16
       /*Scanner input=new Scanner(System.in);
       System.out.println("Enter Marks: ");
       int marks=input.nextInt();
       System.out.println("Enter attendance:" );
       float attendance=input.nextFloat();
       if(marks>60 && attendance>75.0)
       {
           System.out.println("Eligible.");
       }
       else
       {
           System.out.println("Not Eligible.");
       }*/
       
       //Task 17
       /*Scanner input= new Scanner(System.in);
       System.out.println("Enter the day number.");
       int day=input.nextInt();
          switch(day){
              case 1:
                  System.out.println("Monday");
                  break;
              case 2:
                  System.out.println("Tuesday");
                  break;
              case 3:
                  System.out.println("Wednesday");
                  break;
              case 4:
                  System.out.println("Thursday");
                  break
              case 5:
                  System.out.println("Friday");
                  break;
              case 6:
                  System.out.println("Saturday");
                  break;
              case 7:
                  System.out.println("Sunday");
                  break;
              default:
                  System.out.println("Invalid choice!");
          }*/
       
       //Task 18
       /*Scanner input= new Scanner(System.in);
       System.out.println("Enter the day number.");
       int day=input.nextInt();
          switch(day){
              case 1:
                  System.out.println("Monday");
                  break;
              case 2:
                  System.out.println("Tuesday");
                  break;
              case 3:
                  System.out.println("Wednesday");
                  break;
              case 4:
                  System.out.println("Thursday");
                  
              case 5:
                  System.out.println("Friday");
                  break;
              case 6:
                  System.out.println("Saturday");
                  break;
              case 7:
                  System.out.println("Sunday");
                  break;
              default:
                  System.out.println("Invalid choice!");
          }*/
       
       // Challenge Task
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Result = " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

