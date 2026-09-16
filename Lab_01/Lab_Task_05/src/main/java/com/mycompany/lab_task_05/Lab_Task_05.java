/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_task_05;
import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_Task_05 {
    public static void main(String[] args) {
        //Activity NO.01
        /*int a = 7;
        int b = 2;
        System.out.println(a / b);
        System.out.println((double) a / b);*/
        
        //Activity No.02
        /*int x = 5;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);*/
        
        //Activity No.03
        /*int age = 20;
        boolean hasCard = true;
        System.out.println(age >= 18 && hasCard);
        System.out.println(age >= 18 || hasCard);*/
        
        //Activity No.04
        /*double d = 9.8;
        int x = (int) d;
        double y = 10;
        System.out.println(x);
        System.out.println(y);*/
        
        //Student Exercise
        //Task 41
        /*int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average: " + average);*/
        
        //Task 42
        /*System.out.println(++average);
        System.out.println(average++);
        System.out.println(average);*/
        
        //Task 43
        /*int attendance = 80;
        int marks = 65;
        boolean eligible = attendance >= 75 && marks >= 50;
        System.out.println("Eligible: " + eligible);*/
        
        //Task 44
       /* double number = 9.8;
        int result = (int) number;
        System.out.println("Double: " + number);
        System.out.println("Integer: " + result);*/
       
       //Challenge Task
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first mark: ");
        int mark1 = input.nextInt();
        System.out.print("Enter second mark: ");
        int mark2 = input.nextInt();
        System.out.print("Enter third mark: ");
        int mark3 = input.nextInt();
        double average = (mark1 + mark2 + mark3) / 3.0;
        boolean pass = mark1 >= 50 && mark2 >= 50 && mark3 >= 50 && average >= 50;
        System.out.println("Average = " + average);
        if (pass) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
