/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_task_03;
import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_Task_03 {

    public static void main(String[] args) {
        //Activity No.01
        /*int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }*/
        
        //Activity No.02
        /*int i = 1;
         do
         {
            System.out.println(i);
            i++;
         }while (i <= 5) ;*/
        
        //Activity No.03
       /*int sum = 0;
       int n=5;
       for (int i = 1; i <= n; i++) {
            sum += i;
       }
       System.out.println("Sum: "+sum);*/
       
       //Activity No.04
       /*double[] values={2.5,3.0,4.5};
       double sum=0;
               for(double value:values){
                   sum+=value;
               }
               System.out.println("Sum: "+sum);*/
       
       //Activity N0.05
       /*for (int i = 1; i <= 10; i++) {
         if (i == 5)
            continue;
         if (i == 9)
            break;
            System.out.println(i);
    }*/
       
     //Student Exercise
     //Task 23
     /*int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        } */   
     
     //Task 24
     /* Scanner sc=new Scanner(System.in);
       int numbers;
       do
       {
           System.out.println("Enter positive numbers: ");
           numbers=sc.nextInt();
       }while(numbers<=0);*/
     
     //Task 25
      /*Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int factorial = 1;
        for(int i=n;i>0;i--)
        {
            factorial*=i;
        }
        System.out.println("Factorial: "+factorial);*/
      
      //Task 26
      /*int [] numbers={56,23,9,7};
        int max=numbers[0];
        for(int num:numbers )
        {
            if(num>max)
            {
                max=num;
            }
        }
          System.out.println("The maximum value is: " + max);*/
      
      //Task 27
      /*for(int i=0;i<=20;i++)
       {
           if(i%3==0)
           {
               continue;
           }
           System.out.println(i);
       }*/
      
      //Task 28
      /*Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num == -1) {
                break;
            }
        }
        System.out.println("Loop stopped.");*/
      
      //Challenge Task
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of courses: ");
        int n = input.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for course "+(i + 1)+": ");
            marks[i] = input.nextInt();
        }
        int sum = 0;
        int maximum = marks[0];
        for (int i = 0; i < n; i++) {
            sum += marks[i];
            if (marks[i] > maximum) {
                maximum = marks[i];
            }
        }
        int count = 0;
        for (int mark : marks) {
            if (mark >= 50) {
                count++;
            }
        }
 
        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + maximum);
        System.out.println("Marks at least 50 = " + count);
    }
}
