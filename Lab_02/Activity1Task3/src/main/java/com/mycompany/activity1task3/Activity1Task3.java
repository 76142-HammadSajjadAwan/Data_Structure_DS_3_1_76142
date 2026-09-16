/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity1task3;
import java.util.Scanner;
/**
 *
 * @author Hammad Sajjad Awan
 */
public class Activity1Task3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of layers:");
        int layers=sc.nextInt();
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of cols:");
        int cols=sc.nextInt();
        int sum=0;
        int[][][] arr= new int[layers][rows][cols];
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.println("Enter the values for layes: "+(i+1)+"rows: "+(j+1)+"Columns: "+(k+1));
                    arr[i][j][k]=sc.nextInt();
                    sum=sum+arr[i][j][k];
                }
            }
        }    
        for (int i = 0; i < layers; i++) {
            System.out.println("Laye "+(i+1)+": ");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.println(arr[i][j][k]);
                }
                System.out.println("");
            }
        }
        
        int max=arr[0][0][0];
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                  if(arr[i][j][k]>max)
                  {
                      max=arr[i][j][k];
                  }
                }
            }
            System.out.println(" ");
        }
        
        int min=arr[0][0][0];
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                  if(arr[i][j][k]<min)
                  {
                      min=arr[i][j][k];
                  }
                }
            }
            System.out.println(" ");
        }
        
        System.out.println("Sum: "+sum);
        double avg=sum/arr.length;
        System.out.println("Average: "+avg);
        System.out.println("Maximum Value: "+max);
        System.out.println("Minimum Value: "+min);
        
        int sumlayer;
         for (int i = 0; i < layers; i++) {
            sumlayer=0;
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                   sumlayer=sumlayer+arr[i][j][k];
                }
            }
             System.out.println("Sum of Layer"+(i+1)+ ": "+sumlayer);
         }
         System.out.println("Enter the search Value: ");
         int search=sc.nextInt();
         for (int i = 0; i < layers; i++) {
             for (int j = 0; j < rows; j++) {
                 for (int k = 0; k < cols; k++) {
                     if(arr[i][j][k]==search)
                     {
                         System.out.println("Values found: ");
                         System.out.println("Layer: "+(i+1));
                         System.out.println("Row: "+(j+1));
                         System.out.println("Column: "+(k+1));
                     }
                 }
             }
        }
    }
}
