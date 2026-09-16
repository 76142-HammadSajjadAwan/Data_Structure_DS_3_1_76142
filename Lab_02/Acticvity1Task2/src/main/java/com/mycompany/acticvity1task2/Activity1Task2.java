/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acticvity1task2;
import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Activity1Task2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numeber of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols=sc.nextInt();
        
        int[][] arr=new int[rows][cols];
        double sum=0;
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the values for rows: "+(i+1)+" Columns"+(j+1));
                arr[i][j]=sc.nextInt();
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Sum: "+sum);
        double average=sum/arr.length;
        System.out.println("Average: "+average);
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        int max=arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("\nMaximum Value: "+max);
        
        int min=arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Minimun Value: "+min);
        int sumrows;
        for (int i = 0; i < rows; i++) {
            sumrows=0;
            for (int j = 0; j < cols; j++) {
                sumrows=sumrows+arr[i][j];
            }
            System.out.println("Sum fo row"+(i+1)+": "+sumrows);
        }
        
        int sumcols;
        for (int i = 0; i < cols; i++) {
            sumcols=0;
            for (int j = 0; j <rows; j++) {
                sumcols=sumcols+arr[i][j];
            }
            System.out.println("Sum of cols"+(i+1)+": "+sumcols);
        }
       
    }
}
