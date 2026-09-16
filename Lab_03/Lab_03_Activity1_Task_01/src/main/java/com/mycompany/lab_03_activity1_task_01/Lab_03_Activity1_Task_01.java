/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_03_activity1_task_01;
import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_03_Activity1_Task_01 {
    public static int factorial(int num)
    {
        if(num==0||num==1)
        {
            return 1;
        }
        return num*factorial(num-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int result=factorial(num);
        System.out.println("Factorial of "+num+" is: "+result);
    }
}
